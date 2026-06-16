# Problem  : - 53. Maximum Subarray (Leetcode )
 Given an integer array nums, find the subarray with the largest sum, and return its sum.


# Brute Force Approch :- 








  
# Better Approch 
  Code:- class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;

        for( int i =0 ; i<n;i++){
            int sum = 0;
            for( int j =i ; j<n;j++){
                sum+=nums[j];
                maxi = Math.max(sum , maxi);
            }
        }
        return maxi;
    }
}

Note :- The Given input run is complete but when try to submit they get error on Time limit Exceeded So Thats Mean Optimise the ur code 
  1. We use the Kaden's Algorithms for Optimized The Solution
