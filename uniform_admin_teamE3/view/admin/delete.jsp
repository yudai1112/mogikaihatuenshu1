<%@page contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>商品削除</title>
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
				<h2 style = "text-align:center">商品削除</h2>
			</div>
		</div>


		<!-- 書籍登録コンテンツ部分 -->
		<div id="main" class="container">

			<!--  入力フォーム -->
			<form action="<%=request.getContextPath()%>/insert">
				<table class="order-form"  style="text-align:center; margin: auto">
					<tr>
						<th style="background-color: #98df98">商品ナンバー</th>
						<td>0001</td>
					</tr>
					<tr>
						<th style="background-color: #98df98">商品名</th>
						<td>ユニフォームA</td>
					</tr>
					<tr>
						<th style="background-color: #98df98">在庫数</th>
						<td>100</td>
					</tr>
					<tr>
						<th style="background-color: #98df98">価格</th>
						<td>&yen;2000</td>
					</tr>
				</table>

				<div style="text-align: center; padding-top: 20px">
					<input type="submit" value="削除">
				</div>
			</form>

			<!-- メニュー部分 -->
			<div id="menu">
				<div class="container">
					<!-- ナビゲーション  -->
					<div id="nav" style="display: flex; justify-content: center;">
						<p><a href ="<%=request.getContextPath()%>/view/menu.jsp" >[商品一覧に戻る]</a></p>
					</div>
				</div>

				<!-- フッター -->
				<hr></hr>
				<%@ include file="/common/footer.jsp" %>

			</div>
		</div>
	</body>
