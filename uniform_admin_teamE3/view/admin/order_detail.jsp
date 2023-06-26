<!-- 受注内容詳細画面 -->

<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Order"%>
<%@page import="bean.Customer"%>

<html>
<head>
<title>注文内容詳細</title>
</head>
<body>
	<!-- ヘッダー -->

	<%@ include file="/common/header.jsp"%>
	<hr style="height: 2px; background-color: #98fd98"></hr>

	<%
		Order order = (Order) request.getAttribute("order");
		Customer customer = (Customer) request.getAttribute("customer");

	%>


	<table style="margin: auto">
		<tr>
			<td width="25%">
				<ul>
					<li style="float: left; list-style: none; margin: 5px"><a
						href="">ログアウト</a></li>
					<li style="float: left; list-style: none; margin: 5px"><a
						href="">受注管理一覧</a></li>
				</ul>
			</td>

			<!-- コンテンツ部分 -->
			<td width="50%">
				<h2 style="text-align: center">注文内容詳細</h2>
			</td>
			<td width="25%"></td>
		</tr>
	</table>
	<hr></hr>

	<!-- 注文内容詳細 -->
	<table style="border-spacing: 5px; margin: auto">
		<tr>
			<th colspan="2">注文内容詳細</th>
		</tr>
		<tr>
			<td
				style="background-color: #98fd98; text-align: center; width: 200px">ご注文番号</td>
			<td><%=order.getOrderno()%></td>
		</tr>
		<tr>
			<td style="background-color: #98fd98; text-align: center">商品番号</td>
			<td><%=order.getUniformid()%></td>
		</tr>
		<tr>
			<td style="background-color: #98fd98; text-align: center">商品名</td>
			<td><%=order.getUniformname()%></td>
		</tr>
		<tr>
			<td style="background-color: #98fd98; text-align: center">数量</td>
			<td><%=order.getQuantity()%></td>
		</tr>

		<!--  作成途中-->
		<tr>
			<td style="background-color: #98fd98; text-align: center">合計金額</td>
			<td><%=order.getQuantity()%></td>
		</tr>
		<!-- ↑ -->

		<tr>
			<td style="background-color: #98fd98; text-align: center">購入者氏名</td>
			<td><%=customer.getUsername()%></td>
		</tr>
		<tr>
			<td style="background-color: #98fd98; text-align: center">購入者メールアドレス</td>
			<td><%=customer.getMail()%></td>
		</tr>
		<tr>
			<td style="background-color: #98fd98; text-align: center">購入者住所</td>
			<td><%=customer.getAddress()%></td>
		</tr>

	</table>

	<!-- フッター -->
	<hr></hr>
	<%@ include file="/common/footer.jsp"%>
</html>

