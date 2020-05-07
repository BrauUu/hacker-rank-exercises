import java.util.Scanner;

//https://www.hackerrank.com/challenges/valid-username-checker

public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);
    public static final String regularExpression = "[A-Za-z]{1}[A-Za-z0-9_]{7,29}";
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}