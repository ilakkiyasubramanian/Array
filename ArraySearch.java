Array Search


class Solution {

    static int search(int arr[], int x) {

        // Your code here
        for(int i:arr)
        {
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
}


For Input: 
1 2 3 4
3
Your Output: 
2
Expected Output: 
2
