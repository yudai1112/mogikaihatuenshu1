<%@page contentType="text/html; charset=UTF-8"%>

<html>
<head>
<title>購入確認</title>
<link rel="stylesheet"  href="<%=request.getContextPath()%>/css/style.css">
</head>
<body>
	<!-- ヘッダー部分 -->
	<%@ include file="/common/headerBuyer.jsp" %>
	<h2 style="text-align:center">購入完了</h2>
	<hr style="text-align: center; height: 2px; background-color: black; width: 950px">

	<p style="text-align:center">購入しました。</p>
	<p style="text-align:center">お送りしたメールからお支払いの詳細をご確認ください。</p>


	<table class="order-list" style="margin:auto">
		<tr>
			<th>商品</th>
			<th>個数(サイズ)</th>
			<th>金額</th>
		</tr>

		<tr>
			<td>ユニフォームA</td>

			<td>4(S), 7(M), 2(L)　計13</td>

			<td>○○円</td>
		</tr>

	</table><br>



	<p style="text-align:center"><a href="http://localhost:8080/uniform_admin_teamE3/view/buyer/productList.jsp">商品一覧に戻る</a></p>

</body>
</html>

