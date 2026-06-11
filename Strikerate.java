public class Strikerate {
    public static void main(String[] args) {
        int runs = 200;
        int balls = 75;
        strikeRateFinder(runs, balls);
    }

    public static String strikeRateFinder(int runs, int balls) {
        int strikeRate = (runs / balls) * 100;
        if (strikeRate > 150) {
            return "Explosive";
        } else if (strikeRate > 100) {
            return "Good";
        } else {
            return "Slow";
        }
    }
}