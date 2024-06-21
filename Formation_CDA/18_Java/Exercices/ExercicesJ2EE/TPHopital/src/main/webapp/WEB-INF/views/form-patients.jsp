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
    <title>Ajout d'un patient</title>
</head>
<body>
<div class="container mt-4">
    <% if (patient.getPatientId() > 0) {%>
    <h2>Modifier un patient</h2>
    <% } else {%>
    <h2>Ajouter un patient</h2>
    <% }%>
    <div>
        <form action="<%= (patient.getPatientId() > 0) ? "update?id="+patient.getPatientId() : "insert" %>" method="post" >
            <div class="form-row">

                <div class="form-group col-md-6">
                    <label for="inputEmail4">Name</label>
                    <input type="text" class="form-control" id="inputEmail4" name="lastname" value="<%=
                    (patient.getPatientId() > 0) ? patient.getLastName() : "" %>" >
                </div>
                <div class="form-group col-md-6">
                    <label for="inputPassword4">Firstname</label>
                    <input type="text" class="form-control" id="inputPassword4" name="firstname" value="<%=
                    (patient.getPatientId() > 0) ? patient.getFirstName() : "" %>"  >
                </div>
            </div>
            <div class="form-row">
                <div class="form-group col-md-4">
                    <label for="inputAddress">Birthdate</label>
                    <input type="date" class="form-control" id="inputAddress" placeholder="12" name="birthdate" value="<%=
                    (patient.getPatientId() > 0) ? patient.getBirthDate() : "" %>"  >
                </div>
            </div>
            <% if (patient.getPatientId() > 0) {%>
            <button type="submit" class="btn btn-primary">Modifier</button>
            <% } else {%>
            <button type="submit" class="btn btn-primary">Ajouter</button>
            <% }%>

            <a href="list" class="btn btn-primary">Annuler</a>
        </form>
    </div>
</div>

</body>
</html>
