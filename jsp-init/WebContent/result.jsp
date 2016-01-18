<HTML><HEAD><TITLE></TITLE></HEAD><BODY><CENTER>
<H1>Test Init Parameters</H1>
Email ID from Config: <%= config.getInitParameter("email") %><BR>
Email ID from Context: <%= application.getInitParameter("email2") %><BR>
<H1>Test Scope Attributes</H1>
<%-- web.xml file is not required for the rest of the code --%>
<% application.setAttribute("appAttribute", "appAttribute"); %>
<% request.setAttribute("reqAttribute", "reqAttribute"); %>
<% session.setAttribute("sesAttribute", "sesAttribute"); %>
<% pageContext.setAttribute("pagAttribute", "pagAttribute"); %>

<%-- Using the pageContext to get a OTHER-scoped attribute --%>
<%= pageContext.getAttribute("appAttribute", PageContext.APPLICATION_SCOPE) %><BR>
<%= pageContext.getAttribute("reqAttribute", PageContext.REQUEST_SCOPE) %><BR>
<%= pageContext.getAttribute("sesAttribute", PageContext.SESSION_SCOPE) %><BR>
<%= pageContext.getAttribute("pagAttribute")%><BR>

<%-- Using the pageContext to set a session-scoped attribute --%>
<% Float two = new Float(22.4); %>
<% pageContext.setAttribute("foo", two, PageContext.SESSION_SCOPE); %>
<%= pageContext.getAttribute("foo", PageContext.SESSION_SCOPE) %><BR>

<%-- Using the pageContext to find an attribute when you dont know the scope --%>
<%= pageContext.findAttribute("reqAttribute")%><BR>
</CENTER></BODY></HTML>