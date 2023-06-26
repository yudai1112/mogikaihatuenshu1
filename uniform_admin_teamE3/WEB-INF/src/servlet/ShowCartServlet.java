package servlet;

import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.http.*;
import bean.*;
import dao.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ShowCartServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	// 入力データの文字コード指定
	request.setCharacterEncoding("UTF-8");

	String error ="";
	String cmd ="";
	try {
	Uniform uniform = new Uniform();

	String delno = request.getParameter("delno");

	//セッションからcart_listを取得
	HttpSession session = request.getSession();
	ArrayList<Cart> cart_list = (ArrayList<Cart>)session.getAttribute("cart_list");

	if(delno != null) {
		cart_list.remove(Integer.parseInt(delno));
	}



	//cart_listをリクエストスコープに登
	request.setAttribute("cart_list", cart_list);
	}catch(Exception e) {
		error = "DB接続エラーの為、カート状況は確認出来ません。";
		cmd = "logout";

	}finally {
		if(error.equals("")) { //カート表示に遷移
			request.getRequestDispatcher("/view/buyer/showCart.jsp").forward(request, response);
		}else {
			request.setAttribute("error", error);
			request.setAttribute("cmd", cmd);
			request.getRequestDispatcher("/view/error.jsp").forward(request, response);
		}
	}
}
}
