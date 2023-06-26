<!-- 受注管理一覧画面 -->

<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>受注管理一覧</title>
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
					<li style="float: left; list-style: none; margin: 5px"><a href="">商品一覧</a></li>
				</ul>
			</td>

		<!-- コンテンツ部分 -->
			<td width="50%">
				<h2 style="text-align: center">受注管理一覧</h2>
			</td>
			<td width="25%"></td>
		</tr>
		</table>
		<hr></hr>

		<table  style="width: 1000px; margin: auto">
			<!-- 見出し -->
			<tr style="text-align: left">
				<th colspan="2">受注管理一覧</th>
			</tr>

			<tr style="background-color: #98fd98">
				<th>No</th>
				<th>氏名</th>
				<th>種類</th>
				<th>個数</th>
				<th>合計金額</th>
				<th>発注日</th>
				<th>入金状況</th>
				<th>発送状況</th>
				<th colspan="3"></th>
			</tr>

			<!-- 内容（仮） -->
			<tr style="text-align: center">
				<td>1</td>
				<td>神田</td>
				<td>ユニフォームA</td>
				<td>1</td>
				<td>&yen;1000</td>
				<td>2023年1月1日</td>
				<td>入金済</td>
				<td>未</td>
				<td><a href="<%=request.getContextPath()%>/orderDetail?orderno=1">詳細<a></td>
				<td>/</td>
				<td><a href="">更新<a></td>
			</tr>
		</table>

		<!-- フッター -->
		<hr></hr>
		<%@ include file="/common/footer.jsp" %>

	</body>
</html>