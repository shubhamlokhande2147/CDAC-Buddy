<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
  <h2>Employee Table</h2>            
  <table class="table table-dark table-striped">
    <thead>
      <tr>
        <th>Employee Id</th>
        <th>Employee Name</th>
        <th>Employee Salary</th>
        <th>Actions</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach var="emp" items="${list}">
     <tr>
     <td>${emp.eid}</td>
     <td>${emp.ename}</td>
     <td>${emp.sal} </td>
     <td>
     <a href="FindEmployee?eid=${emp.eid}">edit</a>
    <a href="deleteemp?eid=${emp.eid}">delete</a>
    </td>
     </c:forEach>
    </tbody>
  </table>
 <a href="addemp.jsp">Add new Employee</a>
</div>

</body>
</html>