import java.text.DateFormat;
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
		this.source=inputHelper.testUserInputString("Enter source airport");
		this.destination=inputHelper.testUserInputString("Enter destination airport");
		
		String string = "January 2, 2010";
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		//this.date = format.parse(inputHelper.testUserInputString("Enter date"));
		
				//Date date = format.parse(string);
				
	}
	

}
