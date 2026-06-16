// public class Gcd {
//     public static void main(String[] args) {
//         int n1 = 10;
//         int n2 = 20;
//         int gcd = 1;
//         System.out.println(gcdSum(n1, n2, gcd));

//     }

//     public static int gcdSum(int n1, int n2, int gcd) {
//         for (int i = 1; i <= Math.min(n1, n2); i++) {
//             if ((n1 % i == 0) && (n2 % i == 0)) {
//                 gcd = i;
//             }
//         }
//         return gcd;

//     }
// }

// public class Gcd {

//     public static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         int a = 10;
//         int b = 15;

//         System.out.println(gcd(a, b));
//     }
// }

public class Gcd {

    public static int gcdsum(int a, int b) {
        while (a > 0 && b > 0) {
            if (a >= b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        if (a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println(gcdsum(a, b));
    }
}