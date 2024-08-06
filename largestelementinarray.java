Given an array arr, the task is to find the largest element in it.


class Solution {
    public static int largest(int n, int[] arr) {
        // code here
        int max=arr[0];
        for(int i:arr){
            if(i>=max){
                max=i;
            }
        }
        return max;
    }
}
