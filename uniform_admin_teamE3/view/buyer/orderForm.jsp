<%@page contentType="text/html;charset=UTF-8"%>
<html>
	<head>
		<title>注文フォーム</title>
	</head>
	<body>
		<h2>注文フォーム</h2>
		<form>
			<p>名前<input type="text" name="name"></p>
			<p>メールアドレス<input type="text" name="mailadress"></p>
			<p>ユニフォームの種類
			<select name="type">
				<option value="uniformA">ユニフォームA</option>
				<option value="uniformB">ユニフォームB</option>
				<option value="uniformC">ユニフォームC</option>
				<option value="uniformD">ユニフォームD</option>
				<option value="uniformE">ユニフォームE</option>
			</select>
			<p>注文数<input type="number" value="1" min="1" max="10" step="1"></p>
			<p>備考<textarea cols="50" rows="4" name="bikou"></textarea></p>

			<input type="submit" value="注文">
		</form>
	</body>
</html>