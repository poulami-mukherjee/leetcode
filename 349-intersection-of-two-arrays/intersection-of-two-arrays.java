class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hash_set = new HashSet<>(); 
        for(int n1 : nums1) {
            for(int n2: nums2){
                if(n1 == n2) {
                    hash_set.add(n1);
                    break;
                }
            }
        }

        int[] array = new int[hash_set.size()];

       // Convert the set to an array of Integer
        Integer[] integerArray = hash_set.toArray(new Integer[0]);
        
        // Copy the elements to the int array
        for (int i = 0; i < integerArray.length; i++) {
            array[i] = integerArray[i];
        }
        
        return array;
    }
}