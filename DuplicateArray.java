//Remove duplicate from sorted array

class DuplicateArray {
    
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
if(nums[i]!=nums[j])
{
nums[i+1]=nums[j];
i++;
}
        }
      return i+1;    
    }
     public static void main(String[] args) {
        int nums[]={1,1,2,3 ,7,7,9,10}; 
      int result=removeDuplicates( nums);
      System.out.println("Uniqe elements are:");
      for(int i=0;i<result;i++)
      {
        System.out.println(nums[i]+" ");
      }  
    }
}


//Time complexity of this code is  O(n)     But,why=>then we can say,single pass through the array.
 //Space complexity of this code is O(1)    But,why=>then we can say,In-place modification, no extra memory used.

//Here I write some case, It is perfect for all cases

/*
 Case1:  int nums[]={1,1,2,3 ,7,7,9,10};
 expexted output:1 2 3 7 9

 Case2:  int nums[]={1,1,10};
 expected out:1 10

 Case3:   int nums[]={1,2,2,3,7,7,7,10};
 expected output 1 2 3 7 10
 */













//The Time complextiy O(n)
//Space complexity O(1)
