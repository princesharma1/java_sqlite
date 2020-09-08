<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.util.Constants"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Project</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()+Constants.PROJECT_ASSETS%>/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()+Constants.PROJECT_ASSETS%>/css/main.css" />

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#"><%=Constants.PROJECT_NAME %></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${pageContext.request.contextPath}/views/projects">Dashboard</a>
      </li>
      <!-- <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>   
      </li> -->
    </ul>
  </div>
</nav>