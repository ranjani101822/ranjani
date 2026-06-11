public class Maximum {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 7, 89, 34 };

        int max = arr[0]; // Assume first element is maximum

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Ele:" + max);
    }
}