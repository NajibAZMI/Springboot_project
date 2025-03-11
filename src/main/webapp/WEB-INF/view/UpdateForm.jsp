<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Update Contact</title>
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

<!-- Affichage du message d'erreur -->
<c:if test="${not empty errorMessage}">
    <div class="alert alert-danger">
        <p><c:out value="${errorMessage}" /></p>
    </div>
</c:if>
<div class="container mt-5">
  <h2>Update Contact</h2>
  <form action="${pageContext.request.contextPath}/Update/${person.id}" method="post">
    <input type="hidden" name="id" value="${person.id}">

    <div class="mb-3">
      <label>First Name</label>
      <input type="text" class="form-control" name="firstName" value="${person.firstName}" required>
    </div>

    <div class="mb-3">
      <label>Last Name</label>
      <input type="text" class="form-control" name="lastName" value="${person.lastName}" required>
    </div>

    <div class="mb-3">
      <label>Email</label>
      <input type="email" class="form-control" name="email" value="${person.email}" required>
    </div>

    <div class="mb-3">
      <label>Phone</label>
      <input type="text" class="form-control" name="phone" value="${person.phone}" required>
    </div>

    <div class="mb-3">
      <label>Address</label>
      <input type="text" class="form-control" name="address" value="${person.address}" required>
    </div>

    <div class="mb-3">
      <label>Gender</label>
      <select class="form-control" name="gender">
        <option value="Male" ${person.gender == 'Male' ? 'selected' : ''}>Male</option>
        <option value="Female" ${person.gender == 'Female' ? 'selected' : ''}>Female</option>
      </select>
    </div>

    <button type="submit" class="btn btn-success">Update</button>
    <a href="${pageContext.request.contextPath}/AllContacts" class="btn btn-secondary">Cancel</a>
  </form>
</div>
</body>
</html>
