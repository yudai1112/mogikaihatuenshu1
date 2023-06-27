<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>購入者情報入力</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp" %>
	<h2 style="text-align:center">購入者情報入力</h2>
	<hr style="text-align: center; height: 2px; background-color: black;">

	<table style="margin:auto" class="product-table">
		<tr>
			<th>名前</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>メールアドレス</th>
			<td><input type="text" name="mail-adress"></td>
		</tr>
		<tr>
			<th>住所</th>
			<td><input type="text" name="adress"></td>
		</tr>
		<tr>
			<th>備考欄</th>
			<td><textarea cols="50" rows="4" name="bikou"></textarea></td>
		</tr>
	</table><br>

	<div style="text-align:center">
		<button type="button" >確認</button>
	</div>
	<p><a href="http://localhost:8080/uniform_admin_teamE3/view/buyer/showCart.jsp">ひとつ前に戻る</a></p>
</body>
</html>