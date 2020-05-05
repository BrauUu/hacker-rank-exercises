import java.util.*;

//https://www.hackerrank.com/challenges/the-hurdle-race

public class HurdleRace {

    static int hurdleRace(int k, int[] height) {
    	
    	int bigger = 0;
    	
    	for(int i=0;i<height.length;i++) {
    		if(height[i] > bigger) bigger = height[i];
    	}
    	
    	return (k>bigger?0:bigger -k);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        System.out.println(hurdleRace(k,height));

        scanner.close();
    }
}
