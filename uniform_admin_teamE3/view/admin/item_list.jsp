<!-- 受注内容詳細画面 -->

<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>商品一覧（管理者）</title>
	</head>

	<body>
		<!-- ヘッダー -->
		<%@ include file="/common/header.jsp" %>
		<hr style="height: 2px; background-color: #98fd98"></hr>

		<table style="margin: auto">
			<tr>
			<td width="25%">
				<ul>
					<li style="float: left; list-style: none; margin: 5px"><a href="">ログアウト</a></li>
					<li style="float: left; list-style: none; margin: 5px"><a href="">商品登録</a></li>
				</ul>
			</td>

		<!-- コンテンツ部分 -->
			<td width="50%">
				<h2 style="text-align: center">商品一覧（管理者）</h2>
			</td>
			<td width="25%"></td>
		</tr>
		</table>
		<hr></hr>

		<table  style="width: 1000px; margin: auto">
			<!-- 見出し -->

			<tr style="background-color: #98fd98">
				<th>商品ナンバー</th>
				<th>商品名</th>
				<th>価格</th>
				<th>在庫数</th>
				<th colspan="3"></th>
			</tr>

			<!-- 内容（仮） -->
			<tr style="text-align: center">
				<td>0001</td>
				<td>ユニフォームA</td>
				<td>&yen;2000</td>
				<td>100</td>
				<td><a href="">削除<a></td>
				<td>/</td>
				<td><a href="">更新<a></td>
			</tr>
		</table>

		<!-- フッター -->
		<hr></hr>
		<%@ include file="/common/footer.jsp" %>
	</body>
</html>
