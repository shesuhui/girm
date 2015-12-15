<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<meta content="width=device-width, initial-scale=1" name="viewport">
<meta content="" name="description">
<meta content="" name="author">

<tiles:getAsString name="title"/>
<title><spring:message code="${title}"/></title>

<link rel="shortcut icon" type="images/ico"
	href="${pageContext.request.contextPath }/images/favicon.ico" />
<tiles:insertAttribute name="resource" />
<tiles:insertAttribute name="jsglobal" />
</head>
<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="topnav" />
	<tiles:insertAttribute name="content" />
	<tiles:insertAttribute name="footer" />
</body>
</html>