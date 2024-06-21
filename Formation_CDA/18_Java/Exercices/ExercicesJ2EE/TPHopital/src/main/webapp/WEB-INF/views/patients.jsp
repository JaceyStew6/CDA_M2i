<%@ page import="org.example.tphopital.model.Patient" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 20/06/2024
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="patients" type="java.util.ArrayList<org.example.tphopital.model.Patient>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/WEB-INF/bootstrapimports.html" %>
    <title>Liste des Patients</title>
</head>
<body>

<div class="container mt-4">
    <table class="table table-dark text-center">
        <h2>Liste des patients</h2>
        <tr>
            <th>Id</th>
            <th>Lastname</th>
            <th>Firstname</th>
            <th>Birthdate</th>
            <th>Picture</th>
            <th>Actions</th>

        </tr>
        <% for (Patient p : patients) {%>
        <tr>
            <th><%= p.getPatientId() %></th>
            <th><%= p.getLastName() %></th>
            <th><%= p.getFirstName() %></th>
            <th><%= p.getBirthDate() %></th>
            <th></th>

            <th>
                <a href="new?id=<%= p.getPatientId() %>" class="btn btn-info">Edit</a>
                <a href="delete?id=<%= p.getPatientId() %>" class="btn btn-danger">Delete</a>
                <a href="details?id=<%= p.getPatientId() %>" class="btn btn-primary">Detail</a>
            </th>
        </tr>
        <% }%>
    </table>

    <div>
        <a href="new">Ajouter un patient</a>
    </div>

</div>

</body>
</html>
