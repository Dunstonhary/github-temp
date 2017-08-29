import java.util.HashMap;
import java.util.Scanner;

public class Admin {

	HashMap<String, String> adminCredidential = new HashMap<String, String>();
	private Scanner option;

	public void adminFeed() {
		boolean dataRequired = true;
		AdminController controller = new AdminController();
		ShopView showoption = new ShopView();

		while (dataRequired) {
			try {

				showoption.adminOption();
				option = new Scanner(System.in);
				int choice = option.nextInt();

				switch (choice) {

				case 1:
					controller.addProduct();
					break;
				case 2:
					controller.display();
					break;

				case 3:
					controller.removeProduct();
					break;

				case 4:
					dataRequired = false;
					break;

				default:
					System.out.println("Enter number between 1- 4. ");
					break;
				}

			} catch (Exception e) {
				System.out.println("Enter integer!!!");
			}
		}
	}
}
