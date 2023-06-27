/* 受注一覧表示 */

package servlet;

import java.util.ArrayList;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Order;
import dao.OrderDAO;

public class OrderListServlet extends HttpServlet {

	//doPostメソッド
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		//エラー処理の為の変数宣言
		String error = "";
		String cmd = "";

		try {
			//受注情報テーブルから情報を全件取得、取得情報を格納
			OrderDAO objOrderDao = new OrderDAO();
			ArrayList<Order> order_list = objOrderDao.selectAll();

			//リクエストスコープに登録
			request.setAttribute("order_list", order_list);

		} catch(IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示は行えませんでした。";
			cmd = "logout";
		} finally {
			if(error.equals("")) {
				//エラーなし、受注一覧表示画面に遷移
				request.getRequestDispatcher("/view/admin/orderList.jsp").forward(request, response);
			} else {
				//エラーあり、エラー画面にフォワード
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}

		}

	}
}
