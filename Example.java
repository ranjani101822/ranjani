class Birds {
    public void BirdsName() {
        System.out.println("I  can fly");
    }
}

class flamingo extends Birds {
    public void see() {
        System.out.println("People will see me");

    }

}

public class Example {
    public static void main(String[] args) {
        Birds b = new Birds();
        b.BirdsName();
        flamingo f = new flamingo();
        f.see();

    }
}