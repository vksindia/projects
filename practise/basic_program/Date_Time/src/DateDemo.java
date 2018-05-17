import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateDemo {

	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  //simpleDateFormat class use for formatting
		Date date=new Date(); 
	    System.out.println(formatter.format(date));  
	
		System.out.println(date);
		
		long millis=System.currentTimeMillis();  
		Date  date1=new  Date(millis); 
		System.out.println(date1);
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		
		
		//Calendar Class
		 Calendar calendar = Calendar.getInstance();  
		   System.out.println("The current date is : " + calendar.getTime());  
		   calendar.add(Calendar.DATE, -15);  
		   System.out.println("15 days ago: " + calendar.getTime());  
		   calendar.add(Calendar.MONTH, 4);  
		   System.out.println("4 months later: " + calendar.getTime());  
		   calendar.add(Calendar.YEAR, 2);  
		   System.out.println("2 years later: " + calendar.getTime());  
		
		   System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));  
		   System.out.println("At present Calendar's Day: " + calendar.get(Calendar.DATE));  
		   System.out.println(" Day in month:"+calendar.get(Calendar.DAY_OF_MONTH));
		   System.out.println(" week in month:"+calendar.get(Calendar.WEEK_OF_MONTH));
		   System.out.println(" week in year:"+calendar.get(Calendar.WEEK_OF_YEAR));
		   
		   
		   
		   
	
	}

}
