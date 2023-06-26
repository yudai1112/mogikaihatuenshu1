package bean;

public class Cart {

	private String selectedUni;

	private int sSize;

	private int mSize;

	private int lSize;

	private int kidsSize;

	private int total;

	private String bikou;

	public Cart(){
		this.selectedUni = null;
		this.sSize = 0;
		this.mSize = 0;
		this.lSize = 0;
		this.kidsSize = 0;
		this.total = 0;
		String bikou = null;

	}

	public String getSelectedUni() {
		return selectedUni;
	}

	public void setSelectedUni(String selectedUni) {
		this.selectedUni = selectedUni;
	}

	public int getsSize() {
		return sSize;
	}

	public void setsSize(int sSize) {
		this.sSize = sSize;
	}

	public int getmSize() {
		return mSize;
	}

	public void setmSize(int mSize) {
		this.mSize = mSize;
	}

	public int getlSize() {
		return lSize;
	}

	public void setlSize(int lSize) {
		this.lSize = lSize;
	}

	public int getKidsSize() {
		return kidsSize;
	}

	public void setKidsSize(int kidsSize) {
		this.kidsSize = kidsSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getBikou() {
		return bikou;
	}

	public void setBikou(String bikou) {
		this.bikou = bikou;
	}


}

