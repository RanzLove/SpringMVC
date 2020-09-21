<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JFlying
  Date: 2020/9/16
  Time: 5:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a>进入新增页面</a>


<table>

    <form action="${pageContext.request.contextPath}/sysUser/addSysUser" enctype="multipart/form-data" method="post" >

        <label>姓名</label>
        <input type="text" name="name" >
        <label>年龄</label>
        <input type="text" name="age" >
        <label>用户名</label>
        <input type="text" name="userName" >
        <input type="file" name="file">
        <input type="submit" value="提交" >


    </form>

</table>
</body>
</html>
