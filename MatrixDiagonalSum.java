/* Matrix Diagonal Sum :- 
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:
Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:
Input: mat = [[5]]
Output: 5
 
*/

package Array;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
			
		int[][] mat = {
				{1,2,3},
				{4,5,6},
				{7,8,9}	
				
//				{1,1,1,1},
//				{1,1,1,1},
//				{1,1,1,1},
//				{1,1,1,1}
				
//				{5}
		};
		
		System.out.println(diagonalSum(mat));

	}
	
	static int diagonalSum(int[][] mat) 
	{
		int j = mat.length-1;
		int sum = 0;
        for(int i=0;i<mat.length;i++)
        {
        	sum+=mat[i][i];
        	if((i+j == mat.length-1) && (i!=j))
        		sum += mat[i][j];
        	j--;
        }        
        
        return sum;
    }
	
//	Approach - 2
	
/*	
  	static int diagonalSum(int[][] mat) 
	{
		int sum = 0;
        for(int i=0;i<mat.length;i++)
        {
        	for(int j=0;j<mat.length;j++)
        	{
        		if(i == j || (i+j == mat.length-1))
        			sum += mat[i][j];
        	}
        }                
        
        return sum;
    }
*/
}
