// class Student {
//     String name;
//     String collegename;
//     int rollno;
//     int age;
//     String dept;

//     public void studDetails() {
//         System.out.println("Name:" + name);
//         System.out.println("CollegeName:" + collegename);
//         System.out.println("RollNO:" + rollno);
//         System.out.println("Age:" + age);
//         System.out.println("Department:" + dept);
//     }

// }

class Mobile {
    String Mobilename;
    int MobileSize;
    double price;

    public void MobileDetails() {
        System.out.println("MobileName:" + Mobilename);
        System.out.println("MobileSize:" + MobileSize);
        System.out.println("Mobile Price:" + price);
    }

    public Mobile(String Mobilename, int MobileSize, double price) {
        this.Mobilename = Mobilename;
        this.MobileSize = MobileSize;
        this.price = price;
    }

}

public class Example2 {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Ranjani";
        // s1.age = 18;
        // s1.rollno = 40;
        // s1.collegename = "PSVPEC";
        // s1.dept = "CSE";

        // s1.studDetails();
        Mobile m1 = new Mobile("Realme", 28, 30000);
        m1.MobileDetails();

    }

}
