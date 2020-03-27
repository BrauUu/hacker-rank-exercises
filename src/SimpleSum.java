import java.util.Scanner;

public class SimpleSum {
	
	static int simpleSum(int a, int b) {
		return a + b;
	}

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a, b;
		
		a = input.nextInt();

		b = input.nextInt();
		
		System.out.println(simpleSum(a,b));

	}

}
