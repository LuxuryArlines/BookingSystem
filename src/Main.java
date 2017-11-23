

import java.awt.EventQueue;

import gui.SwingGui;
import models.Customer;

public class Main {
	public static void main(String[] args) {
		
		boolean guiEnabled= false;
		
		Customer customer= new Customer(1, 2, "sujitha", "yeruva", "07332", "sujitha");
		if (guiEnabled==false) {
		
			customer.setPreference(2, 'c');
//			Aeroplane a = new EcnomicClass();
//			a.executeOperation(0);
			
			
			
		}
//		public static int GetIntFromUser(Integer)
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingGui window = new SwingGui();
					window.main(null);
					
					
//					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
