import java.util.*;

//https://www.hackerrank.com/challenges/birthday-cake-candles

public class BirthdayCandles {
    static int birthdayCakeCandles(int[] ar) {
    	int answer = 1;
    	int max = 0;
    	for(int i = 0 ; i < ar.length ; i++) {
    		if(ar[i] > max) {
    			max = ar[i];
    			answer = 1;
    		}
    		else if(ar[i] == max) {
    			answer++;
    		}
    	}
    	return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int arCount = Integer.parseInt(scanner.nextLine());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        };

        System.out.println(birthdayCakeCandles(ar));

        scanner.close();
    }
}
