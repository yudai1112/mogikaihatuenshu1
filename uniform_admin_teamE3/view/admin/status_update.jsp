<!-- ステータス更新画面 -->

<%@page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<title>ステータス更新</title>
	</head>

	<body>
		<!-- ヘッダー -->


		<table style="margin: auto">
			<tr>
			<td width="25%">
				<ul>
					<li style="float: left; list-style: none; margin: 5px"><a href="">ログアウト</a></li>
					<li style="float: left; list-style: none; margin: 5px"><a href="">受注管理一覧</a></li>
				</ul>
			</td>

		<!-- コンテンツ部分 -->
			<td width="50%">
				<h2 style="text-align: center">ステータス更新</h2>
			</td>
			<td width="25%"></td>
		</tr>
		</table>
		<hr></hr>

		<form action="">
			<table style="margin: auto">
				<tr>
					<td>入金</td>
					<td><select name="payment">
						<option value="wait">入金待ち</option>
						<option value="paid">入金済</option>
					</select></td>
				</tr>
				<tr>
					<td>発送</td>
					<td><select name="send">
						<option value="not">未</option>
						<option value="preparing">発送準備中</option>
						<option value="sent">発送済</option>
					</select></td>
				</tr>
			</table>

			<input type="submit" value="更新" style="text-align: center">
		</form>

		<!-- フッター -->

	</body>
</html>