package Model;

import org.joda.time.LocalTime;
public class Items {

	public String user;
	public LocalTime timestamp;
	public String message;
	
	public Items(String user,LocalTime timestamp, String message) {
		this.user = user;
		this.timestamp = timestamp;
		this.message = message;
		
	}
}
