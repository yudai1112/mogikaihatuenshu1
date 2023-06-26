<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.*"%>
<%
	ArrayList<Cart> cart_list = (ArrayList<Cart>) request.getAttribute("cart_list");
%>
<html>
<head>
<title>カート内容</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp"%>
	<h2 style="text-align: center">カート内容確認</h2>
	<hr
		style="text-align: center; height: 2px; background-color: black; width: 950px">
	<table class="product-table" style="margin: auto">
		<tr>
			<th>商品</th>
			<th>サイズ(個数)</th>
			<th>個数</th>

		</tr>

		<tr>
			<%
			int total = 0;
			if(cart_list!=null){
				for(int i=0; i<cart_list.size(); i++){
					%>
			<td><%=cart_list.get(i).getSelectedUni() %></td>

			<td>S(<%=cart_list.get(i).getsSize() %>),M(<%=cart_list.get(i).getmSize()%>),L(<%=cart_list.get(i).getlSize() %>),kids(<%=cart_list.get(i).getKidsSize() %>)</td>

			<td><%=cart_list.get(i).getTotal() %></td>

			<td><a href="<%=request.getContextPath()%>/showCart?delno=<%=i%>">削除</a></td>
		</tr>

		<%

		}
		}%>

	</table>
	<br>


	<table class="total-price-table" style="margin: auto">
		<tr>
			<th style="background-color: #ff7f50">合計</th>
			<td><%=total %>円</td>
		</tr>
	</table>
	<br>

	<form action="" class="buy-button">
		<input type="submit" value="購入/お客様情報入力">
	</form>

	<p>
		<a
			href="<%=request.getContextPath() %>/uniformList">商品一覧に戻る</a>
	</p>
	<p>
		<a
			href="http://localhost:8080/uniform_admin_teamE3/view/buyer/orderForm.jsp">注文フォームに戻る</a>
	</p>

</body>
<html>