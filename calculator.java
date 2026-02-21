import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter total number of subjects: ");
        int numSubjects = sc.nextInt(); 
        
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            totalMarks += sc.nextInt();
        }
        
        double averagePercentage = (double) totalMarks / numSubjects;
        String grade;
        
        if (averagePercentage >= 90) grade = "A+";
        else if (averagePercentage >= 80) grade = "A";
        else if (averagePercentage >= 70) grade = "B";
        else if (averagePercentage >= 60) grade = "C";
        else grade = "D";
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}