import java.util.Scanner;

public class AdminController {
	Product newProduct = new Product();
	private Scanner pid;
	private Scanner pname;
	private Scanner pprice;
	private Scanner pqty;
	private Scanner idtobedeleted;

	public void addProduct() {
		int ProductId = 0;
		String ProductName;
		double ProductPrice = 0;
		boolean validId;

		boolean validPrice;
		boolean validQuantity;
		do {
			validId = false;
			System.out.println("Enter product id:");
			try {
				pid = new Scanner(System.in);
				ProductId = pid.nextInt();
				newProduct.setItemId(ProductId);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("sorry, Type Integer only");
				validId = true;
			}

		} while (validId);

		System.out.println("Enter product name:");
		pname = new Scanner(System.in);
		ProductName = pname.next();
		newProduct.setItemName(ProductName);

		do {
			validPrice = false;
			System.out.println("Enter price per unit:");
			try {
				pprice = new Scanner(System.in);
				ProductPrice = pprice.nextDouble();
				newProduct.setprice(ProductPrice);
			} catch (Exception e) {
				System.out.println("Sorry! enter integer value only.");
				validPrice = true;
			}
		} while (validPrice);

		do {
			validQuantity = false;
			System.out.println("Enter product quantity:");
			try {
				pqty = new Scanner(System.in);
				int PriductQuantity = pqty.nextInt();
				newProduct.setQty(PriductQuantity);
			} catch (Exception e) {
				System.out.println("Sorry! enter integer only.");
				validQuantity = true;
			}
		} while (validQuantity);

		newProduct.getListOfItem().put(ProductId, newProduct);

		newProduct = new Product();
	}

	public void removeProduct() {
		try {
			if (newProduct.getListOfItem().isEmpty()) {
				System.out.println("There is nothig to remove from shop.");
			} else {
				System.out.println("Enter id of product to delete from shop:");
				idtobedeleted = new Scanner(System.in);
				int removeItem = idtobedeleted.nextInt();
				if (newProduct.getListOfItem().containsKey(removeItem)) {
					newProduct.getListOfItem().remove(removeItem);
					System.out.println("Deleted succesfuly");
				} else {
					System.out.println("Product doe not exist in shop.");
				}
			}
		} catch (Exception e) {
			System.out.println("Error: enter a valid product id. ");
		}
	}

	public void display() {
		System.out.println(newProduct.getListOfItem());
	}
}
