package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;
import models.Booking;
import models.Customer;

public class CustomerTest {

	@Test
	public void testAddCustomer() {
		
		
		//Prepare
		Customer customer1= new Customer(1, 2, "sujitha", "yeruva", "07332", "sujitha@");
		Customer customer2= new Customer(1, 2, "staffan", "arveng", "07332", "staffan@");
		Customer customer3= new Customer(1, 2, "daniel", "", "07332", "daniel@");
		//Act
		
		Booking booking = new Booking(customer1);
		booking.AddBooking(customer1);
		booking.AddBooking(customer2);
		booking.AddBooking(customer3);
		//Assert
		assertTrue(booking.getNumberOfBookings()==3);
		
	}
	
	
	
	

}
