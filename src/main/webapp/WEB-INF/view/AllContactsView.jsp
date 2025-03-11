<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Formulaire</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">


                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="AddContact">Add Contact</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="AllContacts">All Contacts</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Last name" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<c:if test="${not empty successMessage}">
    <div class="alert alert-success">
        <p><c:out value="${successMessage}" /></p>
    </div>
</c:if>


<c:if test="${not empty errorMessage}">
    <div class="alert alert-danger">
        <p><c:out value="${errorMessage}" /></p>
    </div>
</c:if>
<div class="container mt-5">
    <h2>All Contacts</h2>


    <table class="table table-striped">
        <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Gender</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
       <c:forEach var="person" items="${persons}">
            <tr>
                <td>${person.firstName}</td>
                <td>${person.lastName}</td>
                <td>${person.email}</td>
                <td>${person.phone}</td>
                <td>${person.address}</td>
                <td>${person.gender}</td>
                <td>
                    <a class="btn btn-danger" href="${pageContext.request.contextPath}/Delete/${person.id}" role="button">Delete</a>
                    <a class="btn btn-warning" href="${pageContext.request.contextPath}/Update/${person.id}" role="button">Update</a>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
