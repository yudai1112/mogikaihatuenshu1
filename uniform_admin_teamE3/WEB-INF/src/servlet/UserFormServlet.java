package servlet;

/*
 * 購入者情報入力処理
 *
 * 2023/6/22
 * 作成：近藤
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.*;
import dao.*;

public class UserFormServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			// (エラーメッセージ用変数)
			String error = "";
			String cmd = "";

		try {

			// 入力データの文字コード指定
			request.setCharacterEncoding("UTF-8");

			// 入力パラメータの取得(名前、メアド、住所、備考)
			String name = request.getParameter("name");
			String mailAddress = request.getParameter("mail-address");
			String address = request.getParameter("address");
			String remark = request.getParameter("remark");

			// エラー（空白）チェック
			if (name.equals("")) { // --名前
				error = "名前が未入力です。";
				cmd = "userForm";
				return;
			}
			if (mailAddress.equals("")) { // --メアド
				error = "メールアドレスが未入力です。";
				cmd = "userForm";
				return;
			}
			if (address.equals("")) { // --住所
				error = "住所が未入力です。";
				cmd = "userForm";
				return;
			}

			// DAOオブジェクト生成
			CustomerDAO CustomerDaoObj = new CustomerDAO();

			// Customerオブジェクト生成、setterメソッド利用して設定
			Customer customer = new Customer();
			customer.setName(name);
			customer.setMailAddress(mailAddress);
			customer.setAddress(address);
			customer.setRemark(remark);

			// ↑で設定したオブジェクトを引数に、メソッドを呼び出す
			CustomerDaoObj.customerInsert(customer);

		} catch (IllegalStateException e) {
			error = "エラーの為、お客様の情報登録は行えませんでした。";
			cmd = "userForm";
		} finally {
			// エラーの有無でフォワード先呼び分け
			if (error.equals("")) {
				// エラー無し→OrderConfirmServlet
				request.getRequestDispatcher("/orderConfirm").forward(request, response);
			} else {
				// エラーあり→error.jsp
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}
	}
}
