# Problem :- Reverse an array

  # Approch :-
  1. using two pointer approch
  2. one pointer is left and another pointer is right 
  3 . left pointer start at 0
  4. right pointer start at n-1 array of length
  5. using while loop to travearse array 
  6. using while loop until left and right pointer cross eachother 
  7. swap the rigth and left elimennts 


  code: -

  public int reverseanarray(int [] nums , int n){
      int left = 0 ;
      int right = n-1;

      while (left < right){
         int temp = nums[left];
         nums[left] = nums[right];
         nums[right] = temp ;
         left++ ;
         right--;
 }
}

Time Complexity = O(N)
Space complexity = O(1)

