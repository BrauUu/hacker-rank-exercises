import java.util.*;

public class ArraySum {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
	
		int v;
		int sum = 0;
		
		v = input.nextInt();
		int[] array = new int[v];
		
		for(int i=0;i<v;i++) {
			array[i] = input.nextInt();
			sum += array[i];
		}
		
		System.out.println(sum);

	}

}
