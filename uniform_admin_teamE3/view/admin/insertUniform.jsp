<!-- 商品登録画面 -->

<%@page contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>商品登録</title>
		<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
	</head>
	<body>
		<!-- ブラウザ全体 -->
		<div id="wrap">

			<!-- ヘッダー -->
			<%@ include file="/common/header.jsp" %>
			<hr style="height: 2px; background-color: #98fd98"></hr>

			<!-- ページタイトル -->
				<div id="page_title">
					<h2 style = "text-align:center">商品登録</h2>
				</div>
				<hr></hr>
		</div>

		<!-- 書籍登録コンテンツ部分 -->
		<div id="main" class="container">

			<!--  入力フォーム -->
			<form action="<%=request.getContextPath()%>/insertUniform">
				<table style="text-align:center; margin: auto">
					<tr>
						<th style="background-color: #98fd98; width: 130px">商品番号</th>
						<td><input type="text" name="uniformid" ></td>
					</tr>
					<tr>
						<th style="background-color: #98fd98">商品名</th>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<th style="background-color: #98fd98">サイズ</th>
						<td><input type="text" name="size"></td>
					</tr>
					<tr>
						<th style="background-color: #98fd98">在庫数</th>
						<td><input type="text" name="inventory"></td>
					</tr>
					<tr>
						<th style="background-color: #98fd98">価格</th>
						<td><input type="text" name="price"></td>
					</tr>
					<tr>
						<th style="background-color: #98fd98">イメージ</th>
						<td><input type="file" name="image"></td>
					</tr>

				</table>

				<div style="display: flex; justify-content: center;">
					<input type="submit" value="登録" style="margin-top: 30px">
				</div>
			</form>
		</div>

		<!-- メニュー部分 -->
		<div id="menu">
			<div class="container">
				<!-- ナビゲーション  -->
				<div id="nav" style="display: flex; justify-content: center;">
					<p><a href ="<%=request.getContextPath()%>/uniformListAdmin" >[商品一覧に戻る]</a></p>
				</div>
			</div>

			<!-- フッター -->
			<hr></hr>
			<%@ include file="/common/footer.jsp" %>
		</div>
	</body>
</html>
</html>