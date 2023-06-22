<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>カート内容</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
<!-- ヘッダー部分 -->
			<%@ include file="/common/headerBuyer.jsp" %>
<h2 style="text-align:center">カート内容確認</h2>
<hr style="text-align: center; height: 2px; background-color: black; width: 950px">
	<table class="product-table" style="margin:auto">
		<tr>
			<th>商品</th>
			<th>サイズ(個数)</th>
			<th>個数</th>
		</tr>

		<tr>
			<td>ユニフォームA</td>

			<td>S(4), M(7), L(2)</td>

			<td>合計13個</td>
		</tr>

	</table><br>


	<table class="total-price-table" style="margin:auto">
		<tr>
			<th style="background-color: #ff7f50">合計</th>
			<td>○○円</td>
		</tr>
	</table><br>

	<form action="" class="buy-button">
		<input type="submit" value="購入/お客様情報入力">
	</form>

	<p><a href="http://localhost:8080/uniform_admin_teamE3/view/buyer/productList.jsp">商品一覧に戻る</a></p>
	<p><a href="http://localhost:8080/uniform_admin_teamE3/view/buyer/orderForm.jsp">注文フォームに戻る</a></p>

</body>
<html>