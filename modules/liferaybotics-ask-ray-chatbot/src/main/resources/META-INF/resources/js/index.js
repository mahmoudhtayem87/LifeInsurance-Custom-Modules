import React from 'react';
import ReactDOM from 'react-dom';
import { render } from 'react-dom';
import {Bar} from 'react-chartjs-2';
import {Pie} from 'react-chartjs-2';
import mixpanel from 'mixpanel-browser';

import ApolloClient from 'apollo-boost';
import { ApolloProvider } from 'react-apollo';

import GqlApp from './components/GqlApp.js';



class AiApiConversation extends React.Component {
	constructor(props) {
		super(props);						
		this.state = ({apiAiDataObject: [], value: "", isItVoice: false, link: "", Data: {}, arraySearch: []});	  
		this.handleChange = this.handleChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
		this.recordVoice = this.recordVoice.bind(this);
		this.getLink = this.getLink.bind(this);
		this.renderButton = this.renderButton.bind(this);
		this.renderSearchResults = this.renderSearchResults.bind(this);
		this.getApiAiData(); 	
  }
  
  getApiAiData() {
	  Liferay.Service(
		  '/liferaybotics.apiaidata/get-recent-conversation',
		  {
			  records: 6			  
		  },
		  function(obj) {
			  console.log(obj);
			  if (!obj)
				  return;
			  this.setState({apiAiDataObject: obj});
			  let conversationType = ["Query", "Response"];
				let conversationValueQuery = 0;
				let conversationValueResponse = 0;
				
				this.state.apiAiDataObject.forEach(element => {
					if (element.type == "query") {
						conversationValueQuery = conversationValueQuery + 1;
					
					}
					else
					{
						conversationValueResponse = conversationValueResponse + 1;
					}
				});
				this.setState({ 
					Data: {
					labels: conversationType,
					datasets:[
						{
							label:'Query vs Response Count',
							data: [conversationValueQuery, conversationValueResponse] ,
							backgroundColor:[
							'rgba(255,105,145,0.6)',
							'rgba(155,100,210,0.6)'                      
						]
						}
					]
					}
				});	  
			  }.bind(this)
	  );
  }

  handleChange(event) {
	  	  this.setState({value: event.target.value});
  }

  recordVoice(event) {
		this.setState({isItVoice : true});
		let SpeechRecognition = SpeechRecognition || webkitSpeechRecognition
		let SpeechRecognitionEvent = SpeechRecognitionEvent || webkitSpeechRecognitionEvent
		let recognitionReact = new SpeechRecognition();
		recognitionReact.lang = 'en-UK';
				let synth = window.speechSynthesis;
		let msg = new SpeechSynthesisUtterance();	
		recognitionReact.start();
		recognitionReact.onresult = function(event) {
			var speechResultReact = this.state.value;
			speechResultReact = event.results["0"]["0"].transcript;
			this.setState({value : speechResultReact});
			this.handleSubmit(event);
	  	}.bind(this)
  }

