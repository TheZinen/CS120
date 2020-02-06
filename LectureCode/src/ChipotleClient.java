public class ChipotleClient 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Chipotle. Please make an order.");
		
		// Make a NEW instance of a Burrito
		Burrito myBurrito = new Burrito();
		Burrito yourBurrito = new Burrito(true, "Steak", 2);
		Burrito your2ndBurrito = new Burrito(true, "Steak", 2);

		// Print out meat type
		System.out.println("Type of meat in MY burrito: " + myBurrito.getMeatType());
		System.out.println("Type of meat in YOUR burrito: " + yourBurrito.getMeatType());
		
		// Update myBurrito and print out
		System.out.println("\nWow, your burrito is waaaayyyy better than mine...");
		//myBurrito.setHasGuac(true);
		myBurrito.setNumTortillas(15);
		myBurrito.setMeatType("Chicken + Steak + Carnitas");
		myBurrito.setIsWrapped(true);
		System.out.println("Type of meat in MY burrito: " + myBurrito.getMeatType());
		System.out.println("Not no more my friends!");
		
		System.out.println("MY Burrito: \n\t" + myBurrito.toString());
		System.out.println("YOUR Burrito: \n\t" + yourBurrito.toString());
		
		System.out.println("\nMY Burrito being eaten: " + myBurrito.eat());
		System.out.println("YOUR Burrito being eaten: " + yourBurrito.eat());
		
		System.out.println("\nmyBurrito.equals(yourBurrito): " + myBurrito.equals(yourBurrito)); // False
		System.out.println("yourBurrito.equals(your2ndBurrito): " + yourBurrito.equals(your2ndBurrito)); // T
		System.out.println("yourBurrito == your2ndBurrito: " + (yourBurrito == your2ndBurrito)); //
	}
}