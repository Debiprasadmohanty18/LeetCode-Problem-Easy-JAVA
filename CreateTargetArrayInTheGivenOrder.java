/* Create Target Array in the Given Order :-
Given two arrays of integers nums and index. Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.

Example 1:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

Example 2:
Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
Explanation:
nums       index     target
1            0        [1]
2            1        [1,2]
3            2        [1,2,3]
4            3        [1,2,3,4]
0            0        [0,1,2,3,4]

Example 3:
Input: nums = [1], index = [0]
Output: [1]
 
*/

package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums, index)));
	}
	
	static int[] createTargetArray(int[] nums, int[] index) 
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<index.length;i++)
		{
			list.add(index[i],nums[i]);
		}
		
		int[] resArr = new int[nums.length];
        for(int i=0;i<list.size();i++)
        {
        	resArr[i] = list.get(i); 
        }
        
        return resArr;
    }

}
