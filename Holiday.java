package consignmentDeliveryTracking;

import java.util.ArrayList;
import java.util.List;

public interface Holiday{
	public List<String> holiday();
}

class Holidays{
	public static List<String> getHolidays() {
		
		List<String> holiday=new ArrayList<String>();
		holiday.add("JANUARY 26");	//Republic Day
		holiday.add("AUGUST 15");	//Independence Day
		holiday.add("JANUARY 1");	//New Year
		holiday.add("May 1");		//Labor Day
		
	
		return holiday;
	}
}