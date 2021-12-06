package ind_202;

public class items {
	protected String category;
	protected String item;
	protected int quantity;
	protected double price;
	public items(String category, String item, int quantity, double price) {
		super();
		this.category = category;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public void setItemname(String item) {
		this.item = item;
	}
	public String getItemname() {
		return item;
	}
	public void setQuant(int quantity) {
		this.quantity = quantity;
	}
	public int getQuant() {
		return quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

}
