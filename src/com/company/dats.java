import java.util.Calendar;

import java.util.Date;

class dats{
// 	public static int getDayNumberOld(Date date) {
//     Calendar cal = Calendar.getInstance();
//     cal.setTime(date);
//     return cal.get(Calendar.DAY_OF_WEEK);
// }
public static String findDay(int month, int day, int year) {  
	Calendar cal = Calendar.getInstance();
    cal.set(year,month-1,day);
    int a = cal.get(Calendar.DAY_OF_WEEK);

    String months[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    return months[a-1];
}
	public static void main(String[] args) {
		System.out.println(dats.findDay(12,25,2059));
		//System.out.println(dats.getDayNumberOld(new Date(9,8,2020)));
	}
}