<!--
 *** 購入者情報入力画面 ***

 2023/6/22
 作成：近藤
  -->

<%@page contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>購入者情報入力</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp"%>
	<h2 style="text-align: center">購入者情報入力</h2>
	<hr
		style="text-align: center; height: 2px; background-color: black;">

	<!-- フォーム部分 -->
	<form action="<%=request.getContextPath()%>/userForm" method="post">

		<table style="margin: auto" class="product-table">
			<tr>
				<th>名前</th>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<th>メールアドレス</th>
				<td><input type="text" name="mail-address"></td>
			</tr>
			<tr>
				<th>住所</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<th>備考欄</th>
				<td><textarea cols="50" rows="4" name="remark"></textarea></td>
			</tr>
		</table>
		<br>
		<div style="text-align: center">
			<input type="submit" value="確認" style="text-align: center"></input>
		</div>
	</form>


	<p>
		<a href="<%=request.getContextPath()%>/showCart">ひとつ前に戻る</a>
	</p>
</body>
</html>