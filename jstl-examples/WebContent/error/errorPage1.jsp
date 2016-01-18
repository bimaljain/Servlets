<%@ page isErrorPage="true" %>
<html><body>
<strong>We just survived</strong><BR>
${pageContext.exception}<BR>
<%= exception.getStackTrace() %>
</body></html>