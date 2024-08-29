

Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

Examples:

Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.
Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.


class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        Set <Integer> seen=new HashSet<>();
        ArrayList <Integer> Dup=new ArrayList<>();
        for(int i:arr)
        {
            if(seen.contains(i))
            {
                if(!Dup.contains(i))
                Dup.add(i);
            }
            else
            {
                
                    seen.add(i);
            }
        }
        if(Dup.size()==0)
            return new ArrayList <Integer>(Arrays.asList(-1));
        Collections.sort(Dup);
        return Dup;
    }
}
