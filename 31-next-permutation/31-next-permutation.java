class Solution {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 2;
        // find the first pair of two successive numbers nums[index] and nums[index + 1]
        // from the right, which satisfy nums[index] < [index + 1]
        while (index >= 0 && nums[index] >= nums[index + 1]) {
            index--;
        }
        
        // swap the number nums[index] with the number a[larger] which is just larger than itself 
        if (index >= 0) {
            int larger = nums.length - 1;
            while (larger >= 0 && nums[larger] <= nums[index]) {
                larger--;
            }
            swap(nums, index, larger);
        }
        
        // reverse the numbers following a[index] to get the next smallest lexicographic permutation
        reverse(nums, index + 1);
    }
    
    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}