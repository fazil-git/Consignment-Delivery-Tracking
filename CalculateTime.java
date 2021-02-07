package consignmentDeliveryTracking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class CalculateTime{
	LocalDateTime currentDateTime=LocalDateTime.now();
	LocalDate todaysDate=currentDateTime.toLocalDate();
	LocalTime todaysTime=currentDateTime.toLocalTime();
	Resource res=ResourceFactory.getResource();
	int daysRequired, daysToReach;
	LocalDate expectedDate;

	public void getCurrentTime() {
		System.out.println("Date:"+todaysDate+"\t Time: "+todaysTime.getHour()+":"+todaysTime.getMinute()+":"+todaysTime.getSecond());
	}
	
	public void getElapsedDate(int duration){
		daysRequired=duration/res.travelHrs;
		
		daysToReach=getCalendarDaysToReach();
		expectedDate=todaysDate.plusDays(daysToReach);
		
		System.out.println("Consignment delivery elapsed date : "+expectedDate+" ("+expectedDate.getDayOfWeek()+")");
		System.out.println();
		System.out.println("xxx----------------------------------------------------xxx");
		System.out.println("\n\n\n\n\n\n\n\n");
	}
	
	private int getCalendarDaysToReach() {
		
		Holiday hoi= Holidays::getHolidays;
		List<String> holiday=hoi.holiday();
//		System.out.println("Contain working? "+holiday.contains("JANUARY 26"));
		
		for(int j=0; j<=daysRequired; j++) {
			String msg=todaysDate.plusDays(j).getMonth()+" "+todaysDate.plusDays(j).getDayOfYear();
			if(	(todaysDate.plusDays(j).getDayOfWeek().toString().equals("SUNDAY")) || (holiday.contains(msg))	){
				daysRequired++;
			}
		}
		return daysRequired;
	}
}

interface ShowCurrentTime{
	public void showCurrentTime();
}

interface ElapsedDate{
	public void elapsedDate(int duration);
}