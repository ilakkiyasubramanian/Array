Given an array arr, swap the kth element from the beginning with the kth element from the end.


class Solution {
    public List<Integer> swapKth(int k, List<Integer> arr) {
        // code here
        
        int n=arr.size();
        int s=k-1;
        int e=n-k;
        
        
        int temp=arr.get(s);
        arr.set(s,arr.get(e));
        arr.set(e,temp);
        return arr;
        
            
        
    }
}
