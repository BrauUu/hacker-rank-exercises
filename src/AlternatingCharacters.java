import java.util.*;

//https://www.hackerrank.com/challenges/alternating-characters

public class AlternatingCharacters {

    static int alternatingCharacters(String s) {
    	int answer = 0;
    	for(int i = 0;i< s.length()-1;i++) {
    		if(s.charAt(i) == s.charAt(i + 1)) {
    			answer++;
    		}
    	}
    	return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int q = Integer.parseInt(scanner.nextLine());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            System.out.println(alternatingCharacters(s));
        }

        scanner.close();
    }
}
