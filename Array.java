import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        // System.out.println(nums[0]);
        // nums[2] = 100;
        // nums[3]++;
        // nums[3]--;
        // nums[3] += 10;
        // System.out.println(Arrays.toString(nums));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Input for index %d:", i);
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }

}
