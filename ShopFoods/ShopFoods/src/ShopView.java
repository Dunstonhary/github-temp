
public class ShopView {
	public void shopItems() {

		System.out.println(",---------------------,");
		System.out.println("| WELCOME TO FOOD SHOP|");
		System.out.println("'---------------------'");

	}

	public void CustomerOptions() {
		System.out.println("\nSelect an option!");
		System.out.println("1.Purchase item");
		System.out.println("2.Display cart");
		System.out.println("3.Bill");
		System.out.println("4.Exit the menu");
		System.out.print("> ");
	}

	public void adminOption() {
		System.out.println("\nSelect an option");
		System.out.println("1.Add product");
		System.out.println("2.Display product");
		System.out.println("3.Remove product ");
		System.out.println("4.Exit");
		System.out.print("> ");
	}

	public void loginTypeOptions() {
		System.out.println("\nSelect login type!");
		System.out.println("1.Admin");
		System.out.println("2.Customer");
		System.out.println("3.Exit the menu");
		System.out.print("> ");
	}
}