  handleSubmit(event) {
	this.setState({link: ""});	
	this.setState({arraySearch: []});
	let apiAiRequest = ({
		  "query_input": {
			    "text": {
			      "text": this.state.value,
			      "language_code": "en-US"
			    }
			  }
			});
	let apiAiRequestString = JSON.stringify(apiAiRequest);
	let dialogflowUrl = "https://dialogflow.googleapis.com/v2/projects/liferay-onhm/agent/sessions/" + this.props.conversationSession +":detectIntent";
	let dialogflowAccessToken = this.props.accessToken;
	$.ajax({
		url: dialogflowUrl,
		type: "POST",
		contentType: "application/json",
		data: apiAiRequestString,
		beforeSend: function(xhr){xhr.setRequestHeader('Authorization', 'Bearer ' + dialogflowAccessToken);},
		success: function(data) {
			console.log(data);
			Liferay.Service(
				'/liferaybotics.apiaidata/add-api-ai-data-persistence',
				{
					query: data.queryResult.queryText, 
					authtoken: "4304414ee84640ef8267ea82c383d6e9", 
					speech: data.queryResult.fulfillmentMessages["0"].text.text["0"], 
					action: data.queryResult.action, 
					fulfillment: data.queryResult.action, 
					result: data.queryResult.action
				},
				function(obj) {
					this.getApiAiData();					
					if(this.state.isItVoice == true)
						{
							let synth = window.speechSynthesis;
							let msg = new SpeechSynthesisUtterance();
							var voices = synth.getVoices();
							msg.voice = voices.filter(function(voice) { return voice.name == 'Google UK English Male'; })[0];
							msg.text = data.queryResult.fulfillmentMessages["0"].text.text["0"];
							synth.speak(msg);
							
						}
					
					this.setState({isItVoice : false});
					this.setState({value: ""});
					//Sometimes I return a payload from Dialogflow I want to check if that payload exists
					if ( typeof data.queryResult.fulfillmentMessages["1"].payload.redirect !== 'undefined') {									
					this.setState({link: data.queryResult.fulfillmentMessages["1"].payload.redirect});
					}
					else if (typeof data.queryResult.fulfillmentMessages["1"].payload.search !== 'undefined') {
						this.getSearch(data.queryResult.fulfillmentMessages["1"].payload.search);
					}
					else {
					this.getLink(data.queryResult.action);
					}
					}.bind(this)
			)
		
		}.bind(this)
	 })
	 event.preventDefault();
}
  
getSearch(searchPhrase)  {
	let items = [];
	let fields = [];
	let searchObjectArray = [];
	let searchPhraseUse = searchPhrase;
	let groupId = Liferay.ThemeDisplay.getSiteGroupId();
	let headlessApiUrl = Liferay.ThemeDisplay.getPortalURL() + "/o/headless-delivery/v1.0/sites/" + groupId + "/structured-contents?flatten=true&search=" + searchPhraseUse + "&p_auth=" + Liferay.authToken;
	
	$.ajax({
		url: headlessApiUrl,
		type: "GET",
		success: function(data) {			
			items = data.items;
			var i = 0;
			var g = 0;
			for (i = 0; i < items.length; i++) {
				if (i > 2)
				{
					break;
				}
				let searchObject = {title: "", description: "", friendlyUrl: ""};
				fields = items[i].contentFields
				searchObject.friendlyUrl = items[i].friendlyUrlPath;
			    console.log(items[i].friendlyUrlPath);
				for (g = 0; g < fields.length; g++)
					{
						if(fields[g].name == "title" || fields[g].name ==  "Title" || fields[g].name ==  "Question" || fields[g].name ==   "question")
							{
							searchObject.title = fields[g].contentFieldValue.data
							}
						if(fields[g].name == "description" || fields[g].name == "header" || fields[g].name == "ShortAnswer" || fields[g].name == "Header" || fields[g].name == "Description" )
							{
							searchObject.description = fields[g].contentFieldValue.data
							}
					}
				console.log(searchObject);
				searchObjectArray.push(searchObject);	
				console.log(searchObjectArray);
			}
			console.log(searchObjectArray);
			this.setState({arraySearch: searchObjectArray});
					
			
		}.bind(this)
	});
	
}

renderSearchResults() {	
	var urlString = Liferay.ThemeDisplay.getPortalURL() + "/group/liferaybotics/-/";
	return (<div>
	    {this.state.arraySearch.map((search, index) => (
	        <div key={index}>
	        	<h3>{search.title}</h3>
	        	<p><i>{search.description}</i></p>
	        	<a className="btn icon btn-primary" href={urlString + search.friendlyUrl} >Read content...</a>
	        	<br/>&nbsp;
	        	<br/>
	        </div>	        
	    ))}
    </div>);
	
}
  
  
 
getLink(action) { 
	let returnUrlAndVariable = this.props.returnUrl + "&" + this.props.instanceId + "action=" + action;
	$.ajax({
		url: returnUrlAndVariable,
		type: "GET",
		success: function(data) {
			this.setState({link: data});
		}.bind(this)
	});
}

renderButton() {
	if(this.state.link != "") {
		return <a className="btn btn-primary button-custom" href={this.state.link} >Open</a>
	}
	else {
		return <p></p>
	}

}

render() {
	  const endpoint = Liferay.ThemeDisplay.getPortalURL() + '/o/graphql?p_auth=' + Liferay.authToken
	  const client = new ApolloClient({ uri : endpoint });	
	  
	  
	  return (
		<div data-analytics-asset-type="custom"
			  data-analytics-asset-id="Ask Ray React"
			  data-analytics-asset-category="ask-ray-form"
			  data-analytics-asset-title="Ask Ray Form">
		
		
			<form onSubmit={this.handleSubmit}>
				<div>
					{this.state.apiAiDataObject.map(apiAiDataObjects => (
					<div className={apiAiDataObjects.type == "query" ? "conversation-query" : "conversation-response"} 
					key={apiAiDataObjects.apiAiDataId}><b>{apiAiDataObjects.type == "query" ? "You said..." : "Ray said..."}</b><br/>{apiAiDataObjects.speech}</div>
					))}		
					<this.renderButton/>
					<this.renderSearchResults/>	
					<div><input className="field form-control" onChange={this.handleChange} name="ai-query" type="text" value={this.state.value}/>
					</div>
					<br/>
					<div><button className="btn icon btn-primary" value="submit" name="go" type="submit">Go</button>&nbsp;<button className="btn icon btn-primary" onClick={this.recordVoice}  name="micbutton" type="text" value="Speak">Speak</button>
					</div>
					<br/>
				</div>
			</form>
		</div>		  
	  );
	}
}

export default function(elementId, returnUrl, accessToken, conversationSession) {
		ReactDOM.render(<AiApiConversation returnUrl={returnUrl} instanceId={elementId} conversationSession={conversationSession} accessToken={accessToken} />, document.getElementById(elementId));
}


