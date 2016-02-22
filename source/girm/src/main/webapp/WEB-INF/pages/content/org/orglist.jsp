<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<div class="container-fluid">
	<div class="row">
		<div class="col-sm-3 col-md-2 sidebar">
			<div id='tree'></div>
		</div>
		<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Dashboard</h1>
			<div class="row placeholders">
				<h2 class="sub-header">Section title</h2>
				<div class="table-responsive"></div>
			</div>
		</div>
	</div>
</div>

<script src="${ctx}/javascript/app/org/orglist.js"></script>