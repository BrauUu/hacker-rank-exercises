import java.util.Scanner;

//https://www.hackerrank.com/challenges/counting-valleys


public class CountingValleysExt {
    
    static void drawValleys (int n, String s) {
    	char[] array = s.toCharArray();
    	int D = 0, U = 0;
    	int level = 0;
    	
    	for(char c: array) {
    		if(c == 'U') {
    			level ++;
    			if(level > 0 && level > U) U++;
    		}
    		if(c == 'D') {
    			level --;
    			if(level < 0 && level < D) D--;
    		}
    	}
    	System.out.println(U + " " + D);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());

        String s = scanner.nextLine();

        drawValleys(n, s);

    }
}
