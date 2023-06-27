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
		style="text-align: center; height: 2px; background-color: black;">

	<p style="text-align: center">購入しました。</p>
	<p style="text-align: center">お送りしたメールからお支払いの詳細をご確認ください。</p>

	<%
		ArrayList<Cart> cart_list = (ArrayList<Cart>)session.getAttribute("cart_list");
	%>

	<table class="product-table" style="margin: auto">
		<tr>
			<th>商品</th>
			<th>サイズ(個数)</th>
			<th>個数</th>

		</tr>

		<tr>
			<%
			int totalPrice = 0;
			int total = 0;
			if(cart_list!=null){
				for(int i=0; i<cart_list.size(); i++){
					%>
			<td><%=cart_list.get(i).getSelectedUni() %></td>

			<td>S(<%=cart_list.get(i).getsSize() %>),M(<%=cart_list.get(i).getmSize()%>),L(<%=cart_list.get(i).getlSize() %>),kids(<%=cart_list.get(i).getKidsSize() %>)</td>

			<td><%=cart_list.get(i).getTotal() %></td>

		</tr>

		<%
		total += cart_list.get(i).getTotal();
		}
		totalPrice = 2000 * total;
		}%>

	</table>
	<br>


	<table class="total-price-table" style="margin: auto">
		<tr>
			<th style="background-color: #ff7f50">合計</th>
			<td><%=totalPrice %>円</td>
		</tr>
	</table>
	<br>
	<% session.invalidate(); %>



	<p style="text-align: center">
		<a
			href="<%=request.getContextPath() %>/uniformLIst">商品一覧に戻る</a>
	</p>

</body>
</html>
