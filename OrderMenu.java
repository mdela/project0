package genericRestaurant;

import java.util.Scanner;
import java.util.ArrayList;

public class OrderMenu {
	/* 
	 * create while loop,
	 * get customer's orders.
	 * after finishing while loop,
	 * generate array of the items 
	 */
	public static void main(String[] args) {
		
		// generate scanner
		Scanner scnr = new Scanner(System.in);
		// generate ArrayList of customer's order
		// string ArrayList is JUST FOR REPEATING CUSTOMER'S ORDER
		ArrayList<String> customersOrderList = new ArrayList<String>();
		// ArrayList<MenuItem> is for the actual processing
		MenuItem customersOrder[];
		// user input
		String input = "start";
	
		// while loop nesting while loop
		String newOrder = "yes";
		
		int number = 1;
		// generate output
		while (newOrder.equals("yes")) {
			System.out.println("Choose an item of the following\n"
					+ "-------------------------------\n"
					+ "hamburger\nfries\nsoda"
					+ "\n-------------------------------"
					+ "\nEnter \"finish\" to complete order");
			while (!input.toLowerCase().equals("finish")) {
				input = scnr.next();
				
				switch(input.toLowerCase()) {
				
				case "hamburger":
					customersOrderList.add(input.toLowerCase());
					System.out.println("item added");
					break;
					
				case "fries":
					customersOrderList.add(input.toLowerCase());
					System.out.println("item added");
					break;
					
				case "soda":
					customersOrderList.add(input.toLowerCase());
					System.out.println("item added");
					break;
					
				case "finish":
					break;
					
				default:
					System.out.println("incorrect entry, try again");
				}
			}
			System.out.println("Customer ordered " + customersOrderList.size() + " items:");
			
			// repeat the customers order
			customersOrder = createMenuItemsList(customersOrderList);
			repeatOrder(customersOrder);
			
			System.out.println("Start new order?: yes or no"); // TODO: FIX while loop to reset all values
			newOrder = scnr.next();
		}
	}
	
	public static void repeatOrder(MenuItem[] order) {
		for (int i = 0; i < order.length; ++i) {
			System.out.println(order[i].getType() + " - " + order[i].getName() + ": " + order[i].getPrice());
		}
	}
	public static MenuItem[] createMenuItemsList(ArrayList<String> order) {
		MenuItem menuItemsList[] = new MenuItem[order.size()];
		for (int i = 0; i < menuItemsList.length; ++i) {
			switch(order.get(i)) {
			case "hamburger":
				menuItemsList[i] = new MenuItem("hamburger");
				break;
			case "fries":
				menuItemsList[i] = new MenuItem("fries");
				break;
			case "soda":
				menuItemsList[i] = new MenuItem("soda");
				break;
			}
		}
		return menuItemsList;
	}
}

