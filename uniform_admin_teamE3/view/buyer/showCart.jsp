<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>カート内容</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
<!-- ヘッダー部分 -->
			<%@ include file="/common/header.jsp" %>
<h2 style="text-align:center">カート内容確認</h2>
<hr style="text-align: center; height: 2px; background-color: black; width: 950px">
	<table class="order-list" style="margin:auto">
		<tr>
			<th>商品</th>
			<th>サイズ</th>
			<th>個数</th>
		</tr>

		<tr>
			<td><a></a></td>
			<td></td>

			<td>
		</tr>

	</table><br>


	<table class="total-price-table" style="margin:auto">
		<tr>
			<th style="background-color: #98fd98">合計</th>
			<td>○○円</td>
		</tr>
	</table><br>

	<form action="" class="buy-button">
		<input type="submit" value="購入/お客様情報入力">
	</form>

</body>
<html>