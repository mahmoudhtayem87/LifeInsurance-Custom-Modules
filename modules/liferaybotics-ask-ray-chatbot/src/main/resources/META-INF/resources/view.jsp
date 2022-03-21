<%@ include file="/init.jsp" %>
<%
String accessToken = (String) renderRequest.getAttribute("buttonText");
String conversationSession = (String) renderRequest.getAttribute("buttonUrl");
%>

<portlet:resourceURL id="/returnUrl" var="returnUrl">
</portlet:resourceURL>
<button onClick="$( '#<portlet:namespace />' ).toggle('slow');" class="btn btn-primary ray-button" ><clay:icon symbol="quote-left" /></button>
<div class="ray-container" id="<portlet:namespace />"></div>
  
    
<aui:script require="react-apiai@1.0.0">
	reactApiai100.default('<portlet:namespace />', '${returnUrl}', '${accessToken}', '${conversationSession}');
</aui:script>

