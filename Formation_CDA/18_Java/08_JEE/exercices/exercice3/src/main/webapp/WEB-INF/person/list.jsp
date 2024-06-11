<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2024
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="persons" type="java.util.ArrayList<org.example.exercice3.model.Person>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <title>Liste Personnes</title>
</head>
<body>
<main class="container">
    <div class="row my-3">
        <div class="col-8 offset-2 text-bg-dark rounded p-3">
            <h1 class="fw-light">- Liste de Personnes -</h1>
            <hr>
            <table class="table table-dark text-center align-middle">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Prenom</th>
                    <th>Nom</th>
                    <th>Age</th>
                </tr>
                </thead>
                <tbody>
                <% for (int i = 0; i < persons.size();i++) { %>
                    <tr>
                        <td><%= i+1 %></td>
                        <td><%= persons.get(i).getFirstName() %></td>
                        <td><%= persons.get(i).getLastName() %></td>
                        <td><%= persons.get(i).getAge() %></td>
                    </tr>
                <% } %>
                </tbody>
            </table>
        </div>
    </div>
</main>
</body>
</html>
