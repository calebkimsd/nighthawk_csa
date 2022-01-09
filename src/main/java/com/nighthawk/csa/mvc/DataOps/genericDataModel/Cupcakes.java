package com.nighthawk.csa.mvc.DataOps.genericDataModel;
import com.nighthawk.csa.utility.ConsoleMethods;

public class Cupcakes extends Generics {
	// Class data
	public static KeyTypes key = KeyType.title;
	public static void setOrder(KeyTypes key) {Cupcakes.key = key;}
	public enum KeyType implements KeyTypes {title, flavor, frosting, sprinkles}

	// Instance data
	private final String frosting;
	private final int sprinkles;
	private final String flavor;

	// Constructor
	Cupcakes(String frosting, int sprinkles, String flavor)
	{
		this.setType("Cupcakes");
		this.frosting = frosting;
		this.sprinkles = sprinkles;
		this.flavor = flavor;
	}

	/* 'Generics' requires getKey to help enforce KeyTypes usage */
	@Override
	protected KeyTypes getKey() { return Cupcakes.key; }

	/* 'Generics' requires toString override
	 * toString provides data based off of Static Key setting
	 */
	@Override
	public String toString() {		
		String output="";
		if (KeyType.flavor.equals(this.getKey())) {
			output += this.flavor;
		} else if (KeyType.frosting.equals(this.getKey())) {
			output += this.frosting;
		} else if (KeyType.sprinkles.equals(this.getKey())) {
			output += "00" + this.sprinkles;
			output = output.substring(output.length() - 2);
		} else {
			output = super.getType() + ": " + this.flavor + ", " + this.frosting + ", " + this.sprinkles;
		}
		return output;
	}

	// Test data initializer
	public static Generics[] cupCakeData() {
		return new Generics[]{
				new Cupcakes("Red", 4, "Red Velvet"),
			    new Cupcakes("Orange", 5, "Orange"),
			    new Cupcakes("Yellow", 6, "Lemon"),
			    new Cupcakes("Green", 7, "Apple"),
			    new Cupcakes("Blue", 8, "Blueberry"),
			    new Cupcakes("Purple", 9, "Blackberry"),
			    new Cupcakes("Pink", 10, "Strawberry"),
			    new Cupcakes("Tan", 11, "Vanilla"),
			    new Cupcakes("Brown", 12, "Chocolate"),
		};
	}
	
	public static void main(String[] args)
	{
		Generics[] cupCake = cupCakeData();
		for(Generics c:  cupCake)
			ConsoleMethods.println(c);
	}
	
}
