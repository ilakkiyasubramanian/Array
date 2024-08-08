Given an array of N positive integers where all numbers occur even number of times except one number which occurs odd number of times. Find the exceptional number.

Example 1:

Input:
N = 7
Arr[] = {1, 2, 3, 2, 3, 1, 3}
Output: 3
Explaination: 3 occurs three times.


class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int result=0;
        for(int i=0;i<n;i++)
        {
            result^=arr[i];
        }
        return result; 
        
    }
}



Initial value: result = 0
Step-by-step XOR operations:
result = 0 ^ 1 = 1
result = 1 ^ 2 = 3 (Explanation: 01 ^ 10 = 11, which is 3 in decimal)
result = 3 ^ 3 = 0 (Explanation: 11 ^ 11 = 00, which is 0 in decimal)
result = 0 ^ 2 = 2
result = 2 ^ 3 = 1 (Explanation: 10 ^ 11 = 01, which is 1 in decimal)
result = 1 ^ 1 = 0
result = 0 ^ 3 = 3
