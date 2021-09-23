<%--
  Created by IntelliJ IDEA.
  User: Chacha
  Date: 22/09/2021
  Time: 09:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${mvc.basePath}/school/${form.id}/update" method="post">

        Name:<input type="text" name="name" value="${form.name}">
            <br>
            <br>
        Location:<input type="text" name="location" value="${form.location}">
            <br>
            <br>
        <button type="submit">Update</button>

   </form>

    <form action="${mvc.basePath}/school/${form.id}/delete" method="post">
        <button type="submit">delete</button>
    </form>

    <a href="${mvc.basePath}/school"><button>Back</button></a>


</body>
</html>
