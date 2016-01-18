<html><body><CENTER>
Request param name is: ${param.name}  <br> 
Request param empID is: ${param.empID}  <br> 
Request param food is: ${param.food}  <br>
First food request param: ${paramValues.food[0]}  <br> 
Second food request param: ${paramValues.food[1]}  <br>
Request param name: ${paramValues.name[0]}<br>
Host is: ${header["host"]} <br>
Method is: ${pageContext.request.method}<br>
email is: ${initParam.mainEmail}
</CENTER></body></html>