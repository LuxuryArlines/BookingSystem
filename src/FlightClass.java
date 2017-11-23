import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
/**
 * Information for the flight should be handled by this class
 * @author User
 *
 */
public class FlightClass {
	private int fNumber;
	private String source;
	private String destination;
	private Date date;
	private LocalTime time;
	
	public FlightClass() {
	}
	
	public void retrieveFligthInfo() {
		InputHelper inputHelper = new InputHelper();
	
		
		this.fNumber++;
		this.source=inputHelper.testUserInputString("Enter source airport");
		this.destination=inputHelper.testUserInputString("Enter destination airport");
		
//		String string = "January 2, 2010";
//		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
//		try {
//			this.date = format.parse(inputHelper.testUserInputString("Enter date"));
//		} catch (ParseException e) {
//			System.out.println("Incorrect date format, try again");
//			e.printStackTrace();
//		}
		
		
				
	}
	

}
