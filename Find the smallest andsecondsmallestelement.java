Given an array, arr of integers, your task is to return the smallest and second smallest element in the array. If the smallest and second smallest do not exist, return -1.


class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        
        // code here
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int tmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=min && arr[i]<tmin)
            {
                tmin=arr[i];
            }
        }
        if(tmin==Integer.MAX_VALUE)
        {
            return new int[] {-1};
        }
        return new int[] {min,tmin};
        
        
    }
}
