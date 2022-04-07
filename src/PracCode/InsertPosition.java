package PracCode;

import java.util.Scanner;

public class InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]<target)
                continue;
            if(nums[i]>target)
                return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Target");
        int t=sc.nextInt();
        System.out.println(searchInsert(arr,t));
    }
}
