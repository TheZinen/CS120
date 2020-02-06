import java.text.DecimalFormat;
import java.util.Arrays;

public class Order 
{
	//Constant
	private final double BURRITO_BASE_PRICE = 6.85;
	
	// Instance Variables
	private Burrito[] burritos;
	private int numBurritos;
	private double[] prices;
	private double totalPrice;
	
	// Default Constructor
	public Order()
	{
		burritos = new Burrito[5];
		prices = new double[5];
		totalPrice = 0;
		numBurritos = 0;
	}
	
	//Overloaded Constructor
	public Order(Burrito[] burritoArray, double[] priceArray, double totPrice, int numBurr) 
	{
		burritos = burritoArray;
		prices = priceArray;
		totalPrice = totPrice;
		numBurritos = numBurr;
	}

	// Getters 
	public Burrito[] getBurritos() { return burritos; }
	public double[] getPrices() { return prices; }
	public double getTotalPrice() { return totalPrice; }

	// Setters
	public void setBurritos(Burrito[] burritos) { this.burritos = burritos; }
	public void setPrices(double[] prices) { this.prices = prices; }
	public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }

	// Override toString()
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("$0.00");
		if (numBurritos == 0)
			System.out.println("No burritos in your order.");
		else
		{
			String str = "";
			for (int i = 0; i < numBurritos; i++)
			{
				str += "Burrito " + (i+1) + " @ " + prices[i] + "\n";
				str += "\t" + burritos[i] + "\n";
			}
			str += "---------------------";
			str += "Total Price: " + df.format(totalPrice);
			return str;
		}
		return null;
	}

	// Takes in a burrito and adds it to the internal burritos array,
	// also computes the prices of the burrito and adds it to the
	// price array, and also updates the totalPrice
	//
	// Returns true if this new burrito can be processed w/i my limits
	// of 5 burritos; false otherwise
	public boolean addBurrito(Burrito newBurrito) 
	{
		if (numBurritos >= 5)
			return false;
		
		burritos[numBurritos] = newBurrito;
		prices[numBurritos] = computePrice(newBurrito);
		totalPrice += prices[numBurritos];
		numBurritos++;
		return true;
	}
	
	private double computePrice(Burrito newBurrito)
	{
		double price = BURRITO_BASE_PRICE;
		
		// Update prices for meat
		if (newBurrito.getMeatType().toLowerCase().contains("Steak"))
			price += .30;
		else if (newBurrito.getMeatType().toLowerCase().contains("Carnitas"))
			price += .20;
		
		//Update price for guac
		if (newBurrito.getHasGuac())
			price += 2;
		
		return price;
	}
}