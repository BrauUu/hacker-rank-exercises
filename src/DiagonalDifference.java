import java.util.*;

//https://www.hackerrank.com/challenges/diagonal-difference

public class DiagonalDifference {

	static Scanner input = new Scanner(System.in);
	
	public static int DiagonalDifference(List<List<Integer>> matrix)  {
		int difference;
		int sum1 = 0;
		int sum2 = 0;
		int lastIndex = matrix.size() - 1;
		for(int i = 0; i < matrix.size(); i++) {
			for(int j = 0; j < matrix.size(); j++) {
				if(i == j) {
					sum1 += matrix.get(i).get(j);
				}
				if(j == lastIndex) {
					sum2 += matrix.get(i).get(j);
					lastIndex--;
				}
			}
		}
		if( sum1 > sum2) {
			difference = sum1 - sum2;
		}
		else
			difference = sum2 - sum1;
		return difference;
	}
	
	public static void main(String[] args) {
		
		int size = Integer.parseInt(input.nextLine());
		
		String[] row;
		List<List<Integer>> matrix = new ArrayList<>();
		
		for(int i = 0; i < size; i++) {
			List<Integer> tempList = new ArrayList();
			row = input.nextLine().trim().split(" ");
			for(String item: row) {
				tempList.add(Integer.parseInt(item));
			}
			matrix.add(tempList);
		}
		
		System.out.println(DiagonalDifference(matrix));
	}
	
}
