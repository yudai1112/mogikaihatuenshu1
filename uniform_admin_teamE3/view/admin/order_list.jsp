<!-- 受注管理一覧ページ -->

<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>受注管理一覧</title>
	</head>
	<body>
		<ul>
			<li style="float: left"><a href="">ログアウト</a></li>
			<li style="float: left"><a href="">商品一覧</a></li>
		</ul>
		<h2 style="text-align: center">受注管理一覧</h2>
		<hr></hr>

		<table style="margin-left: auto; font-size: 13px">
			<tr class="earnings">
				<td class="earnings">〇月の売り上げ（発送完了分）</td>
				<td>&yen;〇〇</td>
			</tr>
			<tr class="earnings">
				<td>△月の売り上げ（発送完了分）</td>
				<td>&yen;△△</td>
			</tr>
		</table>

		<h4>受注管理一覧</h4>

		<table  style="width: 1000px; margin: auto">
			<!-- 見出し -->
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

	</body>
</html>