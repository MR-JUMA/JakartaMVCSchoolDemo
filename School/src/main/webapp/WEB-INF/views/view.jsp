<%--<%@ taglib prefix="c" uri=""%>--%>
<%--
  Created by IntelliJ IDEA.
  User: chia
  Date: 13/09/2021
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core"%>
<%@page  isELIgnored="false" %>

<% int index=1; %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
    <th>SN</th>
    <th>Name</th>
    <th>Location</th>
    <th>Action</th>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list">
        <tr>
            <td><%= index %></td>
            <td> <c:out value="${list.name}"/></td>
            <td> <c:out value="${list.location}"/></td>
            <td>
                <a href="school/${list.id}/edit"><button>Details</button></a>
            </td>
        </tr>
        <% index += 1; %>
    </c:forEach>
    </tbody>
</table>

<a href="school/add"><button> Add</button></a>
</body>
</html>
