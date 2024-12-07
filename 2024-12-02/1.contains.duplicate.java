/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

        Example 1:

        Input: nums = [1,2,3,1]

        Output: true

        Explanation:

        The element 1 occurs at the indices 0 and 3.
*/

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
      return false;
    }
}