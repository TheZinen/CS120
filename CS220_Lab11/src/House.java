import java.text.DecimalFormat;

public class House {

DecimalFormat df = new DecimalFormat("$#,##0");	

		/////////////////////////////////////////////////////////////////////
		// Instance Variables
		private String cityLocation;
		private int numValue;
		private int numBeds;

		/////////////////////////////////////////////////////////////////////
		// Default Constructor - Takes no parameters
		public House() {

			cityLocation = "Azusa";
			numValue = 100000;
			numBeds = 2;
		}

		/////////////////////////////////////////////////////////////////////
		// Overloaded Constructor - Takes parameters
		public House( int value, String city, int beds)
		{
			cityLocation = city;
			numValue = value;
			numBeds = beds;
		}

		/////////////////////////////////////////////////////////////////////
		// Getters - public returnType getInstanceVarName()
		public String getLocation() { return cityLocation; }
		public int getValue() { return numValue; }
		public int getNumBedrooms() { return numBeds; }
		
		/////////////////////////////////////////////////////////////////////
		// Setters
		public void setLocation(String city) { cityLocation = city; }
		public void setValue(int value) { numValue = value; }
		public void setNumBedrooms(int beds) { numBeds = beds; }
		
		/////////////////////////////////////////////////////////////////////
		// Override the toString() method to return a String that describes the
		// contents/attributes (i.e., the instance variables) of THIS house
		public String toString() 
		{
			String ret = "";
			ret += "This house is in " + this.cityLocation + ", ";
			ret += "is worth " + df.format(this.numValue) + " ";
			ret += "and has " + this.numBeds + " bedrooms. ";
			
			return ret;
		}

		/////////////////////////////////////////////////////////////////////////
		// Override the equals() method to the return true of the object (obj)
		// being passed in is a House with the same exact properties as 
		// THIS House
		public boolean equals(Object obj)
		{
			// First check if the object (obj) being passed in is even a House
			if (!(obj instanceof House))
				return false;
			else
			{
				House bigHouse = (House)obj;
				if (this.numBeds == bigHouse.numBeds && 
					this.numValue == bigHouse.numValue && 
					this.cityLocation.equals(bigHouse.cityLocation))
				{
					return true;
				}
				else 
					return false;
			}
		}
	}