package models;

import java.util.ArrayList;
import java.util.Collection;

public class Booking {
	Collection<Ticket> ticketList = new ArrayList();
	Collection<Customer> customerList = new ArrayList();
	
	
	public Booking() {
		}
	
	int numberOfBookings=0;
	public Booking(Customer customer) {
		AddBooking(customer);
		numberOfBookings++;
	}
	
	public void AddBooking(Customer customer) {
		customerList.add(customer);
		
	}

	public int getNumberOfBookings() {
		return numberOfBookings;
	}

	public void setNumberOfBookings(int numberOfBookings) {
		this.numberOfBookings = numberOfBookings;
	}
	
	
	
	
}
