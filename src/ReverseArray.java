import java.util.*;

//https://www.hackerrank.com/challenges/arrays-ds

public class ReverseArray {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
    	int[] reverse = new int[a.length];
    	int j = 0;
    	for(int i = a.length-1;i >= 0; i--) {
    		reverse[j] = a[i];
    		j++;
    	}
    	return reverse;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        

        int arrCount = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res[] = reverseArray(arr);
        
        for(int i = 0;i<res.length;i++) {
        	System.out.print(res[i]);
        	if(i != res.length - 1) {
        		System.out.print(" ");
        	}
        }
     
        scanner.close();
    }
}
