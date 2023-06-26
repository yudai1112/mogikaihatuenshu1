package servlet;

import bean.Uniform;
import dao.*;

import java.io.*;
import java.util.*;
import javax.servlet.*;

/**
 *
 */
import javax.servlet.http.*;

public class DeleteConfirmServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// コンテンツタイプの設定
		request.setCharacterEncoding("UTF-8");

		// インスタンス化
		//uniDao = new uniDao();

		// パラメータの取得
		String uniformid  = request.getParameter("uniformid");

		// deleteメソッド呼び出し
		uniDao.delete(uniformid);

		// listにフォワード
		request.getRequestDispatcher("/list").forward(request, response);

	}

}
