<!-- 受注管理一覧画面 -->

<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList, bean.Order" %>

<html>
	<head>
		<title>受注管理一覧</title>
	</head>
	<body>
		<!-- ヘッダー -->
		<%@ include file="/common/header.jsp" %>
		<hr style="height: 2px; background-color: #98fd98"></hr>

		<table style="margin: auto">
			<tr>
			<td width="25%">
				<ul>
					<li style="float: left; list-style: none; margin: 5px"><a href="<%= request.getContextPath() %>/logout">ログアウト</a></li>
					<li style="float: left; list-style: none; margin: 5px"><a href="<%= request.getContextPath() %>/uniformListAdmin">商品一覧</a></li>
				</ul>
			</td>

		<!-- コンテンツ部分 -->
			<td width="50%">
				<h2 style="text-align: center">受注管理一覧</h2>
			</td>
			<td width="25%"></td>
		</tr>
		</table>
		<hr></hr>

		<table  style="width: 1000px; margin: auto">
			<!-- 見出し -->
			<tr style="text-align: left">
				<th colspan="2">受注管理一覧</th>
			</tr>

			<tr style="background-color: #98fd98">
				<th>No</th>
				<th>氏名</th>
				<th>商品</th>
				<th>合計個数</th>
				<th>合計金額</th>
				<th>発注日</th>
				<th>入金状況</th>
				<th>発送状況</th>
				<th colspan="3"></th>
			</tr>

			<!-- 内容 -->
			<%
				//リクエストスコープから情報取得
				ArrayList<Order> list = (ArrayList<Order>)request.getAttribute("order_list");

				//繰り返して全件表示
				if(list != null) {
					for(int i = 0; i < list.size(); i++) {
						Order orders = (Order)list.get(i);
			%>
					<tr style="text-align: center">
						<td><%= orders.getOrderno() %></td>
						<td><%= orders.getUsername() %></td>
						<td><%= orders.getUniformname() %></td>
						<td><%= orders.getQuantity() %></td>
						<td>&yen;<%= orders.getUniformPrice() * orders.getQuantity() %></td>
						<td><%= orders.getDate() %></td>
						<td><%= orders.getPaymentstatus() %></td>
						<td><%= orders.getSendstatus() %></td>
						<td><a href="<%= request.getContextPath() %>/orderDetail?orderno=<%= orders.getOrderno() %>" >詳細<a></td>
						<td>/</td>
						<td><a href="<%= request.getContextPath() %>/view/admin/updateStatus.jsp?orderno=<%= orders.getOrderno() %>">更新<a></td>
					</tr>

			<%
					}
				}
			%>

		</table>

		<!-- フッター -->
		<hr></hr>
		<%@ include file="/common/footer.jsp" %>

	</body>
</html>