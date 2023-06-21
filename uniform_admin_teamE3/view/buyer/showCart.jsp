<%@page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>カート内容</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
<h2 style="text-align:center">カート内容確認</h2>
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

	</table>

	<hr />
	<table class="total-price-table" style="margin:auto">
		<tr>
			<th>合計</th>
			<td>○○円</td>
		</tr>
	</table>

	<form action="" class="buy-button">
		<input type="submit" value=" 購入 ">
	</form>

</body>
<html>