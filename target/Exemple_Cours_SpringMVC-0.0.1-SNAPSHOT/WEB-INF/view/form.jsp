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
    <h2>New contact</h2>

    <form method="POST" action="AddContact">
        <div class="row">
            <div class="col-md-4">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" name="firstName" class="form-control" id="firstName">
            </div>
            <div class="col-md-4">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" name="lastName" class="form-control" id="lastName">
            </div>
            <div class="col-md-4">
                <label for="phone" class="form-label">Phone number</label>
                <input type="text" name="phone" class="form-control" id="phone">
            </div>
        </div>


        <div class="row mt-3">
            <div class="col-md-4">
                <label for="email" class="form-label">Email</label>
                <input type="email" name="email" class="form-control" id="email">
            </div>
            <div class="col-md-4">
                <label for="address" class="form-label">Address</label>
                <input type="text" name="address" class="form-control" id="address">
            </div>
            <div class="col-md-3">
            <label class="form-label">Genre</label>
            <div class="d-flex">
                <div class="form-check me-2">
                    <input class="form-check-input" type="radio" name="gender" id="male" value="Male" >
                    <label class="form-check-label" for="male">Male</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="gender" id="female" value="Female">
                    <label class="form-check-label" for="female">female</label>
                </div>
            </div>
        </div>
        </div>

        <div class="row mt-4">
            <div class="col-md-12 text-end">
                <button type="submit" class="btn btn-primary">Send</button>
                <button type="reset" class="btn btn-secondary">Reset</button>
            </div>
        </div>
    </form>

</div>
</body>
</html>
