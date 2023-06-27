/* 商品登録処理 */

package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import bean.Uniform;
import dao.UniformDAO;

public class InsertUniformServlet extends HttpServlet {

	//doGetメソッド
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		//エラー用の変数宣言
		String error = "";
		String cmd = "";

		try {

			//入力データの文字指定
			request.setCharacterEncoding("UTF-8");

			//入力パラメータの取得
			String uniformid = request.getParameter("uniformid");	//商品番号
			String name = request.getParameter("name");				//商品名
			String size = request.getParameter("size");				//サイズ
			String strInventry = request.getParameter("inventory");	//在庫数(String型)
			String strPrice = request.getParameter("price");		//価格(String型)
			String image = request.getParameter("image");			//画像URL

			//取得したパラメータの各エラーチェック
			//空白チェック
			if(uniformid.equals("")) {
				error = "商品番号が未入力の為、商品登録処理は行えませんでした。";
				cmd = "";
				return;
			}

			if(name.equals("")) {
				error = "商品名が未入力の為、商品登録処理は行えませんでした。";
				cmd = "";
				return;
			}

			if(size.equals("")) {
				error = "サイズが未入力の為、商品登録処理は行えませんでした。";
				cmd = "";
				return;
			}

			if(strInventry.equals("")) {
				error = "在庫数が未入力の為、書籍登録処理は行えませんでした。";
				cmd = "";
				return;
			}

			if(strPrice.equals("")) {
				error = "価格が未入力の為、書籍登録処理は行えませんでした。";
				cmd = "";
				return;
			}

			//画像はなしもOK？
			//if(image.equals("")) {
			//	error = "画像（URL）が未入力の為、商品登録処理は行えませんでした。";
			//	cmd = "";
			//	return;
			//}

			//在庫数整数値チェック
			int inventry;
			try {
				inventry = Integer.parseInt(strInventry);
			} catch (NumberFormatException e) {
				error = "在庫数の値が不正の為、商品登録処理は行えませんでした。";
				cmd = "";
				return;
			}

			//価格整数値チェック
			int price;
			try {
				price = Integer.parseInt(strPrice);
			} catch (NumberFormatException e) {
				error = "価格の値が不正の為、商品登録処理は行えませんでした。";
				cmd = "";
				return;
			}

			//DAOクラスのオブジェクト生成
			UniformDAO objDao = new UniformDAO();

			//商品番号の重複チェック（メソッド確認）
			//		if(objDao.selectByUniformid(uniformid).getIsbn() != null) {
			//			error = "入力ISBNは既に登録済みの為、書籍登録処理は行えませんでした。";
			//			cmd = "list";
			//			return;
			//		}

			//登録する商品情報を格納するオブジェクト生成、DTOクラスの変数に格納
			Uniform uniform = new Uniform();
			uniform.setUniformid(uniformid);
			uniform.setName(name);
			uniform.setSize(size);
			uniform.setInventory(inventry);
			uniform.setPrice(price);
			uniform.setImage(image);

			//insert()メソッド呼び出してBookオブジェクトに格納された書籍データをDBに登録
			objDao.insert(uniform);

		} catch(Exception e) {
			//エラーの有無でフォワード先を呼び分ける
			if(error.equals("")) {
				//エラーなし、商品一覧表示画面へフォワード
				request.getRequestDispatcher("/uniformListAdmin").forward(request, response);
			} else {
				//エラーあり、エラー画面へフォワード
				request.setAttribute("error", error);
				request.setAttribute("cmd", cmd);
				request.getRequestDispatcher("/view/error.jsp").forward(request, response);
			}
		}
	}

}
