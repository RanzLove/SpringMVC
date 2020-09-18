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
<a>进去个人页面</a>


<table>
    <thead>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>userName</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="bean" items="${list}">
           <tr>
               <th>${bean.id}</th>
               <th>${bean.name}</th>
               <th>${bean.age}</th>
               <th>${bean.userName}</th>
           </tr>
        </c:forEach>
    </tbody>

</table>
</body>
</html>
