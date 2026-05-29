<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style type="text/css">

.error{
color:red;
}

</style>

</head>
<body>

<form:form modelAttribute="studObj" method="post" action="student-create">
	<!--<form:label path="id">Id</form:label>
	<form:input path="id"/> 
	<form:errors path="id" cssClass="error"></form:errors>-->
	
	<form:hidden path="id" value="1"/>
	
	<br>
	
	<form:label path="name">Name</form:label>
	<form:input path="name"/>
	<form:errors path="name" cssClass="error"></form:errors>
	<br>
	
	<form:label path="age">Age</form:label>
	<form:input path="age"/> 
	<form:errors path="age" cssClass="error"></form:errors>
	<br>
	
	<form:label path="password">Password</form:label>
	<form:password path="password"/>
	<!--<form:errors path="password" cssClass="error"></form:errors>-->
	<br>
	
	<form:label path="address">Address</form:label>
	<form:textarea path="address"/>
	<!--<form:errors path="address" cssClass="error"></form:errors>-->
	<br>
	
	<form:label path="newsletter">Newsletter</form:label>
	<form:checkbox path="newsletter"/>
	<br>
	
	<form:label path="frameworks">Frameworks</form:label>
	<form:checkboxes items="${framework_list }" path="frameworks"/>
	<br>
	
	<form:label path="gender">Gender</form:label>
	<form:radiobutton path="gender" value="Male"/> Male
	<form:radiobutton path="gender" value="Female"/> Female
	<br>
	
	<form:label path="favNumber">Favourite Number</form:label>
	<form:radiobuttons path="favNumber" items="${number_list}"/>
	<br>
	
	<form:label path="country">Country</form:label>
	<form:select path="country">
		<form:option value="none">None</form:option>
		<form:options items="${country_list}"/>
	</form:select>
	<br>
	
	<form:label path="skills">Skills</form:label>
	<form:select path="skills" multiple="multiple">
		<form:options items="${skill_list }"/>
	</form:select>
	<br>
	
	<input type="submit" value="create">

</form:form>

</body>
</html>