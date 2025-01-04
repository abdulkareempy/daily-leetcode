class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        if (k < arr[low]) {
            return k;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // 1 3 4 5 6 7 8 11 12
            // let k = 2

            int noOfMissingTillHere = arr[mid] - (mid + 1);

            if (noOfMissingTillHere < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }

        return low + k;
    }
}