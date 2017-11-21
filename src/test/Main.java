package test;

import java.awt.EventQueue;

import gui.SwingGui;
import models.Customer;

public class Main {
	public static void main(String[] args) {
		
		boolean guiEnabled= true;
		
		Customer customer= new Customer("Sven","Svensson","sven@svesson@gmail.com");
		
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
