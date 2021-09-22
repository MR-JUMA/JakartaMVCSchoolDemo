<%--
  Created by IntelliJ IDEA.
  User: chia
  Date: 13/09/2021
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<h1><%= "Relax...Controller worked!!"  %>${name}</h1>--%>


    <form action="save" method="post">

        Name:<input type="text" name="name">
        <br>
        <br>
        Location:<input type="text" name="location">
        <br>
        <br>
        <button type="submit">save</button>

    </form>

</body>
</html>
