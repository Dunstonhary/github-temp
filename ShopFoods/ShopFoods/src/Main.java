import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static HashSet<String> CostomerCredidential = new HashSet<String>();
	private static Scanner option;
	private static Scanner name;

	public static void main(String arg[]) {
		Admin admin = new Admin();
		admin.adminCredidential.put("shop", "s");
		boolean shopOpen = true;
		ShopView showOptions = new ShopView();
		showOptions.shopItems();
		while (shopOpen) {
			try {
				showOptions.loginTypeOptions();
				option = new Scanner(System.in);
				int choice = option.nextInt();

				switch (choice) {

				case 1:
					System.out.println("Enter name:");
					Scanner inputUserName = new Scanner(System.in);
					String UserName = inputUserName.next();

					System.out.println("Password:");
					Scanner inputPassword = new Scanner(System.in);
					String Password = inputPassword.next();

					if (admin.adminCredidential.containsKey(UserName)
							&& admin.adminCredidential.containsValue(Password)) {
						admin.adminFeed();

					} else {
						System.out.println("Sorry wrong user!!!");

					}

					break;
				case 2:
					try {

						System.out.println("User name:");
						name = new Scanner(System.in);
						String costomerName = name.next();

						CostomerCredidential.add(costomerName);
						System.out.println("Wlcome " + costomerName);
						Costomer.costomerSelection(costomerName);

						System.out.println("Thank you " + costomerName);

					} catch (Exception e) {
						System.out.println(" Enter a valid input1");
					}

					break;

				case 3:
					shopOpen = false;
					break;
				default:
					System.out.println("Please enter digit between 1 to 3!!!");

				}
			} catch (Exception e) {
				System.err.println("Enter integer value!!!");
			}
		}

	}

}