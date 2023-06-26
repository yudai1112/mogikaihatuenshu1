<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Uniform"%>




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


			<!-- 書籍登録コンテンツ部分 -->
			<div id="main" class="container">


<%
	Uniform uniform = (Uniform)request.getAttribute("uniform");

%>

				<!--  表 -->

				<table class="order-form"  style="text-align:center">

					<tr>
						<th>商品ナンバー</th>
						<td><%= uniform.getUniformid() %></td>
					</tr>
					<tr>
						<th>商品名</th>
						<td><%= uniform.getName() %></td>
					</tr>
					<tr>
						<th>在庫数</th>
						<td><%= uniform.getSize() %></td>
					</tr>
					<tr>
						<th>価格</th>
						<td><%= uniform.getPrice() %></td>
					</tr>
					<tr>
						<th>在庫数</th>
						<td><%= uniform.getInventory() %></td>
					</tr>
					<tr>
						<th>画像</th>
						<td><%= uniform.getImage() %></td>
					</tr>
				</table>


				<form  action="<%= request.getContextPath() %>/delete" method="get">
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
							<li><a href ="<%= request.getContextPath()%>/view/menu.jsp" >[商品一覧に戻る]</a></li>
						</ul>
					</div>

				</div>
			</div>

			<!-- フッター部分 -->
			<%@ include file="/common/footer.jsp" %>

		</div>
	</body>
</html>