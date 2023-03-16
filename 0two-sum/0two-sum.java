class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> visitedElementMap = new HashMap<>();
        int[] output = {0,0};
        for(int i = 0; i<nums.length; i++) {
            int difference = target - nums[i];
            if(visitedElementMap.containsKey(difference)){
                return new int[] {i, visitedElementMap.get(difference)};
            }
            else {
                visitedElementMap.put(nums[i],i);
            }
        }
        return output;
    }
}