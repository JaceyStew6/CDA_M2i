<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 11/06/2024
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire Chien</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/dogs">
    <div>
        <label for="name">  Name :</label>
        <input type="text" name="name" id="name">
    </div>
    <div>
        <label for="breed">  Breed :</label>
        <input type="text" name="breed" id="breed">
    </div>
    <div>
        <label for="favoriteMeal">  Favorite Meal :</label>
        <input type="text" name="favoriteMeal" id="favoriteMeal">
    </div>
    <div>
        <label for="birthDate">  Birthdate :</label>
        <input type="date" name="birthDate" id="birthDate">
    </div>

    <button>Add dog</button>
</form>
<div>
    <h1>Liste de chiens</h1>

</div>
</body>
</html>
