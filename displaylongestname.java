class Solution {
    public static String longest(int n, String[] names) {
        // code here
        String longn=names[0];
        for(String i:names)
        {
            if(i.length()>longn.length())
            {
                longn=i;
            }
        }
        return longn;
    }
}
