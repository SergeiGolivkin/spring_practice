<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please enter your details</h2>

<br>
<br>

<form:form action = "showDetails" modelAttribute = "employee">

  Name <form:input path="name"/>
  <form:errors path="name"/>
  <br><br>
  Surname <form:input path="surname"/>
  <form:errors path="surname"/>
  <br><br>
  Salary <form:input path="salary"/>
  <form:errors path="salary"/>
  <br><br>
  Department <form:select path="department">
  <form:options items="${employee.departments}"/>
  </form:select>
  <br><br>
  Which car do you want?
  <form:radiobuttons path="carBrand" items="${employee.cars}"/>
  <br><br>
  Foreign Language(s)
  <form:checkboxes path="languages" items="${employee.languageMap}"/>
  <br><br>
  Phone: <form:input path="phoneNumber"/>
  <form:errors path="surname"/>
  <input type="submit" value="ok">
  <br><br>

</form:form>

</body>

</html>