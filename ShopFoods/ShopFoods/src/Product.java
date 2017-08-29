import java.util.HashMap;

public class Product {
	private static HashMap<Integer, Product> listOfItem = new HashMap<Integer, Product>();
	Admin admintemp = new Admin();
	private int ItemId;
	private String itemName;
	private int qty;
	private double price;

	public int getItemId() {
		return ItemId;
	}

	public void setItemId(int ItemId) {

		this.ItemId = ItemId;
	}

	public String getItemName() {
		return itemName;
	}

	@Override
	public String toString() {
		return "[" + ItemId + "|" + itemName + "|" + qty + "  |" + price + "|" + "]\n";

	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {

		this.qty = qty;
	}

	public double getprice() {
		return price;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public HashMap<Integer, Product> getListOfItem() {
		return listOfItem;
	}

	public void setListOfItem(HashMap<Integer, Product> listOfItem) {
		Product.listOfItem = listOfItem;
	}

}