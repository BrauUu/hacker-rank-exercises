import java.util.*;
import java.time.LocalDate;

//https://www.hackerrank.com/challenges/java-date-and-time

class Result {

    public static String findDay(int month, int day, int year) {

        LocalDate dt = LocalDate.of(year, month, day);
        return dt.getDayOfWeek().toString();
    }

}

public class Date {
	
	private static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        

        String[] firstMultipleInput = input.nextLine().split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);

       

        
    }
}
