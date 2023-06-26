package dao;

/*
 * 注文情報用DAO
 */

import java.sql.*;
import java.util.ArrayList;
import bean.*;
import servlet.*;

public class OrderDAO {

	// DB情報をフィールド変数に定義
	/**
	 * JDBCドライバ内部のDriverクラスパス
	 */
	private static final String RDB_DRIVE = "com.mysql.jdbc.Driver";
	/**
	 * 接続するMySQLデータベースパス
	 */
	private static final String URL = "jdbc:mysql://localhost/uniform_db";
	/**
	 * データベースのユーザー名
	 */
	private static final String USER = "root";
	/**
	 * データベースのパスワード
	 */
	private static final String PASSWD = "root123";

	/**
	 * フィールド変数の情報を基に、DB接続をおこなうメソッド
	 *
	 * @return データベース接続情報
	 * @throws IllegalStateException メソッド内部で例外が発生した場合
	 */
	public static Connection getConnection() {
		try {
			Class.forName(RDB_DRIVE);
			Connection con = DriverManager.getConnection(URL, USER, PASSWD);
			return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

//  -------------------------------------------------------------------------------------------

	/**
	 * 『 insert 』
	 *
	 * 引数の購入データを元にDBのorderinfoテーブルに新規登録処理を行うメソッド
	 *
	 */
	public void insert(Order order) {

		Connection con = null;
		Statement smt = null;

// *****ここから作成途中*****

		// SQL文
		String sql = "INSERT INTO order_info (uniform_id, user_id, quantity, order_remark, order_date, payment_status, send_status) "
				+ "VALUES('" + order.getUniformid() + "','" + order.getUserid() + "','" + order.getQuantity() + "','"
				+ order.getQuantity() + "'," + order.getQuantity() + ",CURDATE())";

		try {
			con = getConnection();
			smt = con.createStatement();

			// SQL文をDBへ発行
			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			// クローズ処理
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

// ordernoを基に該当書籍データの検索をおこなうメソッド
	public Order selectByOrderno(int orderno) {

		// 変数の初期化
		Connection con = null;
		Statement smt = null;

		// オブジェクトを作成
		Order order = new Order();

		try {
			// DB接続
			con = getConnection();
			smt = con.createStatement();

			// SQL文
			String sql = "SELECT A.*,C.uniform_name FROM order_info A LEFT JOIN uniform_info C ON A.uniform_id = C.uniform_id WHERE orderno = "+ orderno + ";";

			ResultSet rs = smt.executeQuery(sql);

			// 取得結果をオブジェクトに格納
			if (rs.next()) {
				order.setOrderno(rs.getInt("orderno"));
				order.setUniformid(rs.getString("uniformid"));
				order.setUserid(rs.getString("userid"));
				order.setQuantity(rs.getInt("quantity"));
				order.setOrderremark(rs.getString("orderremark"));
				order.setDate(rs.getString("date"));
				order.setPaymentstatus(rs.getString("paymentstatus"));
				order.setSendstatus(rs.getString("sendstatus"));
				order.setUniform_name(rs.getString("uniform_name"));

			}
		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			if (smt != null) {
				try {
					smt.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}
		return order;
	}


	/*
	 * 注文情報全件取得メソッド(利用者名前、商品名も)(jojiki)
	 */
	public ArrayList<Order> selectAll() {

		//DB接続用の変数宣言
		Connection con = null;
		Statement smt = null;

		//検索した書籍情報を格納するArrayListオブジェクトを生成
		ArrayList<Order> order_list = new ArrayList<Order>();

		//SQL文
		String sql = "SELECT A.*,B.username,C.uniform_name,C.price FROM order_info A LEFT JOIN customer_info B ON A.user_id = B.user_id" +
					"LEFT JOIN uniform_info C ON A.uniform_id = C.uniform_id ORDER BY order_id DESC";

		try {

			//DB接続
			con = getConnection();
			smt = con.createStatement();

			//SQL文を発行し結果セットを取得
			ResultSet rs = smt.executeQuery(sql);

			//結果セットからデータを検索件数分全て取り出し配列にオブジェクトとして格納
			while(rs.next()) {
				Order orderinfo = new Order();

				orderinfo.setOrderno(rs.getInt("order_id"));
				orderinfo.setUniformid(rs.getString("uniform_id"));
				orderinfo.setUserid(rs.getString("user_id"));
				orderinfo.setQuantity(rs.getInt("quantity"));
				orderinfo.setOrderremark(rs.getString("order_remark"));
				orderinfo.setDate(rs.getString("order_date"));
				orderinfo.setPaymentstatus(rs.getString("payment_status"));
				orderinfo.setSendstatus(rs.getString("send_status"));

				orderinfo.setUsername(rs.getString("username"));
				orderinfo.setUniformname(rs.getString("uniform_name"));
				orderinfo.setUniformPrice(rs.getInt("price"));

				order_list.add(orderinfo);
			}

			return order_list;

		} catch (Exception e) {
			//例外処理
			throw new IllegalStateException(e);

		} finally {
			//リソースの開放
			if( smt != null ) {
				try {smt.close();}catch(SQLException ignore) {}
			}
			if( con != null) {
				try {con.close();}catch(SQLException ignore) {}
			}

		}

	}


}
