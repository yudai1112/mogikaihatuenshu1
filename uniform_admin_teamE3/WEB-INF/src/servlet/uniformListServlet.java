package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import bean.*;
import java.util.ArrayList;

public class UniformListServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//必要クラスをインスタンス化
		UniformDAO uniDao = new UniformDAO();
		ArrayList<Uniform> uniform_list = new ArrayList<Uniform>();

		//uniform_listにselectListメソッドを呼び出し格納
		uniform_list = uniDao.selectList();

		//リクエストスコープに登録
		request.setAttribute("uniform_list", uniform_list);

		//JSPにフォワード
		request.getRequestDispatcher("/view/buyer/productList.jsp").forward(request, response);

	}
}
