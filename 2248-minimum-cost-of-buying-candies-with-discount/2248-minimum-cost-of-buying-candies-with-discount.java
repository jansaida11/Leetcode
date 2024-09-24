
class Solution {
    public int minimumCost(int[] cost) {
        // Sort the array in descending order
        Arrays.sort(cost);
        reverse(cost); // Reverse the sorted array to get descending order

        // Calculate the total sum of all items
        int sum1 = 0;
        for (int price : cost) {
            sum1 += price;
        }

        // Calculate the sum of every third item starting from the third
        int sum2 = 0;
        for (int i = 2; i < cost.length; i += 3) {
            sum2 += cost[i];
        }

        // Return the total sum minus the sum of the free items
        return sum1 - sum2;
    }

    // Helper function to reverse the array (for sorting in descending order)
    private void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
