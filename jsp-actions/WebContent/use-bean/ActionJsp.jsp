<%@ page import="foo.*"%>
<html><body><CENTER>
<jsp:useBean id = "emp" class = "foo.Employee" scope="request"> 
<jsp:setProperty name = "emp" property = "*" />
</jsp:useBean>
Name of the Employee: <jsp:getProperty name = "emp"  property = "name" /><BR>
ID of the Employee: <jsp:getProperty name = "emp"  property = "empID" />
</CENTER></body></html>