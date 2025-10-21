//Find the largest element of array
public class Array_1{
    public static void main(String[] args) {
        int arr[]={3,2,1,5,2};
        int largest=arr[0];
       System.out.println("Find the largest elemets in array");
       for(int i=0;i<arr.length;i++)
       {
  System.out.println(arr[i]);
       }
       for(int i=0;i<arr.length;i++)
       {
if(arr[i]>largest)
{
    largest=arr[i];
    System.out.print("Largest element is:"+largest);
}
       }
       
     
    }
}