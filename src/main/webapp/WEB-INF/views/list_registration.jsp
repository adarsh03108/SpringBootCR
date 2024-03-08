<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registrations List</title>
    <!-- Add Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
    <!-- Add your custom CSS styles here -->
    <style>
        body {
            padding: 20px;
        }

        .table-container {
            overflow-x: auto;
        }

        th, td {
            white-space: nowrap;
        }

        @media (max-width: 576px) {
            th, td {
                white-space: normal;
            }
        }
    </style>
</head>
<body>

<div class="container table-container">
<div class="row">
<h1>List Students</h1>
</div>

    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
            <tr>
                <th>FirstName</th>
                <th>LastName</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Delete</th>
                <th>Update</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="reg" items="${registrations}">
                <tr>
                    <td>${reg.firstName}</td>
                    <td>${reg.lastName}</td>
                    <td>${reg.email}</td>
                    <td>${reg.mobile}</td>
                    <td><a href="delete?id=${reg.id}" class="btn btn-danger">Delete</a></td>
                    <td><a href="getRegistrationById?id=${reg.id}" class="btn btn-primary">Update</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<!-- Add Bootstrap JS CDN if needed -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
