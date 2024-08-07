Given an array arr, rotate the array by one position in clock-wise direction.


class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length-1;
        int last=arr[n];
        for(int i=n;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
    
}
