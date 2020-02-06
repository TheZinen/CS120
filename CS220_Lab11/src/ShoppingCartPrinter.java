import java.util.Scanner;

public class ShoppingCartPrinter {

	public static void main(String[] args) {
		System.out.println("Item 1");
		ItemToPurchase item1 = new ItemToPurchase();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the item name: " ); 
		item1.setName(scan.nextLine());
		System.out.println("Enter the item price: " );
		item1.setPrice(scan.nextInt());
		System.out.println("Enter the item quantity: " );
		item1.setQuantity(scan.nextInt());

		scan.nextLine();
		
		System.out.println("\nItem 2");
		
		ItemToPurchase item2 = new ItemToPurchase();
		System.out.println("Enter the item name: ");
		item2.setName(scan.nextLine());
		System.out.println("Enter the item price: ");
		item2.setPrice(scan.nextInt());
		System.out.println("Enter the item quantity: ");
		item2.setQuantity(scan.nextInt());
		
		System.out.println("\nTOTAL COST");
		int totalCost1 = 0;
		int totalCost2 = 0;
		
		String item1Name = item1.getName();
		String item2Name = item2.getName();
		int item1Quantity = item1.getQuantity();
		int item1Price = item1.getPrice();
		int item2Quantity = item2.getQuantity();
		int item2Price = item2.getPrice();
		
		totalCost1 = item1Quantity * item1Price;
		totalCost2 = item2Quantity * item2Price;
		System.out.println(item1Name + " " + item1Quantity  + " @ $" + item1Price + " = " + "$" + totalCost1);
		System.out.println(item2Name + " " + item2Quantity + " @ $" + item2Price + " = " + "$" + totalCost2);
		
		int totalCost3 = totalCost1 + totalCost2;
		System.out.println("\nTotal: $" + totalCost3);
	}

}
