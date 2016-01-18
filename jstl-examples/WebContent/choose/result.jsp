<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html><head><title></title></head><body>
<c:choose> 
<c:when test = "${param.color == 'Blue'}">
Try Virgin Mary </c:when>
<c:when test = "${param.color == 'Red'}">
Try Rose </c:when>
<c:otherwise> Try Anything </c:otherwise> 
</c:choose>
</body></html>