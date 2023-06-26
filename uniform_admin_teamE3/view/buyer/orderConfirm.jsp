<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Customer"%>
<%@page import="bean.Order"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.Cart"%>

<html>
<head>
<title>注文情報確認</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>


<%
	Customer customer = (Customer)request.getAttribute("customer");
	Cart cart =  (Cart)session.getAttribute("cart_list");


%>



	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp" %>
	<h2 style="text-align:center">注文情報確認</h2>
	<hr style="text-align: center; height: 2px; background-color: black; width: 950px">

	<table style="margin:auto" class="product-table">

		<tr>
			<th>氏名</th>
			<td><%=customer.getUsername()%></td>
		</tr>
		<tr>
			<th>メールアドレス</th>
			<td><%=customer.getMail()%></td>
		</tr>
		<tr>
			<th>住所</th>
			<td><%=customer.getAddress()%></td>
		</tr>
		<tr>

			<%
			int total = 0;
		ArrayList<Cart> cart_list =(ArrayList<Cart>)request.getAttribute("cart_list");
		if (cart_list != null) {
		for (int i = 0; i < cart_list.size() ; i++) {
		 cart = (Cart) cart_list.get(i);

		%>
		<tr>
			<th>商品</th>
			<td><%=cart_list.get(i).getSelectedUni() %></td>
		</tr>
		<tr>
			<th>サイズ(個数)</th>
			<td>S(<%=cart_list.get(i).getsSize() %>),M(<%=cart_list.get(i).getmSize()%>),L(<%=cart_list.get(i).getlSize() %>),kids(<%=cart_list.get(i).getKidsSize() %>)</td>
		</tr>
		<tr>
			<th>個数</th>
			<td><%=cart_list.get(i).getTotal() %></td>

			<%
			}
		}
		%>
		</tr>
		<tr>
			<th>備考</th>
			<td><%=customer.getRemark()%></td>
		</tr>


	</table>
	<div style="text-align:center">
		<p><a href="/view/userForm.jsp">修正する</a></p>

	<form action="<%=request.getContextPath() %>/orderConfirm  class="buy-button">
		<input type="submit" value ="注文確定">
	</form>

	</div>
</body>
</html>