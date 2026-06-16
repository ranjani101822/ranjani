public class Unitsum {
    public static void main(String[] args) {
        System.out.println(calculateBill(500));

    }

    public static int calculateBill(int units) {
        int bill = 0;
        if (units > 300) {
            bill = 100 * 5 + 100 * 6 + 100 * 7 + (units - 300) * 8;
        } else if (units > 200) {
            bill = 100 * 5 + 100 * 6 + (units - 200) * 7;
        } else if (units > 100) {
            bill = 100 * 5 + (units - 100) * 6;
        } else {
            bill = units * 5;
        }
        return bill;
    }
}
