import java.util.*;

public class ArraySum {
	
	static Scanner input = new Scanner(System.in);
	
	static int sum(int[] array) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
	
		int v = Integer.parseInt(input.nextLine().trim());
		
		v = input.nextInt();
		int[] array = new int[v];
		
		String[] arString = input.nextLine().split(" ");
		
		for(int i=0;i<v;i++) {
			int a = Integer.parseInt(arString[i].trim());
			array[i] = a;			
		}
		
		System.out.println(sum(array));

	}

}
