package bean;

public class Order {

	private int orderno; // 注文No.

	private String uniformid; // 商品No.

	private String userid; // 購入者のユーザID

	private int quantity; // 購入数

	private String orderremark; // その他要望

	private String date; // 商品の購入日付

	private String paymentstatus; // 入金情報

	private String sendstatus; // 発送状況

	//↓6/23追加、対応するget,set,コンストラクタも追加。(定直)

	private String username;	//注文者名前

	private String uniformname;	//商品名前

	private int uniformPrice;		//商品価格

	//↑6/23

	/**
	 * コンストラクタ<br>
	 * 注文状況の初期設定をおこなう
	 */
	public Order() {
		this.orderno = 0;
		this.uniformid = null;
		this.userid = null;
		this.quantity = 0;
		this.orderremark = null;
		this.date = null;
		this.paymentstatus = null;
		this.sendstatus = null;
		this.username = null;
		this.uniformname = null;
		this.uniformPrice= 0;
	}

	//ゲッターメソッド↓
	public int getOrderno() {
		return orderno;
	}

	public String getUniformid() {
		return uniformid;
	}

	public String getUserid() {
		return userid;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getOrderremark() {
		return orderremark;
	}

	public String getDate() {
		return date;
	}

	public String getPaymentstatus() {
		return paymentstatus;
	}

	public String getSendstatus() {
		return sendstatus;
	}

	public String getUsername() {
		return username;
	}

	public String getUniformname() {
		return uniformname;
	}

	public int getUniformPrice() {
		return uniformPrice;
	}

	//ゲッターここまで↑



	//セッターメソッド↓
	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public void setUniformid(String uniformid) {
		this.uniformid = uniformid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setOrderremark(String orderremark) {
		this.orderremark = orderremark;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public void setSendstatus(String sendstatus) {
		this.sendstatus = sendstatus;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUniformname(String uniformname) {
		this.uniformname = uniformname;
	}

	public void setUniformPrice(int uniformPrice) {
		this.uniformPrice = uniformPrice;
	}
	//セッターここまで↑
}
