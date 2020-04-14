import java.util.*;


public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] time = s.split(":");
        String[] timeF;
        int hour;
        if(time[2].toLowerCase().contains("am")) {
        	timeF = time[2].split("A");
        	hour = Integer.parseInt(time[0]);
        	if(hour == 12) {
        		hour = 0;
        		time[0] = Integer.toString(hour) + "0";
        	}
        	else 
        		if(hour < 10)
        			time[0] = "0" + Integer.toString(hour);
        	else
        		time[0] = Integer.toString(hour);
        	return time[0] + ":" + time[1] + ":" + timeF[0];
        }
        else
        	if(time[2].toLowerCase().contains("pm")) {
	        	timeF = time[2].split("P");
	        	hour = Integer.parseInt(time[0]);
	        	if(hour < 12)
	        		hour += 12;
	        	time[0] = Integer.toString(hour);
	        	return time[0] + ":" + time[1] + ":" + timeF[0];
        }
        	else
        		return "ERRO";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scan.nextLine();

        System.out.println(timeConversion(s));
    }
}
