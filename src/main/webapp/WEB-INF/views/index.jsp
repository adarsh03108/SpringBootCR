<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RegistrationApp</title>
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Add your custom CSS styles here -->
    <style>
         *{
            box-sizing: border-box;
            padding: 0px;
            margin: 0px;
        }
        body {
            background-color: #f8f9fa;
            padding: 20px;
        }

        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            animation: fadeIn 0.5s ease-in-out;
        }

        h3 {
            text-align: center;
            margin-bottom: 20px;
        }

        pre {
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        input[type="text"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ced4da;
            border-radius: 4px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
            border: none;
            border-radius: 4px;
            background-color: #007bff;
            color: #ffffff;
            cursor: pointer;
        }

        .message {
            margin-top: 20px;
            text-align: center;
            color: #28a745;
            font-weight: bold;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
            }
            to {
                opacity: 1;
            }
        }
    </style>
</head>
<body>

<form action="saveReg" method="post">
    <h3>Registration Form</h3>
    <pre>
        <input type="text" placeholder="Enter your FirstName" name="firstName"/>
        <input type="text" placeholder="Enter your LastName" name="lastName"/>
        <input type="text" placeholder="Enter your Email" name="email"/>
        <input type="text" placeholder="Enter your Mobile" name="mobile"/>
    </pre>
    <input type="submit" value="Save"/>
</form>
<div class="message">${msg}</div>

<!-- Add Bootstrap JS and Popper.js -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
