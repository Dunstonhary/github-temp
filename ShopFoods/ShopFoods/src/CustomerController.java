import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {

	Product newProduct = new Product();
	User user = new User();
	static int countItem = 0;
	private Scanner scanner;

	public void purchaseItem() {
		try {

			System.out.println("Enter id of the product:");
			scanner = new Scanner(System.in);
			Scanner id = scanner;
			int itemId = id.nextInt();

			if (itemId > 0 && newProduct.getListOfItem().containsKey(itemId)) {
				user.setItemId(itemId);

				System.out.println("How much is the quantity");
				int Quantity = scanner.nextInt();

				if (Quantity > 0 && (Quantity <= newProduct.getListOfItem().get(itemId).getQty())) {
					user.setQuantity(Quantity);

					if (newProduct.getListOfItem().containsKey(itemId) || newProduct.getItemId() != 0) {

						ArrayList<Comparable> al = new ArrayList<Comparable>();
						al.add(itemId);
						al.add(Quantity);
						al.add(newProduct.getListOfItem().get(itemId).getItemName());
						al.add(newProduct.getListOfItem().get(itemId).getprice());

						user.userRecord.put(itemId, al);

						if (Quantity > 0 || Quantity <= newProduct.getListOfItem().get(itemId).getQty()) {
							int sumQty = (newProduct.getListOfItem().get(itemId).getQty() - Quantity);
							newProduct.setQty(sumQty);
							System.out.println("Remaining " + newProduct.getListOfItem().get(itemId).getItemName()
									+ " are: " + newProduct.getQty());
							newProduct.getListOfItem().get(itemId).setQty(sumQty);
							++countItem;

						} else {

							System.out.println("invalid quantity!");

						}
						System.out.println(countItem + " Item added to Cart");
					}

				} else {
					System.out.println("Quantity is not avalible.");
				}
			} else {
				System.out.println("Invalid itemId!");
			}

		} catch (Exception e) {
			System.out.println("ERROR: Please enter a correct(integer) input.");

		}

	}

	public void display() {
		try {
			if (countItem > 0) {
				System.out.println(user.getUserRecord());
			} else {

				System.out.println("Cart is empty!");

			}
		} catch (Exception e) {
			System.out.println(e);
			System.err.print("Exception in displaying\n");
		}
	}

	public void customerBill(String customerName) {

		double TotalAmount = 0;
		try {
			if ((countItem > 0) && Main.CostomerCredidential.contains(customerName)) {

				for (Integer key1 : user.userRecord.keySet()) {

					double sumPrice = (newProduct.getListOfItem().get(key1).getprice() * user.getQuantity());
					System.out.println("Cost applied: " + sumPrice);
					TotalAmount = TotalAmount + sumPrice;
				}

				System.out.println(customerName + " Your Total amount to pay is:" + TotalAmount);
			}

			else {
				System.out.println("Cart is empty or wrong user");
			}

		} catch (

		Exception e) {
			System.out.println("Price cannot be calculated");

		}
	}
}
