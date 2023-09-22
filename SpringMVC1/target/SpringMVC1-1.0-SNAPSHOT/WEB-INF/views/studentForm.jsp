<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 6/21/2023
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Insert Student's Data</title>
  </head>
<body>
  <form:form action="insertStudent" modelAttribute="stu"/>
  <table>
    <tr>
      <td>Full Name: </td>
      <td>
        <form:input path="fullName"/>
      </td>
    </tr>
    <tr>
      <td>Gender: </td>
      <td>
        <form:radiobutton path="gender" value="true" label="Male"/>
        <form:radiobutton path="gender" value="false" label="Female"/>
      </td>
    </tr>
    <tr>
      <td>Birthday: </td>
      <td>
        <form:input type="date" path="birthday"/>
      </td>
    </tr>
    <tr>
      <td>Address: </td>
      <td>
        <form:input type="text" path="address"/>
      </td>
    </tr>
  </table>
</body>
</html>