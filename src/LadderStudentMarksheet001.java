import java.util.Scanner;

public class LadderStudentMarksheet001 {

    static int marks;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (marks >= 70) {

            System.out.println(" Distinction ");

        } else if (marks >= 60) {
            System.out.println(" First class");

        } else if (marks >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }

}

