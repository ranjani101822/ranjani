public class LowetoUpper {

    public static void ConverttoUpper(String s) {
        String res = " ";
        for (int i = 0; i < s.length(); i++) {
            int ascofSmall = s.charAt(i);
            int ascofUpper = ascofSmall - 32;
            char upperchar = (char) ascofUpper;
            res += upperchar;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String s = "hello world";
        ConverttoUpper(s);
    }
}