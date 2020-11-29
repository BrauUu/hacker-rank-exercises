import java.util.*;

//https://www.hackerrank.com/challenges/compare-the-triplets

public class CompareTheTriplets {
	
	static Scanner input = new Scanner(System.in);
	
	static List<Integer> CompareTheTriplets(List<Integer> a, List<Integer> b){
		List<Integer> result = new ArrayList();
		int va = 0, vb = 0;
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) > b.get(i))
				va++;
			else if(b.get(i) > a.get(i))
				vb++;
		}
		result.add(va);
		result.add(vb);
		return result;
	}
	
	public static void main(String[] args) {
		
		String[] aS = input.nextLine().trim().split(" ");
		String[] bS = input.nextLine().trim().split(" ");
		
		List<Integer> a = new ArrayList();
		List<Integer> b = new ArrayList(); 
		
		for(String temp: aS) {
			a.add(Integer.parseInt(temp));
		}
		
		for(String temp: bS) {
			b.add(Integer.parseInt(temp));
		}
		
		List<Integer> result = CompareTheTriplets(a, b);
		System.out.println(result.get(0) + " " + result.get(1));
		
	}

}
