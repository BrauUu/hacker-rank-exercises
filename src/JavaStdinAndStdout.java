import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout

public class JavaStdinAndStdout {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = Integer.parseInt(input.nextLine());
        double d = Double.parseDouble(input.nextLine());
        String s = input.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
