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
	//セッターここまで↑
}
