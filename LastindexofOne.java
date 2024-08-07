Given a string s consisting of only '0's and '1's,  find the last index of the '1' present.

Note: If '1' is not present, return "-1"



class Solution {
    public int lastIndex(String s) {
        int n=s.length();
        int last=-1;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                last=i;
            }
        }
        return last;
        
        
    }
}
