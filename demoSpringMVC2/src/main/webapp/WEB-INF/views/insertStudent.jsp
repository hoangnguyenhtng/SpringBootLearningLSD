<%--
  Created by IntelliJ IDEA.
  User: hoang
  Date: 6/22/2023
  Time: 4:53 AM
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
<form:form action="insertStudent" modelAttribute="s" method="post">
    <table>
    <tr>
    <td>Student Id:</td>
    <td>
    <form:input path="stuId"/><br/>
    <form:errors cssClass="colorRed" path="id"></form:errors>
    </td>
    </tr>
    <tr>
    <td>Student Name:</td>
    <td>
    <form:input path="fullName"/><br/>
    <form:errors cssClass="colorRed" path="name"></form:errors>
    </td>
    </tr>
    <tr>
    <td>Gender:</td>
    <td>
    <form:radiobutton path="gender" value="true"/>Male
    <form:radiobutton path="gender" value="false"/>Female<br/>
    <form:errors cssClass="colorRed" path="gender"></form:errors>
    </td>
    </tr>
        <tr>
            <td>Birthday:</td>
            <td>
                <form:input path="birthday" type="date"/><br/>
                <form:errors cssClass="colorRed" path="birthday"></form:errors>
            </td>
        </tr>
        <tr>
            <td>Address:</td>
            <td>
                <form:textarea path="address"/><br/>
                <form:errors cssClass="colorRed" path="address"></form:errors>
            </td>
        </tr>
        <tr>
            <td>Class Name:</td>
            <td>
                <form:select path="className">
                    <form:option value="">---Choose---</form:option>
                    <form:option value="C1902LM">C1902LM</form:option>
                    <form:option value="C1905LM">C1905LM</form:option>
                    <form:option value="C1907LM">C1907LM</form:option>
                    <form:option value="C1910LM">C1910LM</form:option>
                    <form:option value="C1912LM">C1912LM</form:option>
                    <form:option value="JW2002LM">JW2002LM</form:option>
                    <form:option value="JW2004LM">JW2004LM</form:option>
                    <form:option value="JW2006LM">JW2006LM</form:option>
                </form:select><br/>

                <form:errors cssClass="colorRed" path="className"></form:errors>

            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="Insert"/>
                <input type="reset" value="Clear"/>
            </td>
        </tr>
    </table>
</form:form>
</div>
</body>
</html>
