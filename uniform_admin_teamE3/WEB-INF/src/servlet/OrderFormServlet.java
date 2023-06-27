package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.*;
import dao.*;

/**
 * カート登録機能に関する処理をおこなうサーブレットクラス
 *
 * author KandaITSchool
 *
 */
public class OrderFormServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String error = "";
		String cmd = "";

		HttpSession session = request.getSession();

		// uniform_nameのパラメータを取得
		String uniform_name = request.getParameter("type");
		String uniform_sSize = request.getParameter("sSize");
		String uniform_mSize = request.getParameter("mSize");
		String uniform_lSize = request.getParameter("lSize");
		String uniform_kidsSize = request.getParameter("kidsSize");
		String uniform_result = request.getParameter("result");
		String uniform_bikou = request.getParameter("bikou");

		int sSize = 0;
		if (uniform_sSize != null && !uniform_sSize.isEmpty()) {
			sSize = Integer.parseInt(uniform_sSize);
		}

		int mSize = 0;
		if (uniform_mSize != null && !uniform_mSize.isEmpty()) {
			mSize = Integer.parseInt(uniform_mSize);
		}

		int lSize = 0;
		if (uniform_lSize != null && !uniform_lSize.isEmpty()) {
			lSize = Integer.parseInt(uniform_lSize);
		}

		int kidsSize = 0;
		if (uniform_kidsSize != null && !uniform_kidsSize.isEmpty()) {
			kidsSize = Integer.parseInt(uniform_kidsSize);
		}

		int totalNum = 0;
		if (uniform_result != null && !uniform_result.isEmpty()) {
			totalNum = Integer.parseInt(uniform_result);
		}

		// Orderのインスタンスを生成し、各setterメソッドを利用して値を設定する
		Cart cart = new Cart();

		cart.setUniform_name(uniform_name);
		cart.setsSize(sSize);
		cart.setmSize(mSize);
		cart.setlSize(lSize);
		cart.setKidsSize(kidsSize);
		cart.setTotal(totalNum);
		cart.setBikou(uniform_bikou);

		// セッションからcart_listのList配列を取得する
		ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart_list");

		// 取得できなかった場合はArrayList<Cart>配列を新規で作成する
		if (cart_list == null) {
			cart_list = new ArrayList<Cart>();
		}

		// CartオブジェクトをList配列に追加し、セッションスコープに"cart_list"という名前で登録する
		cart_list.add(cart);
		session.setAttribute("cart_list", cart_list);

		// エラーが無い場合はshowCartServletにフォワード
		request.getRequestDispatcher("/view/buyer/showCart.jsp").forward(request, response);

	}
}
