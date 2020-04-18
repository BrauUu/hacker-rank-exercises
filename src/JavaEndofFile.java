import java.util.*;

//https://www.hackerrank.com/challenges/java-end-of-file

public class JavaEndofFile {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] params) {	
		
		int i = 1;
		
		while (input.hasNext()){
			System.out.println(i + " " + input.nextLine());
			i++;
		} 
		
		
	}

}
