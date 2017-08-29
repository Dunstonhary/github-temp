import java.util.Scanner;

public class Costomer {

	static int countItem = 0;
	static Main userName = new Main();
	private static Scanner option;

	public static void costomerSelection(String customerName) {

		CustomerController controller = new CustomerController();
		ShopView showItemsInShop = new ShopView();

		Product newProduct = new Product();

		User user = new User();
		for (Integer i : user.userRecord.keySet()) {
			if (newProduct.getListOfItem().get(i).getQty() == 0) {
				newProduct.getListOfItem().remove(i);
			}
		}
		System.out.println("Id   | Name    |Qty|Price");
		System.out.println(newProduct.getListOfItem());

		boolean n = true;

		while (n) {
			try {

				showItemsInShop.CustomerOptions();
				option = new Scanner(System.in);
				int choice = option.nextInt();

				switch (choice) {

				case 1:
					controller.purchaseItem();
					break;
				case 2:
					controller.display();

					break;
				case 3:

					controller.customerBill(customerName);

					break;

				case 4:

					n = false;
					break;
				default:
					System.out.println("Enter a correct choice!!!");
					break;

				}

			} catch (Exception e) {

				System.err.println("ERROR: Please Enter integer value for item id.");

			}

		}
	}
}
