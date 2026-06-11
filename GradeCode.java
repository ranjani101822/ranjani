public class GradeCode {
    public static void main(String[] args) {
        int marks = 90;
        CalculateGrade(marks);

    }

    public static void CalculateGrade(int mark) {
        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("Grade A");
        } else if (mark >= 80) {
            System.out.println("Grade B");
        } else if (mark >= 70) {
            System.out.println("Grade C");
        } else if (mark >= 60) {
            System.out.println("Grade D");
        } else if (mark >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Fail");
        }
    }

}
