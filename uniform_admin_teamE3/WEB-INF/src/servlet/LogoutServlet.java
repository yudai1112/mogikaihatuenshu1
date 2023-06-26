/* ログアウト処理 */

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {

	//doGetメソッド
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException,IOException {

		//①セッション情報をクリアにする
		HttpSession session = request.getSession();
		session.invalidate();

		//②ログイン画面にフォワードする
		request.getRequestDispatcher("/view/login.jsp").forward(request, response);

	}

}
