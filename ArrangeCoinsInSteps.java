
/********************************************************************
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
******************************************************************************/


Explanation: In the starting there are n remaining coins and stepcount is 0.
             start the loop with i=1 that is the first step. in the else condition don't forget 
			 to break otherwise loop will unnecesarily execute n times and would not break out.
			 
			 

class Solution {
    public int arrangeCoins(int n) {
        int remainingCoins = n;
        int currentCount = 0;
            for( int i=1 ; i <= n ; i++) {
               if(remainingCoins >= i ){
                    remainingCoins = remainingCoins-i;
                     currentCount++;
                }else {
                   break;
               }
        }
      return currentCount;  
    }
}