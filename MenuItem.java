public class MenuItem {
	// this class is for the food items on the menu
	
	// fields
	private String name;
	private String type; // type refers to either drink or burger
	private double price;
	
	// constructors
	public MenuItem(){
		name = "hamburger";
		type = "burger";
		price = 5.00;
	}
	public MenuItem(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	public MenuItem(String name) {
		switch(name.toLowerCase()) {
		case "hamburger":
			this.name = "hamburger";
			type = "entree";
			price = 4.00;
			break;
			
		case "fries":
			this.name = "fries";
			type = "side";
			price = 3.00;
			break;
			
		case "soda":
			this.name = "soda";
			type = "drink";
			price = 2.00;
			break;
		}
	}
	
	// mutators 
	// these would be good for deals and discounts
	public void setPrice(double price) {
		this.price = price;
	}
	
	// accessors
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public double getPrice() {
		return price;
	}
}
