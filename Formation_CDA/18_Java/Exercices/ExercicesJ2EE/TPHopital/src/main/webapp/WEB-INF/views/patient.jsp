<%--
  Created by IntelliJ IDEA.
  User: rpouc
  Date: 21/06/2024
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="patient" type="org.example.tphopital.model.Patient" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="/WEB-INF/bootstrapimports.html" %>
    <title>Patient <%= patient.getPatientId() %></title>
</head>
<body>
<div class="container d-flex flex-column justify-content-center h-100 w-50">
    <center>
        <div class="card" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title"><%= patient.getLastName() %></h5>
                <p class="card-text"><%= patient.getFirstName() %></p>
            </div>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">Birthdate: <%= patient.getBirthDate() %></li>
                <li class="list-group-item"><%= patient.getConsultations() %></li>
            </ul>
            <div class="card-body">
                <a href="list" class="btn btn-primary">Retour</a>
                <a href="consultation" class="btn btn-primary">Ajouter consultation</a>
                <a href="delete?id=<%= patient.getPatientId() %>" class="btn btn-danger">Delete</a>
            </div>

        </div>
    </center>
</div>

</body>
</html>