package servlet;

/*
 * 受注状況更新処理
 * 更新に応じてメールを自動送信
 *
 * 2023/6/26
 * 作成：近藤
 */


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.*;
import dao.OrderDAO;

public class UpdateStatusServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			// (エラーメッセージ用変数)
			String error = "";
			String cmd = "";

		try {

			// 入力データの文字コード指定
			request.setCharacterEncoding("UTF-8");

			// 入力パラメータの取得(ID、入金状況、発送状況)
			String strOrderid = request.getParameter("order_id");
			int order_id = Integer.parseInt(strOrderid);
			String paymentstatus = request.getParameter("payment");
			String sendstatus = request.getParameter("send");

			//DAOオブジェクト生成
			OrderDAO orderDaoObj = new OrderDAO();
			//Orderオブジェクト生成
			Order order = new Order();

/*  ↓変更対象の情報を表示するための処理↓  */
			//戻り値としてorderオブジェクト取得
			order = orderDaoObj.selectOrderToCheck(order_id);

/*  ↓ステータスを更新するための処理↓  */
			//setterメソッドを利用して入金・発送を設定
			order.setPayment_status(paymentstatus);
			order.setSend_status(sendstatus);

			//設定したオブジェクトを引数に更新メソッド呼び出す
			orderDaoObj.updateStatus(order);

			//リクエストスコープに登録
			request.setAttribute("Order", order);

		}catch(Exception e) {
			error = "接続エラーの為、更新処理は行えませんでした。";
			cmd = "update";
		}finally {
			//エラー無し →orderListServletにフォワード
			if(error.equals("")) {
				request.getRequestDispatcher("/orderList").forward(request, response);
			}
		}

	}
}
