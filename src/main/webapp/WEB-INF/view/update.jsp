<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- ?? css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- ??js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<form action="/update" method="post">
		<h2>审核记录</h2>
		编号：<input type="text" name="id" value="${company.id }"><br>
		关键字：<input type="text" name="gjz" value="${company.gjz }"><br>
		描述：<input type="text" name="tab" value="${company.tab }"><br>
		公司名称：<input type="text" name="name" value="${company.name }"><br>
		主营产品：<input type="text" name="product" value="${company.product }"><br>
		地址：<input type="text" name="address" value="${company.address }"><br>
		注册资本：<input type="text" name="register" value="${company.register }"><br>
		成立日期：<input type="date" name="datea" value="${company.datea }"><br>
		年检日期：<input type="date" name="yearDatea" value="${company.yearDatea }"><br>
		年检状态：<select><option value="0">-请选择-</option>
			<option value="" ${yearStatus==0?"selected":"" }>未通过</option>
			<option value="" ${yearStatus==1?"selected":"" }>通过</option>
			<option value="" ${yearStatus==2?"selected":"" }>待定</option></select><br>
		备注：<input type="text" name="agains" value="${company.agains }"><br>
		<button type="submit">提交</button>
	</form>
</body>
</html>