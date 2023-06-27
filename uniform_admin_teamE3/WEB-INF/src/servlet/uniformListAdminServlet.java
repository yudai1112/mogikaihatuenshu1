package servlet;
/**
 *
 */

import javax.servlet.http.HttpServlet;

import bean.Uniform;
import dao.*;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class UniformListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// エラー文を表示する変数errorとコマンドを設定する変数cmdを設定、初期化
		String error = "";
		String cmd = "";

		try {

			// UniformDAOをインスタンス化する
			UniformDAO uniDao = new UniformDAO();

			// 関連メソッドを呼び出し、戻り値としてBookオブジェクトのリストを取得する
			ArrayList<Uniform> uniformList = uniDao.selectAll();

			// 取得したListをリクエストスコープに"unifrom_list"という名前で格納する
			request.setAttribute("uniform_list", uniformList);

		} catch (IllegalStateException e) {
			error = "DB接続エラーの為、一覧表示は行えませんでした。";
			cmd = "menu";
		} finally {
			// エラーの有無でフォワード先を呼び分ける
			if (error.equals("")) {
				// エラーが無い場合はitem_list.jspにフォワード
				request.getRequestDispatcher("/view/admin/uniformListAdmin.jsp").forward(request, response);
			} else {
				// エラーが有る場合はerror.jspにフォワードする
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}
	}
}
