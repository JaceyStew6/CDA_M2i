<%@ page import="org.example.exercice1.Person" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2024
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="persons" type="java.util.ArrayList<org.example.exercice1.Person>" scope="request"/>

<html>
<head>
    <title>Liste de personnes</title>
</head>
<body>

<% for (Person p : persons) { %>
<%--<ul>
    <li><%= p.getLastName() %></li>
    <li><%= p.getFirstName() %></li>
    <li><%= p.getAge() %></li>
</ul>--%>


<tbody>
<tr>
    <td><%= p.getLastName() %></td>
    <td><%= p.getFirstName() %></td>
    <td><%= p.getAge() %></td>
</tr>
</tbody>


<%}%>


</body>
</html>
