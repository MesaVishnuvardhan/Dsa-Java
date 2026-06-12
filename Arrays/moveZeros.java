easy Level Problems 

# Problem :-  Move Zeros to End

  # Approch : -
  1. We Use The Two pointer Approch 
  2. The one pointer is left at 0
  3. another pointer will use in for loop that pointer is right start from index 0 to traverse the array 
  4. give the if condition that is if array of right found non zero eliments swap it
  5. if found non zero eliments swap the right and left pointers poistion
  6. the condition was complete we will moves left position forward 

  # Code :-

class Solution {
    public void moveZeroes(int[] nums) {
        int left =0; // give the pointer at  left 

        for (int right= 0 ; right < nums.length ;right++){ // another pointer will declare into a loop 
            if(nums[right]!=0){ // if any non zero eliments found the condition will true 
                int temp = nums[right]; // swap the eliments 
                nums[right] = nums[left];
                nums[left]  = temp;
                left++; // moving the left pointer position 
            }
        }
        
    }
}

# Time complexity = O(N) // we using the n no of times checking the array 
# Space Comlexity = O(1) // declare the pointers at pointer consume the extra space
