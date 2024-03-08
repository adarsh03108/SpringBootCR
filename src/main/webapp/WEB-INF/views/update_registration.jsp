<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Update Registration</title>
    <!-- Add Tailwind CSS -->
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
 
    <style>
        *{
            box-sizing: border-box;
            padding: 0px;
            margin: 0px;
        }
        body {
            background-color: #f8f9fa;
            padding: 20px;
            font-family: sans-serif;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        h3 {
            font-size: 1.5rem;
            margin-bottom: 20px;
            color: #007bff;
        }

        pre {
            white-space: pre-wrap;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ced4da;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #ffffff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container-fluid">
    <form action="updateReg" method="post">
        <h3>Update This</h3>
        <input type="hidden" name="id" value="${reg.id}" />
        <input type="text" name="firstName" value="${reg.firstName}" placeholder="First Name" />
        <input type="text" name="lastName" value="${reg.lastName}" placeholder="Last Name" />
        <input type="email" name="email" value="${reg.email}" placeholder="Email" />
        <input type="text" name="mobile" value="${reg.mobile}" placeholder="Mobile" />
        <input type="submit" value="Update" />
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
