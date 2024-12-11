/* Concatenation of Array :-

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

Example 1:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

Example 2:
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]

*/

package Array;

import java.util.Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));

	}
	
	static int[] getConcatenation(int[] nums) 
	{
		int n = nums.length * 2;
		int[] arr = new int[n];
		for(int i=0, j=0;i<arr.length;i++)
		{
			
			arr[i] = nums[j];
			j++;
			if(j==nums.length)
				j = 0;
			
		}
        return arr;
    }

}