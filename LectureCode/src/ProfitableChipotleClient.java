public class ProfitableChipotleClient 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Chipotle!");
		
		Order o = new Order();
		
		System.out.println("Before any burritos, our order: ");
		System.out.println(o.toString());
		
		Burrito b1 = new Burrito(true, "Chicken", 1);
		Burrito b2 = new Burrito(true, "Steak", 2);
		
		o.addBurrito(b1);
		o.addBurrito(b2);
		
		System.out.println("After adding, our order: ");
		System.out.println(o.toString());

	}

}
