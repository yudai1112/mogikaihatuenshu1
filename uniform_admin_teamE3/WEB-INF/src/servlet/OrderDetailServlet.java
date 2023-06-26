package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bean.*;
import dao.*;

public class OrderDetailServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 変数の初期化
		String error = "";
		String cmd = "";

		/*
		 * 注文情報
		 */

		// オブジェクトを作成
		OrderDAO orderDao = new OrderDAO();
		Order order = new Order();

		try {

			// 文字エンコードを指定
			request.setCharacterEncoding("UTF-8");

			//ordernoの値を取得
			String ordernoStr = request.getParameter("orderno");
			int orderno = Integer.parseInt(ordernoStr);

			// ordernoを元に注文情報を取得
			order = orderDao.selectByOrderno(orderno);

			// リクエストスコープに登録
			request.setAttribute("order", order);

			CustomerDAO customerDAO = new CustomerDAO();
			Customer customer = new Customer();

			//useridを取得
			String useridStr = order.getUserid();
			int userid = Integer.parseInt(useridStr);

			//useridを元に利用者情報を取得
			customer = customerDAO.selectByUser_id(userid);

			//リクエストスコープに登録
			request.setAttribute("customer", customer);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、注文内容詳細は表示できませんでした。";
			cmd = "detail";
		} finally {
			//エラーがある場合
			if (cmd.equals("detail")) {
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			//エラーがない場合
			} else {
				request.getRequestDispatcher("/view/admin/order_detail.jsp").forward(request, response);
			}
		}
	}
}
