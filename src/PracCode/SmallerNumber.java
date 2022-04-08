package PracCode;

public class SmallerNumber {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,5,4,6,5,8,9,7};
        int[] ints = smallerNumbersThanCurrent(arr);
        for (int c :ints) {
            System.out.println(c);
        }
    }
}
