package bean;

public class OrderItem {

	private String userid; // ユーザーID

	private String name; // 商品名

	private String date; // 購入日付

	/**
	 * コンストラクタ<br>
	 * オーダー情報の初期設定をおこなう
	 */

	public OrderItem() {
		this.userid = null;
		this.name = null;
		this.date = null;
	}


	//ゲッターメソッド
	public String getUserid() {
		return userid;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}
	//ゲッターここまで




	//セッターメソッド
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(String date) {
		this.date = date;
	}
	//セッターここまで


}
