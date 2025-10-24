//Left rotate the array by one palce

public class LeftRotate
{
    public static int[] Left_Rotate(int [] nums,int n)
  {
int temp=nums[0];
for(int i=1;i<n;i++)
{
nums[i-1]=nums[i];

}
nums[n-1]=temp;
return nums;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int n=5;

int[] res=Left_Rotate(nums,n);
for(int i=0;i<n;i++)
{
    System.out.print(res[i]);
}
    
}
}
//Time complexity is O(n)
//Space complexity is O(1)