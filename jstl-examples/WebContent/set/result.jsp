<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html><head><title></title></head><body>
<c:set var="name" value="Bimal" scope="session"/>
<c:set var="age" value="29" scope="request"/>
<c:set var="topic" value="jstl" scope="application"/>
<c:set var="name" value="Meghna" scope="session"/>
${name}<BR>
${age}<BR>
${topic}<BR>
<!-- MAP -->
<jsp:useBean id="animalMap" class="java.util.HashMap"/>
<c:set target="${animalMap}" property="cat" value="Sylvester"/>
<c:set target="${animalMap}" property="dog" value="Goofy"/>
<c:set target="${animalMap}" property="rat" value="Rat"/>
<c:forEach items="${animalMap}" var="animal">
${animal}<BR>
</c:forEach>
<!-- BEAN -->
<jsp:useBean id = "emp" class = "foo.Employee" scope="request"/>
<c:set target="${emp}" property="name" value="Tom"/>
${emp.name}<BR>
</body></html>