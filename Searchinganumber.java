Given an integer k and array arr. Your task is to return the position of the first occurrence of k in the given array and if element k is not present in the array then return -1.

Note: 1-based indexing is followed here.


class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==k)
            {
            return i+1;
            }
            
               
            
        }
         return -1;
    }
}
