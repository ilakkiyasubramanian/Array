class Compute
{
    String average(int A[], int N)
    {
        
        int sum=0;
        for(int i:A)
        {
            sum+=i;
        }
        double avg=(double)sum/N;
        String f=String.format("%.2f",avg);
        return f;
    }
}
