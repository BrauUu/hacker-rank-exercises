import java.util.Scanner;

//https://www.hackerrank.com/challenges/staircase

public class Staircase {

    static void staircase(int n) {
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j < i)
                    System.out.print(" ");
                else 
                    System.out.print("#");
               
            }
            System.out.print("\n");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        staircase(n);
    }
}

