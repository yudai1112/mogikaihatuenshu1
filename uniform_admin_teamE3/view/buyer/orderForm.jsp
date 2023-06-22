<%@page contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<title>注文フォーム</title>
		<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
	</head>
	<body>
	<!-- ヘッダー部分 -->
			<%@ include file="/common/headerBuyer.jsp" %>
		<h2 style="text-align:center">注文フォーム</h2>
		<hr style="text-align: center; height: 2px; background-color: black; width: 950px">
		<form class="order" oninput="result.value=parseInt(sSize.value) + parseInt(mSize.value)+ parseInt(lSize.value)+ parseInt(kidsSize.value);">
		<table style="margin:auto" class="product-table">
		<tr>
			<th>ユニフォームの種類</th>
			<td><select name="type">
				<option value="uniformA">ユニフォームA</option>
				<option value="uniformB">ユニフォームB</option>
				<option value="uniformC">ユニフォームC</option>
				<option value="uniformD">ユニフォームD</option>
				<option value="uniformE">ユニフォームE</option>
			</select></td></tr>
			<tr><th>サイズS</th><td><input type="number" value="0" min="0" max="100" step="1" name="sSize"></td><tr>
			<tr><th>サイズM</th><td><input type="number" value="0" min="0" max="100" step="1" name="mSize"></td><tr>
			<tr><th>サイズL</th><td><input type="number" value="0" min="0" max="100" step="1"name="lSize"></td><tr>
			<tr><th>子供サイズ</th><td><input type="number" value="0" min="0" max="100" step="1"name="kidsSize"></td><tr>
			<tr><th>合計注文数</th><td><output name="result">0</output></td></tr>
			<tr><th>備考</th><td><textarea cols="50" rows="4" name="bikou"></textarea></td>
		</tr>
		</table>
			<input type="submit" value="カートに入れる">
		</form>
		<p><a href="http://localhost:8080/uniform_admin_teamE3/view/buyer/productList.jsp">商品一覧に戻る</a></p>

	</body>
</html>