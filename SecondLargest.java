//Find the largest element of array
public class SecondLargest{
    public static void main(String args[])
    {
int arr[]={1,6,3,2,7,7,5};
int largest=arr[0];
int SecondLargest=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>largest)
{
largest=arr[i];
}
else if(arr[i]>arr[0] &&arr[i]!=largest)
{
SecondLargest=arr[i];
}
}
System.out.println(SecondLargest);

    }
}

//The Time complextiy O(n)
//Space complexity O(1)
