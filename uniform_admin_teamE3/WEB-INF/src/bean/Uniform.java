package bean;

public class Uniform {

	private String uniformid; // 商品No.

	private String name; // 商品名

	private String size; // サイズ

	private String price; // 価格

	private String inventory; // 在庫数

	/**
	 * コンストラクタ<br>
	 * ユニフォームの初期設定をおこなう
	 */

	public Uniform() {
		this.uniformid = null;
		this.name = null;
		this.size = null;
		this.price = null;
		this.inventory = null;
	}

//ゲッターメソッド↓
	public String getUniformid() {
		return uniformid;
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public String getPrice() {
		return price;
	}

	public String getInventory() {
		return inventory;
	}

//ゲッターここまで↑

//セッターメソッド↓
	public void setUniformid(String uniformId) {
		this.uniformid = uniformId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
//セッターここまで↑

}
