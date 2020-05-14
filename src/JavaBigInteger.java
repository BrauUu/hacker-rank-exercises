import java.util.Scanner;
import java.math.BigInteger;

//https://www.hackerrank.com/challenges/java-biginteger

public class JavaBigInteger {
	
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		BigInteger bigNumber1 = new BigInteger(scan.nextLine());
		BigInteger bigNumber2 = new BigInteger(scan.nextLine());
		
		System.out.println(bigNumber1.add(bigNumber2));
		System.out.println(bigNumber1.multiply(bigNumber2));
	}
}
