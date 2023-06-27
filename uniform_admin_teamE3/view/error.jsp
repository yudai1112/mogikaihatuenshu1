<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.ArrayList,bean.Uniform"%>

<%
	String error = (String) request.getAttribute("error");
	if (error == null) {
		error = "";
	}
	String cmd = (String) request.getAttribute("cmd");
	if (cmd == null) {
		cmd = "menu";
	}
%>


<html>
		<head>
			<title>エラー画面表示</title>
		</head>
		<body>

		<!-- ブラウザ全体 -->
		<div id="wrap">


		<!-- ヘッダー -->
			<%@include file="/common/header.jsp" %>

		<!-- ページタイトル -->
					<div id="page_title">
						<h2 style="text-align:center">エラーが発生しました！</h2>
					</div>

		<hr style="text-align:center; height:2px; background-color:black; width:950px">

		<div id ="main"    style=text-align:center;>

				<!-- エラーメッセージ  -->
				<p class="errorMessage"><%= error %></p>

				<!-- リンク先  -->
				<p class="linkPage">
					<%
					if (cmd.equals("main")) {
					%>
					<a href="<%=request.getContextPath()%>/view/menu.jsp">[商品一覧に戻る]</a>

					<%
					} else if(cmd.equals("logout")) {
					%>
					<a href="<%=request.getContextPath()%>/view/menu.jsp">[ログイン画面へ]</a>

					<%
					} else if(cmd.equals("userForm")) {
					%>
					<a href="<%=request.getContextPath()%>/view/userForm.jsp">[購入者情報入力画面へ]</a>
					<%
					} else {
					%>
						<a href="<%=request.getContextPath()%>/">[一覧表示に戻る]</a>
					<%
					}
					%>
				</p>
		</div>


		</div>

			<!-- フッター部分 -->
			<%@ include file="/common/footer.jsp"%>

	</body>
</html>
