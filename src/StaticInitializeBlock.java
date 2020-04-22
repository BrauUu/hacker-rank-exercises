import java.util.*;

//https://www.hackerrank.com/challenges/java-static-initializer-block

public class StaticInitializeBlock {
	
private static final Scanner input = new Scanner(System.in);

public static int B = Integer.parseInt(input.nextLine());
    
public static int H = Integer.parseInt(input.nextLine());

public static boolean flag;

static {
	if(B <= 0 || H <= 0) {
		
		System.out.println("java.lang.Exception: Breadth and height must be positive");
		flag = false;
	}
	else
		flag = true;
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}

