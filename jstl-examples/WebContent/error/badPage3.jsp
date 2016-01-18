<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html><body>
About to be bad...
<c:catch var="myException"><% int x = 10/0; %></c:catch>
<BR>If you see this, we survived<BR>
<c:if test="${myException != null}">${myException.message}</c:if>
</body></html>