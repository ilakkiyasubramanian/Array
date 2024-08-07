Given an array arr. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array


class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        // code here
        
        List<Integer> result=new ArrayList<>();
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums.get(i)==(i+1)){
                result.add(i+1);
            }
        }
        return result;
    }
}
