import java.util.*;

public class RepeatedString {

    static long repeatedString(String s, long n) {
    	int count = 0;
    	int count2 = 0;
    	long rest;
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i) == 'a') count++;
    	}
    	rest = (long) n % s.length();
    	
    	for(int i=0;i<rest ;i++) {
    		if(s.charAt(i) == 'a') count2++;
    	}
    	return ((n / s.length() * count) + count2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        

        String s = scanner.nextLine();

        long n = Long.parseLong(scanner.nextLine());

        long result = repeatedString(s, n);

        System.out.println(result);
    }
}
