import java.util.*;

public class JavaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
            int valor = 1;
            int result = a;
            
            for(int j=0;j<n;j++){
                
                System.out.print((result += (valor * b)) + " ");
                valor *= 2;
            }

            System.out.print("\n");
        }
        
    }
}
