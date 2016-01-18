<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html><head><title></title></head><body>
<c:set var="name" value="Bimal" scope="session"/>
User Status: ${name}<BR>
<c:remove var="name"/>
User Status: ${name}<BR>
</body></html>