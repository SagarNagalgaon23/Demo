package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class FindTargetTwoSum {

	public static int[] findTwoSum(int nums[],int target) {
		HashMap<Integer,Integer> nummap=new HashMap<Integer,Integer>();
		for(int i=0;i<=nums.length;i++) {
			int extra=target-nums[i];
			if(nummap.containsKey(extra)) {
				return new int[] {nummap.get(extra),i};
			}
			nummap.put(nums[i], i);
			System.out.println(nummap);
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {10,2,14,9,13};
		int target=23;
		int result[]=findTwoSum(arr,target);
		System.out.println(Arrays.toString(result));
	}

}
