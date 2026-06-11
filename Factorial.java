public class Factorial {
    public static void main(String[] arg) {
        Factorial.printFactors(20);

    }

    public static void printFactors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
