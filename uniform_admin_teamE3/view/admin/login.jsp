<!-- 管理者ログイン画面 -->

<%@page contentType="text/html; charset=UTF-8"%>

<html>
	<head>
		<title>受注管理システム</title>
	</head>

	<body>
		<!-- ヘッダー -->
		<%@ include file="/common/header.jsp" %>
		<hr style="height: 2px; background-color: #98fd98"></hr>

		<!-- コンテンツ部分 -->

		<h2 style="text-align: center">管理者ログイン</h2>
		<hr></hr>


		<form action="" method="post">
			<table style="margin: auto">
				<tr>
					<td>ID</td>
					<td><input type="text"></td>
				</tr>
				<tr>
					<td>パスワード</td>
					<td><input type="pass"></td>
			</table>
			<div style="text-align: center; padding-top: 20px">
				<input type="submit" value="ログイン" style="text-align: center">
			</div>
		</form>

		<!-- フッター -->
		<hr></hr>
		<%@ include file="/common/footer.jsp" %>

	</body>
</html>