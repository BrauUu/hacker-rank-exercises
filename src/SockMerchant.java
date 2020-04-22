import java.util.*;


//https://www.hackerrank.com/challenges/sock-merchant

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
    	int pairs = 0;
    	for(int i=0;i<n;i++) {
    		for(int j=i + 1;j<n;j++) {
    			if(ar[i] == ar[j] && ar[j] != 0) {
    				pairs++;
    				ar[j] = 0;
    				break;
    			}
    		}
    	}
    	return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {       

        int n = Integer.parseInt(scanner.nextLine());

        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

       System.out.println(result);

    }
}
