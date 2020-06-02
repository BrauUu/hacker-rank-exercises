import java.util.*;

//https://www.hackerrank.com/challenges/kangaroo

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	
    	if((x1 > x2 && v1 >= v2) || (x2 > x1 && v2 >= v1))
    	{
    		return "NO";
    	}
    	else if(((x1 - x2 ) > 0 && (x1 - x2) % (v1 - v2) == 0 ) || ((x2 - x1 ) > 0 && (x2 - x1) % (v2 - v1) == 0 )) {
    		return "YES";
    	}
    	return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        System.out.println(kangaroo(x1, v1, x2, v2));

       

        scanner.close();
    }
}
