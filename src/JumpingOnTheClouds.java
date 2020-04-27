import java.util.*;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
    	int jumps = 0;
    	for(int i=0;i<c.length;i++) {
    		if(i < c.length - 2 ) {
    			if(c[i + 2] == 0)i++;
    			jumps++;
    		}
    		else if(i < c.length - 1) jumps++;
    	}
    	return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());
        

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println(jumpingOnClouds(c));

       
    }
}
