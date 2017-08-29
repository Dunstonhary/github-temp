
import java.util.ArrayList;
import java.util.HashMap;

public class User {

	private String name;
	private int itemId;
	private int Quantity;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	HashMap<Integer, ArrayList> userRecord = new HashMap<Integer, ArrayList>();

	public HashMap<Integer, ArrayList> getUserRecord() {
		return userRecord;
	}

	public void setUserRecord(HashMap<Integer, ArrayList> userRecord) {
		this.userRecord = userRecord;
	}

}
