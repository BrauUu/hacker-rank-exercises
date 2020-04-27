import java.util.*;

//https://www.hackerrank.com/challenges/java-string-reverse

public class Palindrome {

	public static void main(String[] params) {
		Scanner input = new Scanner(System.in);
		
		String word = input.nextLine();
		
		System.out.println(word.equals(new StringBuilder(word).reverse().toString())?"Yes":"No");
		
		
	}
}
