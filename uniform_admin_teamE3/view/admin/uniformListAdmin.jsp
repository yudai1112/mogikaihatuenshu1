<!-- 受注内容詳細画面 -->

<%@page contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.ArrayList,bean.Uniform"%>




<html>
	<head>
		<title>商品一覧</title>
	</head>

	<body>
		<!-- ヘッダー -->
		<%@include file="/common/header.jsp" %>

		<table style="margin: auto">
			<tr>
			<td width="25%">
				<ul>
					<li style="float: left; list-style: none; margin: 5px"><a href="/logout">ログアウト</a></li>
					<li style="float: left; list-style: none; margin: 5px"><a href="/insertUniform">商品登録</a></li>
				</ul>
			</td>

		<!-- コンテンツ部分 -->
			<td width="50%">
				<h2 style="text-align: center">商品一覧（管理者ページ）</h2>
			</td>
			<td width="25%"></td>
		</tr>
		</table>





		<table  style="width: 1000px; margin: auto">
			<!-- 見出し -->

			<tr style="background-color: #98fd98">
				<th>商品ナンバー</th>
				<th>イメージ</th>
				<th>商品名</th>
				<th>価格</th>
				<th>在庫数</th>
				<th>サイズ</th>
				<th>削除</th>
				<th></th>
				<th>更新</th>

				<th colspan="3"></th>

			</tr>

			<%
				ArrayList<Uniform> uniform_list =(ArrayList<Uniform>)request.getAttribute("uniform_list");
			if (uniform_list != null) {
				for (int i = 0; i < uniform_list.size() ; i++) {
			Uniform uniform = (Uniform) uniform_list.get(i);
				if(i%4 == 0){
				%>


			<!-- 内容 -->

			<tr style="text-align: center">
				<td><%=uniform.getUniformid()%></td>
				 <td><img src="<%=request.getContextPath()%>/img/<%=uniform.getImage()%>"></td>
				<td><%=uniform.getName()%></td>
				<td><%=uniform.getPrice()%></td>
				<td><%=uniform.getInventory()%></td>
				<td><%=uniform.getSize()%></td>
			<form action="<%= request.getContextPath() %>/updateConfirm" method="get">
				<td><a href="">削除</a></td>
			</form>
				<td>/</td>
			<form action="<%= request.getContextPath() %>/deleteConfirm" method="get">
				<td><a href="">更新</a></td>
			</form>
			</tr>


			<%
			}else{

	                }
	            }
	        }
	        %>
	    </table>


		<!-- フッター -->
		<%@include file="/common/footer.jsp"%>
	</body>
</html>
