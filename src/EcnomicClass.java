import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EcnomicClass implements Aeroplane{
	public List<Aeroplane> itemsList = new ArrayList<Aeroplane>();
	 public double subTotal;
public double runningTotal;
public double runningTotal2;
  
   private  double itemPrice;
    boolean ordering = true;
    Scanner input = new Scanner(System.in);

    public void menu(){
   	    System.out.println("Welcome \n1. Chicken_Sandwich (sek20.00) \n2. Veg_Sandwich (sek10.50)\n3. Soda (sek10.00) \n4. Done\n5.printList");
   	}
   	public double itemPrice(int foodItem) {
   	    if (foodItem == 1) {
   	        //burger= sek20.00
   	        System.out.println("You've ordered a chicken sandwich");
   	        itemPrice = 20.00;
   	    }
   	    if (foodItem == 2) {
   	        //fries = sek10.50
   	        System.out.println("You've ordered veg Sandwich");
   	        itemPrice = 10.50;
   	    }
   	    if (foodItem == 3) {
   	        //soda = sek10.00
   	        System.out.println("You've ordered a soda");
   	        itemPrice = 10.00;
   	    }
   	    quantity();
   	    return itemPrice;
   	}
   	public  double quantity() {
   	    System.out.println("Enter how many food items you need");       
   	    double quantity = input.nextDouble();
   	    subTotal(quantity, itemPrice);
   	     
   	    return quantity;
   	 }
   	public  double subTotal(double quantity, double itemPrice) {
   	    double subTotal = quantity*itemPrice;
   	    System.out.println("Subtotal: "+ subTotal);
   	    runningTotal += subTotal;
   	    
   	    return subTotal;
   	}
   	public  void done(){
   	    ordering = false;
   	    System.out.println(runningTotal);
   	    System.out.println("Enjoy your meal");
   	}
   		
   		
   	
	public void getfood() {
		


			
			System.out.println("Track your menulist:");
			System.out.println("********************\n");
			
			System.out.println("********************\n");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nLuxury Airlines Menu:\n");		
			int menuOption = scanner.nextInt();
			executeOperation(menuOption);	
			
			
		}
		
		

		public void executeOperation(int menuOption) {
			System.out.println("Track your food menu:");
			System.out.println("********************\n");

			
	        Map<Integer,String> map = loadOperations();		
			
			for (Map.Entry<Integer, String> entry : map.entrySet()){
			    System.out.println(entry.getKey() + " : " + entry.getValue());
			
			}
			  int foodItem = 0;
			  input = new Scanner(System.in);
			  System.out.println("Enter your choice menu:\n");
			  double runningTotal=0;
			  do{
			     
			        menu();
			        menuOption = input.nextInt();    
			        switch(menuOption){
			       
			        	
			            case 1:
			            	
			                foodItem = 1;
			                itemPrice(foodItem);
			                break;
			            case 2:
			                foodItem = 2;
			                itemPrice(foodItem);
			                break;
			            case 3:
			                foodItem = 3;
			                itemPrice(foodItem);
			                break;
			            case 4:
			                done();
			                break;      
			            default:
			                System.out.println("Invalid option.");
			        }

			    } while(ordering); {
			}
			   
		
		}
		 
		 private void addItem() {
			// TODO Auto-generated method stub
			
		}
		public  Map<Integer,String> loadOperations() {
				Map<Integer,String> map = new LinkedHashMap<Integer,String>();
				map.put(1, "add item");
				map.put(2, "select no of Item");
				map.put(3, "subtotal");
				map.put(4, "total price");
				map.put(5, "printlist");
				return map;
		 }

}
