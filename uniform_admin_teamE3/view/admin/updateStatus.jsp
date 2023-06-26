<!--
 *** ステータス更新画面 ***

 2023/6/22
 作成：近藤
  -->

<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="bean.Order" %>

<%
//サーブレットでクエストスコープに登録した情報を取得
Order order= (Order)request.getAttribute("Order");
%>

<html>
	<head>
		<title>ステータス更新</title>
	</head>

	<body>
	<!-- ヘッダー -->
		<%@include file="/common/headerBuyer.jsp" %>

		<table style="margin: auto">
			<tr>
				<td width="25%">
					<ul>
						<li style="float: left; list-style: none; margin: 5px"><a href="">ログアウト</a></li>
						<li style="float: left; list-style: none; margin: 5px"><a href="">受注管理一覧</a></li>
					</ul>
				</td>
				<td width="50%">
					<h2 style="text-align: center">ステータス更新</h2>
				</td>
				<td width="25%"></td>
			</tr>
		</table>
		<hr style="text-align: center; height: 2px; background-color: black; width: 950px">

		<table>
		<tr>
			<td></td>
		</tr>
		</table>

	<!-- コンテンツ部分 -->

		<!-- ステータス変更対象情報 -->
			<p>更新対象：</p>
			<table style="margin:auto">
				<tr>
					<th>No.</th>
					<th>氏名</th>
					<th>発注日</th>
				</tr>
				<tr>
					<td><%=order.getOrder_id() %></td><!-- パラメータ取得 -->
					<td><%=order.getUsername() %></td>
					<td><%=order.getOrder_date() %></td>
				</tr>
			</table>

		<form action="<%=request.getContextPath() %>/updateStatus">
			<table style="margin: auto">
				<tr>
					<td>入金</td>
					<td><select name="payment">
						<option value="入金待ち">入金待ち</option>
						<option value="入金済">入金済</option>
					</select></td>
				</tr>
				<tr>
					<td>発送</td>
					<td><select name="send">
						<option value="未">未</option>
						<option value="発送準備中">発送準備中</option>
						<option value="発送済">発送済</option>
					</select></td>
				</tr>
			</table>

			<input type="submit" value="更新" style="text-align: center">
		</form>

		<!-- フッター -->
		<%@include file="/common/footer.jsp" %>

	</body>
</html>