<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.*"%>
<%@page import="java.util.ArrayList"%>

<html>
<head>
<title>購入確認</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp"%>
	<h2 style="text-align: center">購入完了</h2>
	<hr
		style="text-align: center; height: 2px; background-color: black; width: 950px">

	<p style="text-align: center">購入しました。</p>
	<p style="text-align: center">お送りしたメールからお支払いの詳細をご確認ください。</p>

	<%
		HttpSession session = request.getSession();
		ArrayList<Cart> cartList = (ArrayList<Cart>)session.getAttribute("cart_list");
	%>

	<table class="order-list" style="margin: auto">


		<tr>
			<th>商品</th>
			<th>個数(サイズ)</th>
			<th>金額</th>
		</tr>

		<%
			for (int i = 0; i < cartList.size(); i++) {
				Cart cartInfo = cartList.get(i);
		%>

		<tr>
			<td><%=cartInfo.getSelectedUni()%></td>

			<td><%=cartInfo.getsSize()%></td>

			<td><%=cartInfo.getmSize()%></td>

			<td><%=cartInfo.getlSize()%></td>

			<td><%=cartInfo.getKidsSize()%></td>

			<td><%=cartInfo.getTotal()%></td>

			<td><%=2000 * cartInfo.getTotal()%></td>



		</tr>

		<%
			}
		%>

	</table>
	<br>
	<% session.invalidate(); %>



	<p style="text-align: center">
		<a
			href="http://localhost:8080/uniform_admin_teamE3/view/buyer/productList.jsp">商品一覧に戻る</a>
	</p>

</body>
</html>
