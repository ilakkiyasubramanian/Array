

****Selection Sort**********

class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        
        int min=i;
        for(int k=i;k<arr.length;k++)
        {
            if(arr[min]>arr[k])
            {
                min=k;
            }
        }
        return min;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n;i++)
	    {
	        int min=select(arr,i);
	        int temp=arr[i];
	        arr[i]=arr[min];
	        arr[min]=temp;
	        
	    }
	}
}



