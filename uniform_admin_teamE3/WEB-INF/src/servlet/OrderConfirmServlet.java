package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;
import dao.*;

public class OrderConfirmServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String error = "";
		String cmd = "";

		try {
			HttpSession session = request.getSession();

			// コンテンツタイプの設定
			request.setCharacterEncoding("UTF-8");

			// インスタンス化
			Customer customer = (Customer) request.getAttribute("customer");
			Cart cart = (Cart) session.getAttribute("cart_list");
			Order order = new Order();
			OrderDAO orDAO = new OrderDAO();

			// パラメータを取得(Cart)
			String uniform_name = request.getParameter("type");
			String uniform_sSize = request.getParameter("sSize");
			String uniform_mSize = request.getParameter("mSize");
			String uniform_lSize = request.getParameter("lSize");
			String uniform_kidsSize = request.getParameter("kidsSize");
			String uniform_result = request.getParameter("result");
			String uniform_bikou = request.getParameter("bikou");

			String size = "S: " + uniform_sSize + "M: " + uniform_mSize + "L:" + uniform_lSize + "Kids:"
					+ uniform_kidsSize;

			// パラメータを取得(customer)
			String username = customer.getUsername();
			String mail = customer.getMail();
			String remaerk = customer.getRemark();
			String payment_status = "未入金";
			String send_status = "未発送";

			// オーダークラスに代入
			order.setUniformname(uniform_name);
			order.setUsername(username);
			order.setSize(size);
			order.setQuantity(Integer.parseInt(uniform_result));
			order.setOrderremark(uniform_bikou);
			order.setPaymentstatus(payment_status);
			order.setSendstatus(send_status);

			// insertメソッド呼び出し
			orDAO.orderInsert(order);

		} catch (IllegalStateException e) {
			error ="エラーの為、購入処理は行えませんでした。";
			cmd = "userForm";
		} finally {
			// エラーの有無でフォワード先呼び分け
			if (error.equals("")) {
				// エラー無し
				request.getRequestDispatcher("/view/buyer/buyCompleted.jsp").forward(request, response);
			} else {
				// エラーあり→error.jsp
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);


			}

		}
	}
}
