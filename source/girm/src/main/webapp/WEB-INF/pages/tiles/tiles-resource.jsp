<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>

<link rel="shortcut icon" type="image/x-icon" href="<%=basePath%>/favicon.ico" />
<!-- Bootstrap -->
<link href="<%=basePath%>/css/bootstrap.min.css" rel="stylesheet"
	media="screen" />
<link
	href="<%=basePath%>/javascript/lib/bootstrapValid/bootstrapValidator.min.css"
	rel="stylesheet" media="screen" />
<link rel="StyleSheet" href="<%=basePath%>/css/girm-template.css" type="text/css"
	media="screen" />



