import java.util.Scanner;
import java.util.ArrayList;

public class OrderMenu {
	/* procedure:
	 * create a String arrayList
	 * collect menu items via user input
	 * repeat order, calculate total
	 * output to console
	 * repeat if desired
	 */
	public static void main(String[] args) {
		
		// generate scanner
		Scanner scnr = new Scanner(System.in);
		// generate ArrayList of customer's order
		ArrayList<MenuItem> customersOrderList = new ArrayList<MenuItem>();
		// user input
		String newItem = "start";
		// while loop nesting while loop
		String newOrder = "yes";
		
		// generate output
		while (newOrder.equals("yes")) {
			// reset all array and arrayList values
			customersOrderList.clear();
			// reset counter variable
			newItem = "start";
			
			System.out.println("Choose an item of the following\n"
					+ "-------------------------------\n"
					+ "hamburger\nfries\nsoda"
					+ "\n-------------------------------"
					+ "\nEnter \"finish\" to complete order");
			
			// each iteration either adds one of the three items to the list,
			// or it terminates the while loop.
			while (!newItem.toLowerCase().equals("finish")) {
				newItem = scnr.next();
				
				switch(newItem.toLowerCase()) {
				
				case "hamburger":
					customersOrderList.add(new MenuItem("hamburger"));
					System.out.println("item added");
					break;
					
				case "fries":
					customersOrderList.add(new MenuItem("fries"));
					System.out.println("item added");
					break;
					
				case "soda":
					customersOrderList.add(new MenuItem("soda"));
					System.out.println("item added");
					break;
					
				case "finish":
					break;
					
				default:
					System.out.println("incorrect entry, try again");
				}
			}
			
			// repeat the customers order
			repeatOrder(customersOrderList);
			
			System.out.println("Start new order?: yes or no");
			newOrder = scnr.next();
		}
		System.out.println("PROGRAM FINISHED");
		scnr.close();
	}
	
	public static void repeatOrder(ArrayList<MenuItem> customersOrderList) {
		// calculate total
		double total = 0;
		
		// repeat the customers order
		System.out.println("Customer ordered " + customersOrderList.size() + " items:"
				+ "\n-------------------------------");
		// every iteration adds up to the total
		for (int i = 0; i < customersOrderList.size(); ++i) {
			System.out.println(customersOrderList.get(i).getType() + " - "
					+ customersOrderList.get(i).getName() + ": " + customersOrderList.get(i).getPrice());
			total += customersOrderList.get(i).getPrice();
		}
		System.out.println("\nTotal: " + total 
				+ "\n-------------------------------");		
		
		
	}
}

