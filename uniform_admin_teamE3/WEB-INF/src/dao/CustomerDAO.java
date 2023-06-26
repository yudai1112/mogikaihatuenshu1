package dao;

/*
 * 利用者情報用DAO
 */

import java.sql.*;
import bean.*;

public class CustomerDAO {

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

	/*
	 *
	 * 管理者側注文内容詳細確認用 user_idを基に該当書籍データの検索をおこなうメソッド
	 */
	public Customer selectByUser_id(int user_id) {

		// 変数の初期化
		Connection con = null;
		Statement smt = null;

		// オブジェクトを作成
		Customer customer = new Customer();

		try {
			// DB接続
			con = getConnection();
			smt = con.createStatement();

			// SQL文
			String sql = "SELECT * FROM customer_info WHERE user_id ='" + user_id + "'";

			ResultSet rs = smt.executeQuery(sql);

			// 取得結果をオブジェクトに格納
			if (rs.next()) {
				customer.setUser_id(rs.getInt("user_id"));
				customer.setUsername(rs.getString("username"));
				customer.setKana(rs.getString("kana"));
				customer.setMail(rs.getString("mail"));
				customer.setAddress(rs.getString("address"));
				customer.setRemark(rs.getString("remark"));

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
		return customer;
	}

	/**
	 * 
	 * 『 customerInsert 』 引数を元にDBのcustomer_infoテーブルに登録処理を行うメソッド*
	 * 
	 * @param customer 登録する購入者情報のオブジェクト
	 */
	public void customerInsert(Customer customer) {

		Connection con = null;
		Statement smt = null;

		// SQL文
		String sql = "INSERT INTO bookinfo VALUES('" + customer.getName() + "','" + customer.getMailAddress() + "','"
				+ customer.getAddress() + "','" + customer.getRemark() + "')";

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
}