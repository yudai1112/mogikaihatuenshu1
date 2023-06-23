package bean;

public class Admin {

	private String id; // ログイン用id

	private String password; // ログイン用パスワード

	/**
	 * コンストラクタ<br>
	 * id、passwordの初期設定をおこなう
	 */
	public Admin() {
		this.id = null;
		this.password = null;

	}

	//ゲッターメソッド
	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	//ゲッターここまで




	//セッターメソッド↓
	public void setId(String id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	//セッターここまで

}
