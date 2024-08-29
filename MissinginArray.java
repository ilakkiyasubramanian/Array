


class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int sum=0;
        int b=n;
        int a=(b*(b+1))/2;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        return a-sum;
        
        
    }
}
