<!-- 商品情報更新画面 -->

<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>商品情報更新</title>
	</head>
	<body>
		<!-- ヘッダー -->
		<%@ include file="/common/header.jsp" %>
		<hr style="height: 2px; background-color: #98fd98"></hr>

		<table style="margin: auto">
			<tr>
			<td width="25%">
				<p style="padding-left: 50px"><a href="">ログアウト</a></p>
			</td>

		<!-- コンテンツ部分 -->
			<td width="50%">
				<h2 style="text-align: center">商品情報更新</h2>
			</td>
			<td width="25%"></td>
		</tr>
		</table>
		<hr></hr>

		<h4 style="text-align: center">更新情報を入力してください。</h4>
		<form action="">
			<table style="margin: auto; border-spacing: 5px">
				<tr>
					<th></th>
					<th>更新前情報</th>
					<th style="width: 10px"></th>
					<th>更新後情報</th>
				</tr>
				<tr>
					<th style="background-color: #98fd98">商品番号</th>
					<td>0001</td>
					<th style="width: 10px"></th>
					<td>0001</td>
				</tr>
				<tr>
					<th style="background-color: #98fd98">商品名</th>
					<td>ユニフォームA</td>
					<th style="width: 10px"></th>
					<td><input type="text" name="update_"></td>
				</tr>
				<tr>
					<th style="background-color: #98fd98">在庫数</th>
					<td>100</td>
					<th style="width: 10px"></th>
					<td><input type="text" name="update_"></td>
				</tr>
				<tr>
					<th style="background-color: #98fd98">価格</th>
					<td>&yen;2000</td>
					<th style="width: 10px"></th>
					<td><input type="text" name="update_price"></td>
				</tr>
			</table>

			<div style="text-align: center; padding-top: 20px">
				<input type="submit" value="更新">
			</div>
		</form>

		<p style="text-align: center; margin-top: 70px"><a href="">商品一覧に戻る</a></p>

		<!-- フッター -->
		<hr></hr>
		<%@ include file="/common/footer.jsp" %>
	</body>
</html>

