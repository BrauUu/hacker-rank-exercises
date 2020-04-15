import java.util.*;

//https://www.hackerrank.com/challenges/mini-max-sum

public class MiniMaxSum {
	
    static void miniMaxSum(int[] arr) {
    	
    	for (int i=0;i<arr.length;i++) {
    		for (int j=1;j<arr.length;j++) {
    			if (arr[j-1] > arr[j]) {
    				int temp = arr[j-1];
    				arr[j-1] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	
    	long soma = 0L;
    	
    	for(int i=0;i<arr.length - 1;i++) {
    		soma += arr[i];
    	}
    	
    	System.out.print(soma + " ");
    	soma = 0;
    	for(int i=arr.length - 1;i>0;i--) {
    		soma += arr[i];
    	}
    	System.out.print(soma);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

    }
}
