// public class Vowelstring {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = Character.toLowerCase(str.charAt(i));

//             if (ch == 'a' || ch == 'e' || ch == 'i' ||
//                     ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }

//         System.out.println("vowels: " + count);
//     }
// }

public class Vowelstring {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpper 9Case(str.charAt(i));

            if (ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println("vowels: " + count);
    }
}