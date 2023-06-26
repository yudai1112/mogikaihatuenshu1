package dao;

/*
 * 商品情報用DAO
 */

import java.sql.*;
import bean.*;
import java.util.ArrayList;

public class UniformDAO {

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

	public ArrayList<Uniform> selectList() {
		// DB接続
		Connection con = null;
		Statement smt = null;

		// SQL文
		String sql = "SELECT uniform_name, price, img FROM uniform_info ORDER BY uniform_name";

		// ArrayList
		ArrayList<Uniform> uniform_list = new ArrayList<Uniform>();
		try {
			con = getConnection();
			smt = con.createStatement();

			//
			ResultSet rs = smt.executeQuery(sql);

			// 得た情報を格納
			while (rs.next()) {
				Uniform uni = new Uniform();
				uni.setName(rs.getString("uniform_name"));
				uni.setPrice(rs.getInt("price"));
				uni.setImage(rs.getString("img"));
				uniform_list.add(uni);
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
		return uniform_list;
	}

	// DBのユニフォーム情報を格納するuniform_infoテーブルから全ユニフォーム情報を取得するメソッド

	public ArrayList<Uniform> selectAll() {

		// SQL文
		ArrayList<Uniform> list = new ArrayList<Uniform>();
		String sql = "SELECT uniformid,uniformname,size,price,inventory,image FROM uniform_info ORDER BY uniformid";

		// 変数宣言
		Connection con = null;
		Statement smt = null;

		try {
			// DB接続
			con = UniformDAO.getConnection();
			smt = con.createStatement();

			// SQLをDBへ発行
			ResultSet rs = smt.executeQuery(sql);

			while (rs.next()) {
				Uniform uniform = new Uniform();
				uniform.setUniformid(rs.getString("uniformid"));
				uniform.setName(rs.getString("uniformname"));
				uniform.setSize(rs.getString("size"));
				uniform.setPrice(rs.getInt("price"));
				uniform.setInventory(rs.getInt("inventory"));
				uniform.setImage(rs.getString("image"));

				list.add(uniform);
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
		return list;
	}



	public void delete(String uniformid) {

		// 変数宣言
		Connection con = null; // コネクション
		Statement smt = null; // ステートメント

		// SQL文
		String sql = "DELETE FROM uniform_db WHERE uniformid ='" + uniformid + "'";

		try {
			// DBに接続しSQL実行準備
			con = getConnection();
			smt = con.createStatement();

			// SQL実行
			smt.executeUpdate(sql);

		} catch (Exception e) {
			throw new IllegalStateException(e);
		} finally {
			try {
				// コネクションとステートメントのクローズ
				if (smt != null) {
					smt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
			}
		}

	}
}
