# Problems of Easy (Arrays)

# Problem - findmissingnumber of Given Array 

  Example 1

Input: nums = [0, 2, 3, 1, 4]

Output: 5

Explanation:

nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]


  # Approch :-

  1. First Sort The Given Array
  2. traverse The array 
  3. check The traverse arrays is Not Equal to Sorting array 
  4. if Found The missing number Return The index number
  5. otherwise return the array of Length 

  #code :- 

  class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums); //  Sort The Array 

        for(int i = 0 ; i < nums.length ; i++){ // Iterate The Given Array
            if(i!=nums[i]){ //  if The found The Missing Number 
                return i; //  return The Array Num 
            }
        }
        return nums.length; // otherwise return The Array of length
        
    }
}


# Time Complexity = O(n logn) // Coz We Did The Sorting the array 
# Space Complexity = O(1)
