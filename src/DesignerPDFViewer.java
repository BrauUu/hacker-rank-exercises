import java.util.*;

//https://www.hackerrank.com/challenges/designer-pdf-viewer

public class DesignerPDFViewer {

    static int designerPdfViewer(int[] h, String word) {
    	byte[] ascii = word.getBytes();
    	int bigger = 0;
    	for(int i=0;i < ascii.length - 1;i++) {
    		if(h[ascii[i] - 97] > h[ascii[i + 1] - 97] && h[ascii[i] - 97] > bigger) bigger = h[ascii[i] - 97];
    		else  if(h[ascii[i+1] - 97] > h[ascii[1] - 97] && h[ascii[i] - 97] > bigger ) bigger = h[ascii[i+1] - 97];
    	}
    	return bigger * word.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        System.out.println(designerPdfViewer(h,word));

        scanner.close();
    }
}
