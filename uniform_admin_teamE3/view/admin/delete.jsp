<%@page contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>商品削除</title>
		<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
	</head>
	<body>
		<!-- ブラウザ全体 -->
		<div id="wrap">

			<!-- ヘッダー部分 -->
			<%@ include file="/common/header.jsp" %>

					<!-- ページタイトル -->
					<div id="page_title">
						<h2 style = "text-align:center">商品削除</h2>
					</div>
				</div>
			</div>

			<!-- 書籍登録コンテンツ部分 -->
			<div id="main" class="container">



				<!--  入力フォーム -->
				<form action="<%=request.getContextPath()%>/insert">
					<table class="order-form"  style="text-align:center">
					<tr>
						<th>商品ナンバー</th>
						<td><input type="text" name="number"></td>
					</tr>
					<tr>
						<th>商品名</th>
						<td><input type="text" name="title"></td>
					</tr>
					<tr>
						<th>在庫数</th>
						<td><input type="text" name="Inventory"></td>
					</tr>
					<tr>
						<th>価格</th>
						<td><input type="text" name="price"></td>
					</tr>

					</table>

<div style="display: flex; justify-content: center;">
					<input type="submit" value="削除">
					</div>
				</form>

			<!-- メニュー部分 -->
			<div id="menu">
				<div class="container">
					<!-- ナビゲーション  -->
					<div id="nav" style="display: flex; justify-content: center;">
						<ul>
							<li><a href ="<%=request.getContextPath()%>/view/menu.jsp" >[商品一覧に戻る]</a></li>
						</ul>
					</div>

			</div>

			<!-- フッター部分 -->
			<%@ include file="/common/footer.jsp" %>

		</div>
	</body>
</html>