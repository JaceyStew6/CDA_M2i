<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2024
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="cats" type="java.util.ArrayList<org.example.exercice4.model.Cat>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <title>Chats</title>
</head>
<body>

<main class="container">
    <div class="row my-3">
        <div class="col-8 offset-2 text-bg-dark rounded p-3">
            <h1 class="fw-light">- Liste de Chats -</h1>
            <hr>
            <% if (!cats.isEmpty()) { %>
            <table class="table table-dark text-center align-middle">
                <thead>
                <tr>
                    <th>#</th>
                    <th>nom</th>
                    <th>race</th>
                    <th>plat favoris</th>
                    <th>date de naissance</th>
                </tr>
                </thead>
                <tbody>
                <% for (int i = 0; i < cats.size();i++) { %>
                <tr>
                    <td><%= i+1 %></td>
                    <td><%= cats.get(i).getName() %></td>
                    <td><%= cats.get(i).getBreed() %></td>
                    <td><%= cats.get(i).getFavMeal() %></td>
                    <td><%= cats.get(i).getDateOfBirth().getDayOfMonth()+"/"+cats.get(i).getDateOfBirth().getMonthValue()+"/"+cats.get(i).getDateOfBirth().getYear() %></td>

                </tr>
                <% } %>
                </tbody>
            </table>
            <% } else { %>
            <p>Vous n'avez aucun chat !!!!</p>
            <% }  %>
        </div>
    </div>
    <div class="col-8 offset-2 rounded text-bg-dark p-3">
    <form method="post" action="${pageContext.request.contextPath}/cats">
        <div class="mb-3">
            <label for="name" class="form-label">Nom :</label>
            <input type="text" class="form-control" name="name" id="name" required>
        </div>
        <div class="mb-3">
            <label for="breed" class="form-label">Race :</label>
            <input type="text" class="form-control" name="breed" id="breed" required>
        </div>
        <div class="mb-3">
            <label for="favMeal" class="form-label">Plat favoris :</label>
            <input type="text" class="form-control" name="favMeal" id="favMeal" required>
        </div>
        <div class="mb-3">
            <label for="dateOfBirth" class="form-label">Date de naissance :</label>
            <input type="date" class="form-control" name="dateOfBirth" id="dateOfBirth" required>
        </div>

        <button class="text-end">Ajouter</button>
    </form>
    </div>
</main>


</body>
</html>
