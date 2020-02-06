public class ChristmasTree 
{
	
	//Instance Variables
	private String ornamentStyle;
	private int inchesTall;
	
	// Default Constructor
	
	public ChristmasTree()
	{
		ornamentStyle = "None";
		inchesTall = 0;
	}
	
	// Overloaded Constructor
	public ChristmasTree(String ornStyle, int inchTall)
	{
		ornamentStyle = ornStyle;
		inchesTall = inchTall;
	}
	
	// Getters
	
	public String getOrnStyle() { return ornamentStyle; }
	public int getInchTall() { return inchesTall; }
	
	// Setters
	
	public void setOrnStyle(String ornStyle) { this.ornamentStyle = ornamentStyle; }
	public void setInchTall(int inchTall) { this.inchesTall = inchesTall; }
	
	// Cut tree by x inches
	
	public int cutTree(int userInches)
	{
		inchesTall = (inchesTall - userInches);
		return inchesTall;
	}
	
	// toString method
	
	public String toString()
	{
		String s = "The ornament style is " + ornamentStyle + " and it is " + inchesTall + " inches tall.";
		return s;
	}
	
	// equals
	
	public boolean equals(Object obj)
	{
		//if (!(obj instanceOf christmasTree))
			return false;
	//	else
		//	christmasTree otherChristTree = (christmasTree)obj;
			
	}
	
	public static void main(String[] args) 
	{
		

	}

}
