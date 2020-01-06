<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- ?? css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- ??js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">

	function goPage(page) {
		location = "/selects?page="+page+"&"+("form").serialize();
	}
</script>
</head>
<body>
	<div>
		<form action="/selects" method="post">
			关键字：<input type="text" name="gjz" value="${vo.gjz }">
			描述：<input type="text" name="tab" value="${vo.tab }">
			id：<input type="text" name="id" value="${vo.id }">
			公司名称：<input type="text" name="name" value="${vo.name }">
			主营产品：<input type="text" name="product" value="${vo.product }">
			地址：<input type="text" name="address" value="${vo.address }">
			注册资本：<input type="text" name="register1" value="${vo.register1 }">-<input type="text" name="register2" value="${vo.register2 }">
			成立时间：<input type="text" name="datea1" value="${vo.datea1 }">-<input type="text" name="datea2" value="${vo.datea2 }">
			年检日期：<input type="text" name="yearDatea1" value="${vo.yearDatea1 }">-<input type="text" name="yearDatea2" value="${vo.yearDatea2 }">
			<%-- 年检状态：<select>
						<option value="0">-请选择-</option>
						<option value="" ${yearStatus==0?"selected":"" }>未通过</option>
						<option value="" ${yearStatus==1?"selected":"" }>通过</option>
						<option value="" ${yearStatus==2?"selected":"" }>待定</option>
					</select> --%>
			<button type="submit">查询</button>
		</form>
	</div>
	<table>
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本（万元）</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${Info.list }" var="c">
			<tr>
				<td>${c.id }</td>
				<td>${c.gjz }</td>
				<td>${c.tab }</td>
				<td>${c.name }</td>
				<td>${c.product }</td>
				<td>${c.address }</td>
				<td>${c.register }</td>
				<td>${c.datea }</td>
				<td>${c.yearDatea }</td>
				<td>${c.yearStatus }</td>
				<td>${c.agains }</td>
				<td>
					<a href="toUpdate.do?id=${c.id }"><input type="button" value="年检审核"></a>
				</td>
			</tr>
		</c:forEach>
		<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
	</table>
</body>
</html>