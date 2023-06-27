<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>注文情報確認</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp" %>
	<h2 style="text-align:center">注文情報確認</h2>
	<hr style="text-align: center; height: 2px; background-color: black;">

	<table style="margin:auto" class="product-table">
		<tr>
			<th>名前</th>
			<td>田中太郎</td>
		</tr>
		<tr>
			<th>メールアドレス</th>
			<td>aiueokakikukeko@aiueo.jp</td>
		</tr>
		<tr>
			<th>住所</th>
			<td>東京都千代田区○○ー○○</td>
		</tr>
		<tr>
			<th>商品・購入数</th>
			<td>ユニフォームA,43</td>
		</tr>
		<tr>
			<th>備考欄</th>
			<td></td>
		</tr>
	</table>
	<div style="text-align:center">
		<p><a href="注文フォームURL">修正する</a></p>
		<button type="button" >注文確定</button>
	</div>
</body>
</html>