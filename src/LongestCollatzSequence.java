import java.util.*;
public class LongestCollatzSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		System.out.print("Enter highest bound: ");  
		int bounds = sc.nextInt();
		ArrayList<Integer> sequence = getLargestSequence(bounds);
		for (int i = 0 ; i < sequence.size();i++){
		    System.out.println(sequence.get(i));
		}
		System.out.println(Integer.toString(sequence.get(0)) + " reached 1 after " + Integer.toString(sequence.size()) + " steps");
		sc.close();
	}
	
	public static ArrayList<Integer> getLargestSequence(int max) {
		ArrayList<Integer> longestString = new ArrayList<Integer>();
		ArrayList<Integer> currentString = new ArrayList<Integer>();
		for (int i = 1; i < max + 1; i++) {
			int num = i;
			
			currentString.clear();
			while (true) {
				currentString.add(num);
				if (num == 1) {
					break;
				}
				if (num % 2 == 0) {
					num = num / 2;
				}
				else {
					num = 3 * num + 1;
				}
			}
			
			if (currentString.size() > longestString.size()) {
				longestString.clear();
				for (int j = 0 ; j < currentString.size();j++){
				    longestString.add(currentString.get(j));
				}
			}
		}
		
		return longestString;
	}
}
