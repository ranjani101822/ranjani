public class Squarenum {
    public static void main(String[] arg) {
        Squarenum.squareRoot(36);

    }

    public static void squareRoot(int num) {
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i);
                System.out.println(num / i);
            }
        }

    }
}
