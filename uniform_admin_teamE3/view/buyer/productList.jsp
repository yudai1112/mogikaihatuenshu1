<%@page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>商品一覧</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
			<%@ include file="/common/headerBuyer.jsp" %>
	<h2 style="text-align:center">商品一覧</h2>
	<hr style="text-align: center; height: 2px; background-color: black; width: 950px">
	<table style="margin:auto" class="product-table"> <!-- 商品一覧テーブル -->
		<tr>
			<th >イメージ</th>
			<th>商品名</th>
			<th>価格</th>
			<th>カラー</th>
			<th>サイズ展開</th>
		</tr>

		<!-- 後ほどDB作成後に繰り返し処理-->
		<tr>
			<td>画像</td>
			<td>ユニフォームA</td>
			<td>2300円</td>
			<td>青</td>
			<td>S,M,L,子供用</td>
		</tr>

		<tr>
			<td>画像</td>
			<td>ユニフォームB</td>
			<td>2300円</td>
			<td>黄色</td>
			<td>S,M,L,子供用</td>
		</tr>
	</table>
	<p style="text-align:center"><a href="注文フォームURL" >注文する</a></p>
	<br>
	<a href="ろぐいんがめんURL">管理者ログイン</a>
	<br>
	<!-- フッター部分 -->
			<%@ include file="/common/footer.jsp" %>
</body>
</html>