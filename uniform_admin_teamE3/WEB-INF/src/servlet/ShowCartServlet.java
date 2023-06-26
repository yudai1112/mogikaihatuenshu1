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
	String error ="";
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
	request.getRequestDispatcher("/view/buyer/showCart.jsp").forward(request, response);
}
}
