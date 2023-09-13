import java.util.Scanner;
public class GradeCalculator {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        double numGrade;

        System.out.println("Enter numeric grade");
        numGrade = in.nextDouble();

        if (numGrade < 0) {
            System.out.println("Error. Grade cannot be a negative number");
        } else if (numGrade >= 92) {
            System.out.println("Your grade is an A");
        } else if (numGrade <= 92 && numGrade >= 90) {
            System.out.println("Your grade is an A-");
        } else if (numGrade <= 90 && numGrade >= 87) {
            System.out.println("Your grade is a B+");
        } else if (numGrade <= 87 && numGrade >= 82) {
            System.out.println("Your grade is a B");
        } else if (numGrade <= 82 && numGrade >= 80) {
            System.out.println("Your grade is a B-");
        } else if (numGrade <= 80 && numGrade >= 77) {
            System.out.println("Your grade is a C+");
        } else if (numGrade <= 77 && numGrade >= 72) {
            System.out.println("Your grade is a C");
        } else if (numGrade <= 72 && numGrade >= 70) {
            System.out.println("Your grade is a C-");
        } else if (numGrade <= 70 && numGrade >= 67) {
            System.out.println("Your grade is a D+");
        } else if (numGrade <= 67 && numGrade >= 62) {
            System.out.println("Your grade is a D");
        } else if (numGrade <= 62 && numGrade >= 60) {
            System.out.println("Your grade is a D-");
        } else if (numGrade <= 60 && numGrade >= 0) {
            System.out.println("Your grade is an F");

        }


    }}
