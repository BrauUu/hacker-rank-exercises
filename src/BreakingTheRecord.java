import java.util.*;

//https://www.hackerrank.com/challenges/breaking-best-and-worst-records

public class BreakingTheRecord {

    static int[] breakingRecords(int[] scores) {
    	int max = scores[0];
    	int min = scores[0];
    	int[] result = {0,0};
    	
    	
    	for(int i=0;i<scores.length;i++) {
    		if(scores[i] > max) { 
    			result[0]++;
    			max = scores[i];
    		}
    		else if(scores[i] < min) {
    			result[1]++;
    			min = scores[i];
    		}
    	}
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int n = Integer.parseInt(scanner.nextLine());

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
        
        	System.out.print(result[i]);

            if (i != result.length - 1) {
            	System.out.print(" ");
            }
        }
        scanner.close();
    }
}
