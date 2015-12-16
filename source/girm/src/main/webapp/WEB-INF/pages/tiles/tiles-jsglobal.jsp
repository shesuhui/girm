<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<link rel="shortcut icon" type="image/x-icon" href="${ctx}/favicon.ico" />

<script>
	var ROOTPATH ="${ctx}";
</script>
<script type="text/javascript" data-main="${ctx}/javascript/" src="${pageContext.request.contextPath }/javascript/lib/requirejs/require.js" ></script>
<script type="text/javascript" src="${ctx}/javascript/app/require-config.js"></script>

<script type="text/javascript">
	require(['domReady!','setup'], function(doc,setup) {
		setup.init();
	});
</script>