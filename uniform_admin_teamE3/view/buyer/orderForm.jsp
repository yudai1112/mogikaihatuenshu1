<%@page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>注文フォーム</title>
		<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
	</head>
	<body>
	<!-- ヘッダー部分 -->
			<%@ include file="/common/header.jsp" %>
		<h2 style="text-align:center">注文フォーム</h2>
		<hr style="text-align: center; height: 2px; background-color: black; width: 950px">
		<form class="order">
		<table style="margin:auto" class="order-form">
		<tr>
			<th>名前</th><td><input type="text" name="name"></td><tr>
			<tr><th>メールアドレス</th><td><input type="text" name="mailadress"></td></tr>
			<tr><th>ユニフォームの種類</th>
			<td><select name="type">
				<option value="uniformA">ユニフォームA</option>
				<option value="uniformB">ユニフォームB</option>
				<option value="uniformC">ユニフォームC</option>
				<option value="uniformD">ユニフォームD</option>
				<option value="uniformE">ユニフォームE</option>
			</select></td></tr>
			<tr><th>注文数</th><td><input type="number" value="1" min="1" max="10" step="1"></td></tr>
			<tr><th>備考</th><td><textarea cols="50" rows="4" name="bikou"></textarea></td>
		</tr>
		</table>
			<input type="submit" value="注文">
		</form>

	</body>
</html>