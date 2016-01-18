<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html><head><title></title></head><body>
<c:if test="${param.color eq 'Blue'}">
<%= "Try Virgin Mary" %>
</c:if>
<c:if test="${param.color eq 'Red'}">
<%= "Try Rose" %>
</c:if>
<c:if test="${param.color eq 'Orange'}">
<%= "Try Frooty" %>
</c:if>
<c:if test="${param.color eq 'Black'}">
<%= "Try Coca Cola" %>
</c:if>
</body></html>