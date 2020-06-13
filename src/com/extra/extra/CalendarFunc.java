package com.extra.extra;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarFunc {
	
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    int day = cal.get(Calendar.DATE);
    int month = cal.get(Calendar.MONTH) + 1;
    int year = cal.get(Calendar.YEAR);
    int dow = cal.get(Calendar.DAY_OF_WEEK);
    int dom = cal.get(Calendar.DAY_OF_MONTH);
    int doy = cal.get(Calendar.DAY_OF_YEAR);

    System.out.println("Current Date: " + cal.getTime());
    System.out.println("Day: " + day);
    System.out.println("Month: " + month);
    System.out.println("Year: " + year);
    System.out.println("Day of Week: " + dow);
    System.out.println("Day of Month: " + dom);
    System.out.println("Day of Year: " + doy);
    
    //does not work for Java 8 - works for Java 7
//    Date date = // the date instance
//    Calendar calendar = Calendar.getInstance();
//    calendar.setTime(date);
    
    //SimpleDateFormat datefor = new SimpleDateFormat("08/05/2015");
    //Date date = datefor.parse();
    Calendar calendar = Calendar.getInstance();
    //calendar.setTime(date);
    calendar.set(Calendar.MONTH, 07);
    calendar.set(Calendar.YEAR, 2015);
    calendar.set(Calendar.DAY_OF_MONTH, 05);
    System.out.println("After setting time: "+calendar.getTime());
    System.out.println("After setting time: "+calendar.get(calendar.DAY_OF_WEEK));
    int res = calendar.get(calendar.DAY_OF_WEEK);
//    switch(res) {
//    	case 1:
//    		return "SUNDAY";
//    	case 2: 
//    		return "MONDAY";
//    	case 3: 
//    		return "TUESDAY";
//    	case 4: 
//    		return "WEDNESDAY";
//    	case 5:
//    		return "THURSDAY";
//    	case 6:
//    		return "FRIDAY";
//    	default:
//    		return "SATURDAY";
//    }
    
    NumberFormat Us = NumberFormat.getCurrencyInstance(Locale.US);
    
    
    String input_date="01/08/2012";
    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
    Date dt1;
	try {
		dt1 = format1.parse(input_date);
		DateFormat format2=new SimpleDateFormat("EEEE"); 
	    String finalDay=format2.format(dt1);
	    System.out.println("HElloooddd: "+finalDay);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
  }
}
