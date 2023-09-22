<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 6/22/2023
  Time: 5:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .center{
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        .colorRed{
            color:red;
        }
    </style>
</head>
<body>
<div class="center">
    <h1>Next View Page!</h1>
    <table>
        <tr>
            <td>Student Id:</td>
            <td>
                ${s.id}
            </td>
        </tr>
        <tr>
            <td>Student Name:</td>
            <td>
                ${s.name}
            </td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>
                ${s.gender?"Male":"Female"}
            </td>
        </tr>
        <tr>
            <td>Birthday:</td>
            <td>
                ${s.birthday}
            </td>
        </tr>
        <tr>
            <td>Address:</td>
            <td>
                ${s.address}
            </td>
        </tr>
        <tr>
            <td>Class Name:</td>
            <td>
                ${s.className}
            </td>
        </tr>
    </table>
    <a href="initFormStudent">Back</a>
</div>
</body>
</html>
