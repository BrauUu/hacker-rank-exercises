import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-anagrams

public class Anagrams {

    static boolean isAnagram(String a, String b) {
    	if(a.length() != b.length()) return false;
        int[] arA = new int[26]; int[] arB = new int[26];
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        for(int i=0;i<a.length();i++) {
        	arA[a.charAt(i) - 97]++;
        	arB[b.charAt(i) - 97]++;
        }
        
        for(int i=0;i<26;i++) {
        	if(arA[i] != arB[i]) return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
