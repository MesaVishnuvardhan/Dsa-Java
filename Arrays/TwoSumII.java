# TwoSum 


# Problem : - 167. Two Sum II - Input Array Is Sorted

  # Approch : -
  1. Two Pointer Approch
  2. left and right pointers at postion int arr = 0 ,  arr = n-1 
  3. Check The Array Eliments While the left and right eliments can sum = target 
  4. if the target Is Found Return the left and right Indexes
  5 . else if sum is greater than target The Right Position will decrease it 
  6 . else left postion will Increased 
  7 . other wise return -1,-1 values 

  # Code :-

  class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int left = 0 ;
        int right = n-1;

        while (left < right){
            int sum = numbers[left]+numbers[right];
            if (sum == target){
                return new int[] { left+1 , right+1};
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}


# Time Complexity = O(N)
# Space Complexity = O(1)
