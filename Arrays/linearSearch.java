# Linear Search

## Problem
Find the index of a given number in an array.

## Approach
1. Traverse the array from left to right.
2. Compare each element with the target number.
3. If found, return the index.
4. Otherwise return -1.

Code : - 

  Public int LeanearSearch(int [] arr,int n){
      for ( int i = 0 ; i < n; i++){   // For Itearation of The Array
         if(arr[i] == Num ) { //  Check the Condition Given Num is eaqual To Array index 
            return i; //  Return The Array Index 
         }
      }
  return -1; //  
}

## Time Complexity
O(N)

## Space Complexity
O(1)
