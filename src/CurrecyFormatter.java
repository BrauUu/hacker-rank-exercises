import java.util.*;
import java.text.*;

//https://www.hackerrank.com/challenges/java-currency-formatter

public class CurrecyFormatter {
	
	final static Locale INDIA = new Locale("en", "IN");
	
	final static NumberFormat USFORMAT = NumberFormat.getCurrencyInstance(Locale.US);
	final static NumberFormat CHINAFORMAT = NumberFormat.getCurrencyInstance(Locale.CHINA);
	final static NumberFormat FRANCEFORMAT = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	final static NumberFormat INDIAFORMAT = NumberFormat.getCurrencyInstance(INDIA);
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();        
	        scanner.close();

	        String us = USFORMAT.format(payment);
	        String india = INDIAFORMAT.format(payment);
	        String china = CHINAFORMAT.format(payment);
	        String france = FRANCEFORMAT.format(payment);
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
}


