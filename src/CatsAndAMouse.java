import java.util.*;

//https://www.hackerrank.com/challenges/cats-and-a-mouse/

public class CatsAndAMouse {

    static String catAndMouse(int x, int y, int z) {
    	if(Math.abs(x - z) < Math.abs(y - z))
    		return "Cat A";
    	
    	else if(Math.abs(y - z) < Math.abs(x - z))
    			return "Cat B";

    	else 
    		return "Mouse C";
      }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        int q = Integer.parseInt(scanner.nextLine());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);

            System.out.println(result);
        }

        scanner.close();
    }
}
