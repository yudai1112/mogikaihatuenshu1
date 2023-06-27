<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.*"%>
<%
ArrayList<Uniform> uniform_list = (ArrayList<Uniform>)request.getAttribute("uniform_list");
%>
<html>
<head>
<title>商品一覧</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp"%>
	<h2 style="text-align: center">商品一覧</h2>
	<hr
		style="text-align: center; height: 2px; background-color: black;">
	<table style="margin: auto" class="product-table">
		<!-- 商品一覧テーブル -->
		<tr>
			<th>イメージ</th>
			<th>商品名</th>
			<th>価格</th>
			<th>サイズ展開</th>
		</tr>

		<!-- 後ほどDB作成後に繰り返し処理-->
		<%
		if (uniform_list != null) {
			for (int i = 0; i < uniform_list.size() ; i++) {
				Uniform uni = (Uniform) uniform_list.get(i);
				if(i%4 == 0){


			%>
		<tr>
			<td><img src="<%=request.getContextPath()%>/img/<%=uni.getImage()%>"></td>
			<td><%=uni.getName()%></td>
			<td><%=uni.getPrice()%></td>
			<td>S,M,L,子供用</td>
		</tr>
		<%
				}else{

				}
			}
		}
		%>
	</table>
	<p style="text-align: center">
		<a href="http://localhost:8080/uniform_admin_teamE3/view/buyer/orderForm.jsp">注文する</a>
	</p>
	<br>
	<a href="ろぐいんがめんURL">管理者ログイン</a>
	<br>
	<!-- フッター部分 -->
	<%@ include file="/common/footer.jsp"%>
</body>
</html>