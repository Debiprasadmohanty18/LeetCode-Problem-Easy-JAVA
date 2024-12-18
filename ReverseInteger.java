/* Reverse Integer :- 

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
 
*/

package com.tanmay.LeetCodeEasyProblems;

public class ReverseInteger {

	public static void main(String[] args) 
	{
		int n = 1534236469;
		System.out.println(reverse(n));
	}
	
	static int reverse(int x) 
	{
		long rev=0;
        while(x!=0)
        {
        	int rem = x%10;
        	rev = (rev*10) + rem;
        	x/=10;       	
        }
        
//        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
//        	return 0;
      
//        return (int) rev;
        
        return (rev > Integer.MAX_VALUE || rev <  Integer.MIN_VALUE) ? 0 : (int)rev;
    }

}
