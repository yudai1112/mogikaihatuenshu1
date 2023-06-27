package dao;

/*
 * 管理者情報用DAO
 *
 * 2023/6/23
 * 作成：近藤
 */

import java.sql.*;

import bean.Admin;

public class AdminDAO {

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
		//変数名が違わないかチェックしてください

	/**
	 * DBのadministrator_infoテーブルからIDとパスワードの条件に合致する情報を取得
	 *
	 * @param userid
	 * @return userオブジェクト
	 */
		public Admin selectByUser(String admin_id, String password) {

			Connection con = null;
			Statement smt = null;

			Admin admin = new Admin();	//戻り値用

			try {
				con = getConnection();
				smt = con.createStatement();

				//sql文
				String sql = "SELECT * FROM administrator_info WHERE user ='"+admin_id+"' AND password='"+password+"'";

				ResultSet rs = smt.executeQuery(sql);

				//結果セットからユーザー情報を取り出す
				if(rs.next()) {
					admin.setAdminid(rs.getString("user"));
					admin.setPassword(rs.getString("password"));
				}
			}catch(Exception e) {
				throw new IllegalStateException(e);
			}finally {
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
			return admin;
		}

}
