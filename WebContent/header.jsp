<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header Page</title>
</head>
<body bgcolor="cyan">

<form>
<div id="menu">
<style>
nav{
background-color:grey;
height: 50px;
}
nav ul{

}
nav ul li{
list-style-type:none;
width:150px;
float: left
}
</style>
<nav>
<ul>
<li><a href="home.jsp">Home</a></li>
<li><a href="login.jsp">Login</a></li>
<li><a href="edit.jsp">Edit_profile</a></li>
 <li><a href="transfer.jsp">Transfer_money</a></li>
 <li><a href="balance.jsp">Balance_Enquiry</a></li>
 <li><a href="changePassword.jsp">changePassword</a>
 <li><a href="logout">logout</a>
</ul>
</nav>

</div>

</form>
</body>
</html>