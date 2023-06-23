package dao;

/*
 * 注文情報用DAO
 */


import java.sql.*;

import bean.Order;
import bean.Uniform;


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
				+ "VALUES('"+ order.getUniformid() + "','"+ order.getUserid() +"','"+ order.getQuantity() +"','"+ order.getQuantity() +\"',"
				+ order.getQuantity() +",CURDATE())";

		try {
			con = UniformDAO.getConnection();
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
}
