package bean;

public class Uniform {

	private String uniformid; // 商品No.

	private String name; // 商品名

	private String size; // サイズ

	private int price; // 価格

	private int inventory; // 在庫数

	private String image;

	/**
	 * コンストラクタ<br>
	 * ユニフォームの初期設定をおこなう
	 */

	public Uniform() {
		this.uniformid = null;
		this.name = null;
		this.size = null;
		this.price = 0;
		this.inventory = 0;
		this.image = null;
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

	public int getPrice() {
		return price;
	}

	public int getInventory() {
		return inventory;
	}

	public String getImage() {
		return image;
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

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public void setImage(String image) {
		this.image = image;
	}
//セッターここまで↑

}
