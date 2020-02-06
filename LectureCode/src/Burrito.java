public class Burrito 
{
	/////////////////////////////////////////////////////////////////////
	// Constants 
	private final int MAX_TORTILLAS = 3;
	
	/////////////////////////////////////////////////////////////////////
	// Instance Variables
	private boolean hasGuac;
	private String meatType;
	private int numTortillas;
	private boolean isWrapped;
	
	/////////////////////////////////////////////////////////////////////
	// Default Constructor - Takes no parameters
	public Burrito()
	{
		hasGuac = false;
		meatType = "None";
		numTortillas = 1;
		isWrapped = false;
	}
	
	/////////////////////////////////////////////////////////////////////
	// Overloaded Constructor - Takes parameters
	public Burrito(boolean guac, String meat, int tortillas)
	{
		hasGuac = guac;
		meatType = meat;
		// numTortillas = tortillas;
		setNumTortillas(tortillas);
		isWrapped = false;
	}
	
	/////////////////////////////////////////////////////////////////////
	// Getters - public returnType getInstanceVarName()
	public boolean getHasGuac() { return hasGuac; }
	public String getMeatType() { return meatType; }
	public int getNumTortillas() { return numTortillas; }
	public boolean getIsWrapped() { return isWrapped; }
	
	/////////////////////////////////////////////////////////////////////
	// Setters
	public void setHasGuac(boolean guac) { hasGuac = guac; }
	public void setMeatType(String meat) { meatType = meat; }
	public void setNumTortillas(int tortillas) 
	{ 
		// Do not allow for 0 or a negative number of tortillas; do not
		// allow for a number greater than the max number of tortillas
		if (tortillas < 1)
			numTortillas = 1;
		else if (tortillas > MAX_TORTILLAS)
			numTortillas = MAX_TORTILLAS;
		else // they ask for something in the reasonable range of 1-3
			numTortillas = tortillas; 
	}
	public void setIsWrapped(boolean wrapped) { isWrapped = wrapped; }
	
	/////////////////////////////////////////////////////////////////////
	// Custom methods
	public String eat()
	{
		if (!isWrapped)
			return "SPLAT!";
		else 
			return "YUM!!";
	}
	
	/////////////////////////////////////////////////////////////////////
	// Override the toString() method to return a String that describes the
	// contents/attributes (i.e., the instance variables) of THIS burrito
	public String toString() 
	{
		String ret = "";
		ret += "Meat type = " + this.meatType + "; ";
		if (this.hasGuac)
			ret += "Has guacamole; ";
		ret += "Number of tortillas = " + this.numTortillas + "; ";
		if (isWrapped)
			ret += "Is wrapped.";
		else
			ret += "Is NOT wrapped.";
		
		return ret;
		
	}
	
	/////////////////////////////////////////////////////////////////////////
	// Override the equals() method to the return true of the object (obj)
	// being passed in is a Burrito with the same exact properties as 
	// THIS Burrito
	public boolean equals(Object obj)
	{
		// First check if the object (obj) being passed in is even a burrito
		if (!(obj instanceof Burrito))
			return false;
		else
		{
			Burrito otherBurrito = (Burrito)obj;
			if (this.hasGuac == otherBurrito.hasGuac && 
				this.isWrapped == otherBurrito.hasGuac && 
				this.meatType.equals(otherBurrito.meatType) && 
				this.numTortillas == otherBurrito.numTortillas)
			{
				return true;
			}
			else 
				return false;
		}
	}
}
