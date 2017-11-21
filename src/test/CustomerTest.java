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
		Customer customer= new Customer("Sven","Svensson","sven@svensson@gmail.com");
		//Act
		Booking booking = new Booking(customer);
		booking.AddBooking(customer);
		//Assert
		assertTrue(booking.getNumberOfBookings()==1);
		
	}

}
