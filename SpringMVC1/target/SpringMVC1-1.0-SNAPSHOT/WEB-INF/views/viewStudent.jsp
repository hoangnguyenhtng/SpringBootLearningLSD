<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 6/21/2023
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>VIEW STUDENTs</title>
</head>
<body>
    <h1>VIEW STUDENT</h1>
    <table>
        <tr>
            <td>Full Name: </td>
            <td>
                ${stu.fullName}
            </td>
        </tr>
        <tr>
            <td>Gender: </td>
            <td>
                ${stu.gender?"Male":"Female"}
            </td>
        </tr>
        <tr>
            <td>Birthday: </td>
            <td>
                ${stu.birthday}
            </td>
        </tr>
        <tr>
            <td>Address: </td>
            <td>
                ${stu.address}
            </td>
        </tr>
    </table>
</body>
</html>
