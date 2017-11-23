package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {

	private String customerId;
	private String FName;
	private String LName;
	private String EmailId;
	private int row;
	private int seat;
	private final double seat_price = 20000;
	private final double seat_budget_price=5000;
	
//	private List seatArray = new ListArray[int];
	private ArrayList<String> seatList = new ArrayList<String>();
	
	public Customer(int requestedrow, int requestedseat, String customerIdnumber, String firstName, String lastName,
			String emailIdname) {

		row = requestedrow;
		seat = requestedseat;
		customerId = customerIdnumber;
		FName = firstName;
		LName = lastName;
		EmailId = emailIdname;
		String classSelection = "";

		Scanner sc = new Scanner(System.in);

//		System.out.println(" or no click o'stop' to quite: ");
//		customerId = sc.next();
		System.out.println("Please enter the customer firstName");
		FName = sc.next();
		System.out.println("Please enter the customer lastName");
		LName = sc.next();
		System.out.println("Please enter the customer emailId");
		EmailId = sc.next();

		System.out.println(" Do you want to travel first class(f) or business class(b)?");
		classSelection = sc.next();
		
//		System.out.println(20000 + "for first class");

		System.out.println("what seat would you like to sit on? ");
		seat = sc.nextInt();
		seatPreference();

	}

	
	
	public double getSeat_price() {
		return seat_price;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getFName() {
		return FName;
	}

	public String getLName() {
		return LName;
	}

	public String getEmailId() {
		return EmailId;
	}

	public int getRow() {
		return row;
	}

	public int getSeat() {
		return seat;
	}

	public int seatPreference() {
		int newSeat = 0;
		if (seat == 1) {
			newSeat = 1;
			System.out.println("allocated first class seat 1" + " sek" + seat_price);
		} else if (seat == 2) {
			newSeat = 2;
			System.out.println("allocated  first class seat 2" + " sek " + seat_price);
		} else if (seat == 3) {
			newSeat = 3;
			System.out.println("allocated first class seat 3" + " sek" + seat_price);
		} else if (seat == 4) {
			newSeat = 4;
			System.out.println("allocated first class seat 4" + " sek" + seat_price);
		} else if (seat == 5) {
			newSeat = 5;
			System.out.println("allocated first class seat  5" + " sek" + seat_price);
		} else {
			System.out.println("full");
		}
		return newSeat;
	}

	public void setPreference(int newRow, int newSeat) {

	}
}
