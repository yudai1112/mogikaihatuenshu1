<!-- 管理者ログインページ -->

<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="bean.Admin"%>

<%
//各データをセッションから取得
	String id = "";
	String password = "";
	String error = (String) request.getAttribute("error");
	Cookie[] cookieList = request.getCookies(); //クッキーの取得

	//クッキーがあるか判定
	if (cookieList != null) {
		for (Cookie cookie : cookieList) {
			//クッキーからユーザー情報の取得
			if (cookie.getName().equals("id")) {
				id = cookie.getValue();
			}
			//クッキーからパスワード情報の取得
			if (cookie.getName().equals("password")) {
				password = cookie.getValue();
			}
		}
	}
	if (error == null) {
		error = "";
	}
%>

<html>
	<head>
		<title>受注管理システム</title>

	</head>

	<body>
		<!-- ヘッダー -->

		<!-- コンテンツ部分 -->

		<h2>管理者ログイン</h2>
		<hr></hr>

		<h4>管理者ログイン</h4>

		<form action="<%=request.getContextPath()%>/login" method="POST">
			<p>ID<input type="text" name="id"></p>
			<p>パスワード<input type="password" name="password"></p>
			<input type="submit" value="ログイン">
		</form>

		<!-- フッター -->

	</body>
</html>