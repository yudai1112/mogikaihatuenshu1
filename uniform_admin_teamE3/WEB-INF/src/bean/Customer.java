package bean;

public class Customer {

	private int user_id; // ユーザーID

	private String username; // 名前

	private String kana; // なまえのふりがな

	private String mail; // メールアドレス

	private String address; // 住所

	private String remark; // 備考

	/**
	 * コンストラクタ<br>
	 * カスタマー情報の初期設定をおこなう
	 */

	public Customer() {
		super();
		this.user_id = 0;
		this.username = null;
		this.kana = null;
		this.mail = null;
		this.address = null;
		this.remark = null;
	}

	//ゲッターメソッド
	public int getUser_id() {
		return user_id;
	}

	public String getUsername() {
		return username;
	}

	public String getKana() {
		return kana;
	}

	public String getMail() {
		return mail;
	}

	public String getAddress() {
		return address;
	}

	public String getRemark() {
		return remark;

	}
	//ゲッターここまで


	//セッターメソッド
	public void setUser_id(int userid) {
		this.user_id = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setKana(String kana) {
		this.kana = kana;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	//セッターここまで








}
