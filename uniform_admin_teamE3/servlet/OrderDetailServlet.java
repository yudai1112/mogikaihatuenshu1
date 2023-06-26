package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bean.*;
import dao.*;

public class OrderDetailServlet extends HttpServlet{

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

		// 文字エンコードを指定
		request.setCharacterEncoding("UTF-8");

		String ordernoStr = request.getParameter("orderno");
		int orderno = Integer.parseInt(ordernoStr);

		// メソッドの呼び出しと代入
		order = orderDao.selectByOrderno(orderno);

		// リクエストスコープに登録
		request.setAttribute("order", order);

		CustomerDAO customerDAO = new CustomerDAO();
		Customer customer = new Customer();

		String useridStr = order.getUserid();
		int userid = Integer.parseInt(ordernoStr);

		customer = customerDAO.selectByUser_id(userid);

		request.setAttribute("customer",customer);


		request.getRequestDispatcher("/view/admin/order_detail.jsp").forward(request, response);
	}
}
