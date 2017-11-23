import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class FoodOrder {
	public int totalSumForFood=0;
	public FoodOrder() {

	}
	
	public String retriveFoodOrder() {
		String myOrder = "No order currently set";
		System.out.println();
		Map map = new HashMap();
		map.put("hotdog", 5);
		map.put("donut", 15);
		map.put("eggpie", 25);
		map.put("pizza", 35);
		map.put("lasagna", 45);

		String[] list = { "hotdog", "donut", "eggpie", "pizza", "lasagna" };
		int[] cost = { 5, 15, 25, 35, 45 };
		int[] price = { 10, 20, 30, 40, 50 };
		int[] qty = { 5, 5, 5, 5, 5 };
		System.out.println("item" + "\tcost" + "\tSelling" + "\tinv qty");
		for (int m = 0; m < list.length; m++) {
			System.out.println(list[m] + "\t" + cost[m] + "\t\t" + price[m] + "\t\t" + qty[m]);
		}

		myOrder = "";
		ArrayList<String> Orders = new ArrayList<String>();
		int totalbillamount = 0;
		for (int i = 0; i < 1; i++) {
			String input = (String) JOptionPane.showInputDialog(null, "Select an Item", "Welcome " + "!",
					JOptionPane.QUESTION_MESSAGE, null, list, "Hotdog");

			int itemQty = 0;
			String itemq = JOptionPane.showInputDialog(null, "Input Quantity");
			itemQty = Integer.parseInt(itemq);

			if (itemQty < 1 || itemQty > 5) {
				JOptionPane.showMessageDialog(null, "Invalid!");
				itemq = JOptionPane.showInputDialog(null, "Input Quantity");
			}

			int subtotal = 0;
			subtotal = itemQty * Integer.parseInt(map.get(input).toString());
			totalbillamount += subtotal;
			Orders.add("Item " + input + "  Quantity " + itemq + " Price " + subtotal);
		}
		Orders.add("Total Bill Amount of your order is " + totalbillamount);
		totalSumForFood= totalbillamount;
		for (String s : Orders) {
			myOrder += "\n" + s;
		}
		return myOrder;

	}
}
