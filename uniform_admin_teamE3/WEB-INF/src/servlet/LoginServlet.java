package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import bean.Admin;
import dao.AdminDAO;

/**
 * ログイン機能に関する処理をおこなうサーブレットクラス
 *
 * @author KandaITSchool
 *
 */
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String error = "";
		String cmd = "";

		try {

			//IDとパスワードの入力パラメータを取得する
			String id = (String) request.getParameter("id");
			String password = (String) request.getParameter("password");

			// AdminDAOをインスタンス化し、ユーザー情報の検索をおこなう
			AdminDAO userDaoObj = new AdminDAO();
			Admin user = userDaoObj.selectByUser(id, password);

			// ユーザー情報のチェック
			 if (user.getId() == null) {
				error = "入力データが間違っています。";
				cmd = "login";
				return;
			}

			// ユーザー情報がある場合、セッションにスコープにuserという名前で登録する
			HttpSession session = request.getSession();
			session.setAttribute("user", user);

			// クッキーに入力情報のIDとパスワードを登録する（期限は5日間）new Cookie("user", String.valueOf(user.getUser_id()))
			Cookie userCookie = new Cookie("id", String.valueOf(user.getId() ) );
			userCookie.setMaxAge(60 * 60 * 24 * 5);
			response.addCookie(userCookie);

			Cookie passCookie = new Cookie("password", user.getPassword());
			passCookie.setMaxAge(60 * 60 * 24 * 5);
			response.addCookie(passCookie);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、ログイン出来ません。";
			cmd = "login";

		} finally {
			if (error.equals("")) {
				request.getRequestDispatcher("/view/admin/order_list.jsp").forward(request,
						response);
			} else {
				request.setAttribute("error", error);
				if (cmd.equals("login")) {
					request.getRequestDispatcher("/view/admin/login.jsp").forward(
							request, response);
				} else {
					request.setAttribute("cmd", cmd);
					request.getRequestDispatcher("/view/admin/error.jsp").forward(
							request, response);
				}
			}
		}

	}
}
