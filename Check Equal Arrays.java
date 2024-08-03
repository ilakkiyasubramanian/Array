


class Solution {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<=arr1.length-1;i++)
        {
            if(arr1[i]!=arr2[i])
            return false;
        }
        return true;
        
        
    }
}


1 2 5 4 0
2 4 5 0 1
Your Output: 
true
Expected Output: 
true
