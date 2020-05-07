import java.util.*;

//https://www.hackerrank.com/challenges/utopian-tree

public class UtopianTree {

    static int utopianTree(int n) {
    	int size = 1;
    	for(int i=0;i<n;i++) {
    		if(i % 2 == 0) size *= 2;
    		else if(i % 2 == 1) size++;
    	}
    	return size;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();

            System.out.println(utopianTree(n));
        }

        scanner.close();
    }
}
