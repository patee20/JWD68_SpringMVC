<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Student Information</h3>

Id : ${studObj.id } <br>
Name : ${studObj.name } <br>
Age : ${studObj.age } <br>
Password : ${studObj.password } <br>
Address : ${studObj.address } <br>
Newsletter : ${studObj.newsletter } <br>
Frameworks : 

<c:forEach items="${studObj.frameworks}" var="frame">
<p>${frame}</p>
</c:forEach>

Gender : ${studObj.gender} <br>

Favourite Numbers : ${studObj.favNumber } <br>

Country : ${studObj.country } <br>

Skills : 
<c:forEach items="${studObj.skills}" var="skill">
<p>${skill }</p>
</c:forEach>

</body>
</html>