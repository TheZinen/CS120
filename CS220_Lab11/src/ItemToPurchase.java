
public class ItemToPurchase {
		
		
		private String itemName; // Initialized in default constructor to "none"
		private int itemPrice; // Initialized in default constructor to 0
		private int itemQuantity; //Initialized in default constructor to 0

		/////////////////////////////////////////////////////////////////////
		// Default Constructor - Takes no parameters
		public ItemToPurchase()
		{
			itemName = "None";
			itemPrice = 1;
			itemQuantity = 1;
		}
		
		/////////////////////////////////////////////////////////////////////
		// Getters - public returnType getInstanceVarName()
		public String getName() { return itemName; }
		public int getPrice() { return itemPrice; }
		public int getQuantity() { return itemQuantity; }
		
		/////////////////////////////////////////////////////////////////////
		// Setters
		public void setName(String Name) { itemName = Name; }
		public void setPrice(int Price) { itemPrice = Price; }
		public void setQuantity(int Quantity) { itemQuantity = Quantity; }
		
}
