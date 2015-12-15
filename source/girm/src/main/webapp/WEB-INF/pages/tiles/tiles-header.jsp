<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="container" id="top">
	<nav class="navbar  navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid navbar-inner">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand navbar-brand-active" href="#"> <img
					alt="资源目录"
					src="${pageContext.request.contextPath }/images/favicon.png">
				</a> <a class="navbar-brand  navbar-brand-active" href="/"><spring:message
						code="web.title" /></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar">
				<ul class="nav navbar-nav " role="tablist" id="menuUl">
					<li role="presentation" id="menuSearchGoods"><a
						href="<%=request.getContextPath()%>/buyer/index.do" target="_self">钻石选购</a>
					</li>
					<li role="presentation" id="menuMyOrder"><a id="btnMyOrder"
						href="/buyer/myOrder.do">我的订单 </a></li>
					<li role="presentation" id="menuDiamond"><a
						href="<%=request.getContextPath()%>/diamond/index.do"
						target="_self">钻石管理</a></li>
					<li role="presentation" id="menuOrder"><a
						href="<%=request.getContextPath()%>/order/index.do" target="_self">订单管理</a>
					</li>
					<li role="presentation" id="menuSupplier"><a
						href="<%=request.getContextPath()%>/supplier/index.do"
						target="_self">供应商管理</a></li>
					<li role="presentation" id="menuSystemParam"><a
						href="<%=request.getContextPath()%>/systemParam/index.do"
						target="_self">系统参数管理</a></li>
					<li role="presentation" id="menuUser"><a
						href="<%=request.getContextPath()%>/user/index.do" target="_self">用户管理</a>
					</li>

					<li role="presentation" id="menuAccount" class="dropdown"><a
						href="javascript:;">个人账户管理<span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<%=request.getContextPath()%>/user/editSelf.do">个人资料维护</a></li>
							<li><a
								href="<%=request.getContextPath()%>/user/toModifyMyPwd.do">
									修改密码</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li>
						<p class="navbar-text" style="color: #fff;">
							<strong>欢迎您 ${login_user.name}</strong>
						</p>
					</li>
				</ul>
			</div>
		</div>
		<!--fluid-->
	</nav>
</div>