<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 6/22/2023
  Time: 4:59 AM
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
    <a href="initFormStudent">Back</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="nextView">Next View</a>
</div>
</body>
</html>
