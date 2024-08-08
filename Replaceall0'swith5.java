You are given an integer n. You need to convert all zeroes of n to 5.

Examples:

Input: n = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with 5, the new number will be 1554.


class Solution {
    int convertfive(int num) {
        // Your code here
        String i=Integer.toString(num);
        i=i.replace('0','5');
        int res=Integer.parseInt(i);
        return res;
        
        
    }
}
