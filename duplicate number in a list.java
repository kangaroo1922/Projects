import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		System.out.print("Enter an integer in the list: ");
		Integer number = scanner.nextInt();
		nums.add(number);
		while(number != -1) {
			System.out.print("Enter an integer in the list or enter -1 to get the duplicate number(if any): ");
			number = scanner.nextInt();
			nums.add(number);
		}
		nums.remove(nums.size() -1);
		
		for(int i =0; i<=nums.size(); i++) {
			for(int j =0; j< nums.size(); j++) {
				if(j+1 >= nums.size()) {
					continue;
				}
				if(nums.get(j) > nums.get(j+1)) {
					
					nums1.add(nums.get(j+1));
					nums.set(j+1, nums.get(j));
					nums.set(j , nums1.get(nums1.size()-1));
					
				}
				else {
					continue;
				}
			}
	
		}
		System.out.println(nums);
		for(int i =0; i<nums.size(); i++) {
			if(i+1 == nums.size()) {
				break;
			}
			if(nums.get(i) == nums.get(i+1)) {
				System.out.println(nums.get(i)+ " is the duplicate number.");
			}
		}
		
	}
}

