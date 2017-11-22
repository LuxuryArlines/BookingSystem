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
		Customer customer= new Customer(1, 2, "sujitha", "yeruva", "07332", "sujitha@");
		//Act
		customer.setPreference(2, 'c');
		
		Booking booking = new Booking(customer);
		booking.AddBooking(customer);
		//Assert
		assertTrue(booking.getNumberOfBookings()==1);
		
	}

}
