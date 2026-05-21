import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator\n\n");
        while (true) {
            try {
                System.out.print("Enter the number of subjects: ");
                int numOfSub = sc.nextInt();
                if (numOfSub < 1) {
                    throw new Exception();
                }
                int i = 0;
                int[] marks = new int[numOfSub];
                while (numOfSub > i) {
                    try {
                        System.out.print("Enter marks of subject " + (i+1) + ": ");
                        int mark = sc.nextInt();
                        if ((mark > 100) || (mark < 0)) {
                            throw new Exception();
                        }
                        marks[i] = mark;
                        i++;
                    }
                    catch (Exception e) {
                        System.out.println("You have entered incorrect marks, please try again\n");
                        sc.nextLine();
                        continue;
                    }
                }
                int sumOfMarks = 0;
                for (int mark : marks) {
                    sumOfMarks += mark;
                }
                double percentage = (double) sumOfMarks / numOfSub;
                System.out.printf("Percentage: %.2f%n",percentage);
                if (percentage >= 90) {
                    System.out.println("Grade: A+");
                }
                else if (percentage >= 80) {
                    System.out.println("Grade: A");
                }
                else if (percentage >= 70) {
                    System.out.println("Grade: B");
                }
                else if (percentage >= 60) {
                    System.out.println("Grade: C");
                }
                else if (percentage >= 50) {
                    System.out.println("Grade: D");
                }
                else if (percentage >= 40) {
                    System.out.println("Grade: P");
                }
                else {
                    System.out.println("Grade: F");
                }

                System.out.println("Enter 'exit' to quit the program, hit enter for checking more grades");
                sc.nextLine();
                System.out.print("Enter your choice: ");
                String choice = sc.nextLine();
                if (choice.toLowerCase().equals("exit")) {
                    break;
                } 
            }
            catch (Exception e) {
                System.out.println("You have entered incorrect number of Subjects, please try again\n");
                sc.nextLine();
                continue;
            }
        }
        System.out.println("Thanks for using Grade Calculator");
        sc.close();
    }
}