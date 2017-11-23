
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import models.Customer;

public class InputMenu {
	public static void main(String[] args) {

		int MenuList;
		String myOrder="";
		do {
			System.out.println("---MENU---");
			String[] menu = { "[1]Flight", "[2]Customer/passenger", "[3]Print total",
					"[4]Order information", "[5]Food Item list","[6]Company",
					"[7]Exit" };
			for (int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}

			String MenuString = JOptionPane.showInputDialog(null, " Choose number: ");
			MenuList = Integer.parseInt(MenuString);
			
			switch (MenuList) {
			case 1:
				RetrieveFlightInfo();
			break;
			case 2:
				Customer customer = new Customer(1, 2, "sujitha", "yeruva", "07332", "sujitha");
				customer.setPreference(2, 'c');
			break;
			case 3:
				JOptionPane.showMessageDialog(null, myOrder);
			break;
			case 4:
				JOptionPane.showMessageDialog(null, "sales \n" + myOrder);
			break;
			case 5:
				FoodOrder foodOrder= new FoodOrder();
				myOrder =foodOrder.retriveFoodOrder();				
			break;
			case 6:
				JOptionPane.showMessageDialog(null, "Exit,Bye");
			break;

			default:
				break;
			}
			
		
		} while (MenuList != 7);
	}

	public static void RetrieveFlightInfo() {
		FlightClass flight = new FlightClass();
		flight.retrieveFligthInfo();
	}
	
	
	
}
