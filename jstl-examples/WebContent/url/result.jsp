<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html><head><title></title></head><body>
<c:set var="first" value="Bimal Kumar" scope="session"/>
<c:set var="last" value="Jain Bakliwal" scope="session"/>
<c:url value="/abc?first=${first}&last=${last}" var="inputURL" />${inputURL}<BR>
<c:url value="/xyz" var="inputURL">
<c:param name="firstName" value="${first}"/>
<c:param name="lastName" value="${last}"/>
</c:url>${inputURL}
</body></html>