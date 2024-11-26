import java.util.Scanner;

public class javaTask2StudentGradeCalc {
    public static void studentResultCalculator(Scanner scan) {
        try {//Student Grade Calcuator...
            System.out.println("    *** Welcome to Student Grade Calculator!***    ");
            System.out.println();
            System.out.println();
            System.out.println("Enter the no. of Subjets: ");
            int n = scan.nextInt();
            scan.nextLine();

            int totalmarks = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Enter Marks for subjects no. " + (i + 1) + " between 0 and 100: ");
                int obtainedMarks = scan.nextInt();

                //Error message for invalid imputation! Marks entered more then 100 or less then 0...
                while (obtainedMarks < 0 || obtainedMarks > 100) {
                    System.out.println("Invalid Number! Please enter a number between 0 and 100.");
                    System.out.println("Enter marks for subject " + (i + 1) + " again: ");
                    obtainedMarks = scan.nextInt();
                }
                totalmarks += obtainedMarks;
            }

            System.out.println("Student result: ");
            System.out.println("Total marks obtained in all of the subjects: " + totalmarks + " out of "
                    + (n * 100));

            //calculating average percentage...
            float avgPerObtained = ((float) totalmarks / (n * 100)) * 100;
            System.out.printf("Average percentage obtained: %.2f%%\n", avgPerObtained);

            String grade;// assigning grades to students according to thier average percentage...
            if (avgPerObtained >= 90) {
                grade = "A";
            } else if (avgPerObtained >= 80) {
                grade = "B";
            } else if (avgPerObtained >= 70) {
                grade = "C";
            } else if (avgPerObtained >= 60) {
                grade = "D";
            } else if (avgPerObtained >= 50) {
                grade = "E";
            } else {
                grade = "FAIL 🙁";
            }
            System.out.println("Your grade is: " + grade);

            if (avgPerObtained < 50) {
                System.out.println("Better luck next time! 😊");
            }

        } catch (Exception error) { //Catch for mistyped alphabets instead of number...
            System.out.println("Exception occurred: " + error.getMessage());
            scan.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            studentResultCalculator(sc);
            System.out.println("Do you want to calculate another students's result? (y/n): ");
            String character = sc.next();
            if (!character.equalsIgnoreCase("y")) { //Ask user if they wish to continue or not...
                System.out.println("Thank you! Have a nice day ahead!");
                break;
            }

        }
        sc.close();
    }
}
