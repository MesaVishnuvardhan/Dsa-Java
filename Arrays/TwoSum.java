
# Problem : - Two sum 

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

# BruteForce 

1. use use the loops for two pointers 
2. outer loop is left pointer position start at 0 to length -1 
3. inner loop is right pointer position start from left + 1 eliment to length of array
4. sum the left and right until target found 
5. if target was found return the indexes of left and right
6. other wise return the new arary of index with empty eliments

#Code :-

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;


        for (int left= 0; left < n-1;left++){ // left pointer
            for (int right = left + 1;right<n;right++){ // right pointer 
                if(nums[left]+nums[right]==target){ // if found the tarbet 
                    return new int[]{left,right}; //  return the indexes of left and right 
                }
            }
        }
        return new int[]{}; //  if no solution find return this 
    }
}

# Time Complexity = O(N^2)  // we using the n loops in twotimes 
# Space Comlex = O(1) // using extra space 


