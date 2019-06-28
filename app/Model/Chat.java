package Model;

import org.joda.time.DateTime;
import java.util.List;

public class Chat {

	public DateTime date;
	public int occurrence;
	public List<Item>items;
	public Chat (DateTime date,int occurence, List<Item>items){
		this.date          = date;
		this.occurrence    = occurrence;
		this.items         = items;
		
	}
}
