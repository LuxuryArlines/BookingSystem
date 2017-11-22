package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;

public class SwingGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnPickarrivaldate;
	private JList list_1;
	private JButton btnGenerate;
	public String test;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingGui window = new SwingGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 906, 713);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSource = new JLabel("Source");
		lblSource.setBounds(29, 16, 46, 14);
		frame.getContentPane().add(lblSource);
		
		JLabel labelDestination = new JLabel("Destination");
		labelDestination.setBounds(29, 41, 66, 14);
		frame.getContentPane().add(labelDestination);
		
		textField = new JTextField();
		textField.setBounds(112, 13, 123, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 38, 123, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDateFrom = new JLabel("Departure");
		lblDateFrom.setBounds(29, 86, 66, 14);
		frame.getContentPane().add(lblDateFrom);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 80, 123, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel labelArrival = new JLabel("Arrival");
		labelArrival.setBounds(29, 111, 66, 14);
		frame.getContentPane().add(labelArrival);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(112, 108, 123, 20);
		frame.getContentPane().add(textField_3);
		
		JButton btnDeparture = new JButton("Pick DepartureDate");
		    
		btnDeparture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnDeparture.setBounds(247, 79, 130, 23);
		frame.getContentPane().add(btnDeparture);
		
		btnPickarrivaldate = new JButton("Pick ArrivalDate");
		btnPickarrivaldate.setBounds(247, 107, 130, 23);
		frame.getContentPane().add(btnPickarrivaldate);
		
		JList list = new JList();
		list.setBounds(262, 149, -232, 54);
		frame.getContentPane().add(list);
		
		list_1 = new JList();
		list_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list_1.setBounds(29, 215, 348, 93);
		
		
		frame.getContentPane().add(list_1);
		
		btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			UpdateJlist();	
			}
		});
		btnGenerate.setBounds(387, 212, 93, 23);
		frame.getContentPane().add(btnGenerate);
		
		lblNumberOfPassengers = new JLabel("Number of passengers");
		lblNumberOfPassengers.setBounds(29, 136, 117, 14);
		frame.getContentPane().add(lblNumberOfPassengers);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 133, 93, 20);
		frame.getContentPane().add(textField_4);
		
		JButton button = new JButton("Generate");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				AddRowsToTable();
			}
		});
		button.setBounds(555, 430, 93, 23);
		frame.getContentPane().add(button);
		
		btnAddRow = new JButton("Add row");
		btnAddRow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				AddRowToTable();
			}
		});
		btnAddRow.setBounds(555, 464, 93, 23);
		frame.getContentPane().add(btnAddRow);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(535, 41, 335, 222);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(479, 283, 296, 96);
		frame.getContentPane().add(table);
		
		// Adding table control to Jscrollpane so that columns will show
//		scrollPane.add(new JScrollPane(table);
		frame.getContentPane().add(new JScrollPane(table));
		lblPassengers = new JLabel("Passengers");
		lblPassengers.setBounds(29, 351, 94, 14);
		frame.getContentPane().add(lblPassengers);
		
		table_1 = new JTable();
		table_1.setBounds(479, 351, 1, 1);
		frame.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"test"
			}
		));
		table_2.setBounds(770, 639, 38, -167);
		frame.getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_3.setBounds(535, 274, 208, 152);
		frame.getContentPane().add(table_3);
		
		JTextPane textFirstName = new JTextPane();
		textFirstName.setBounds(112, 376, 102, 20);
		frame.getContentPane().add(textFirstName);
		
		lblFirstname = new JLabel("FirstName");
		lblFirstname.setBounds(29, 382, 66, 14);
		frame.getContentPane().add(lblFirstname);
		
		lblLastname = new JLabel("LastName");
		lblLastname.setBounds(29, 407, 66, 14);
		frame.getContentPane().add(lblLastname);
		
		lblEmailadress = new JLabel("EmailAdress");
		lblEmailadress.setBounds(29, 434, 66, 14);
		frame.getContentPane().add(lblEmailadress);
		
		textLastName = new JTextPane();
		textLastName.setBounds(112, 407, 102, 20);
		frame.getContentPane().add(textLastName);
		
		textEmailAdress = new JTextPane();
		textEmailAdress.setBounds(112, 433, 102, 20);
		frame.getContentPane().add(textEmailAdress);
		
		buttonAddCustomer = new JButton("Add");
		buttonAddCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonAddCustomer.setBounds(247, 430, 93, 23);
		frame.getContentPane().add(buttonAddCustomer);
	}
	DefaultListModel<String> model;
	private JLabel lblNumberOfPassengers;
	private JTextField textField_4;
	private JButton btnAddRow;
	private JTable table;
	private JLabel lblPassengers;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JLabel lblFirstname;
	private JLabel lblLastname;
	private JLabel lblEmailadress;
	private JTextPane textLastName;
	private JTextPane textEmailAdress;
	private JButton buttonAddCustomer;
	private void UpdateJlist() {
		DefaultListModel<String> model = new DefaultListModel<String>();
	    String s="";
		for (int i = 0; i < 3; i++) {
			s="Route " + i+"";
			model.addElement(s);
		}{
	        
	    }
	    list_1.setModel(model);
	    list_1.setSelectedIndex(0);
	}
//	public void AddRowsToTable() {
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		model.addRow(new Object[]{"Passenger1", "SureName1", "adress1"});
//		model.addRow(new Object[]{"Passenger2", "SureName2", "adress2"});
//		model.addRow(new Object[]{"Passenger3", "SureName3", "adress3"});
//		
//		
//	}
//	public void AddRowToTable() {
//		DefaultTableModel model = (DefaultTableModel) table.getModel();
//		model.addRow(new Object[]{"Passenger1", "SureName1", "adress1"});
//		
//	}
}
