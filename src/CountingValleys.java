import java.util.*;

//https://www.hackerrank.com/challenges/counting-valleys


public class CountingValleys {
    
    static int countingValleys(int n, String s) {
    	char[] array = s.toCharArray();
    	int level = 0;
    	int valleys = 0;
    	
    	for(char c : array) {
    		if(c == 'U') level++;
    
    		else if (c == 'D') {
    			level --;
    			
    			if(level == -1) valleys++;

    		}
    	}
    	
    	return valleys;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());

        String s = scanner.nextLine();

        System.out.println(countingValleys(n, s));

    }
}
