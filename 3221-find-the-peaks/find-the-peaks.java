class Solution {
    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        // Start from the second element and go up to the second last element
        for (int i = 1; i < mountain.length - 1; i++) {
            // Check if the current element is strictly greater than its neighbors
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peaks.add(i); // Add the index of the peak to the list
            }
        }
        return peaks;
    }
}