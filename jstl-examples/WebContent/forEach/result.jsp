<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"  %>
<html><head><title></title></head><body>
<h1>For Loop in JSTL</h1>
<c:forEach var="i" begin="100" end="102" step="1" varStatus ="status">
${status.count}
${i}<BR>
</c:forEach> </body></html>