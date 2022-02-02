import java.util.ArrayList;
import java.util.Scanner;
public class ReverseList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		System.out.print("Enter an integer in the list: ");
		int num = scanner.nextInt();
		
		while(num != -1) {
			
			nums.add(num);
			System.out.print("Enter an integer in the list or enter -1 to get the reversed list: ");
			num = scanner.nextInt();
			
		}
		
	
		
		for(int i =0; i<nums.size(); i++) {
			nums1.add(nums.get((nums.size()-1)-i));
		}
		
		System.out.print(nums1);

	}

}
