// public class ArrayAverage {

//     public static double average(int[] arr) {
//         int sum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             sum = sum + arr[i];
//         }

//         return (double) sum / arr.length;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 5, 10, 15 };

//         double avg = average(arr);

//         System.out.println("Average = " + avg);
//     }
// }
// 0

// public class ArrayAverage {
//     public static void main(String[] args) {

//         int[] arr = { 10, 20, 2, 4, 6, 8, 9 };

//         int sum = 0;

//         for (int i = 0; i < arr.length; i += 2) {
//             sum += arr[i];
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

public class ArrayAverage {

    public static int evenPositionSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 2, 4, 6, 8, 9 };

        int result = evenPositionSum(arr);

        System.out.println("Sum = " + result);
    }
}