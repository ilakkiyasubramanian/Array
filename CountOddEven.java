Given an array arr[] of positive integers. The task is to return the count of the number of odd and even elements in the array.

Note: Return an array of two elements where the first one in the count of odd & second one is the count of even.




class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n=arr.length;
        
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] %2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }return new int[]{odd,even};
    }
}
