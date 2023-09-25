public class bs {
    public static int search(int[] nums, int target) {
        int l = 0, h = nums.length;
        while(l <= h) {
            int m = (l + h) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        // int ans = search(arr, 9);
        // System.out.println(ans);
        // System.out.println(arr.length);
    }
}
