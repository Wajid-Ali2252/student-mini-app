import java.sql.SQLException;
import java.util.Scanner;
import StudentPackage.Students;
import StudentPackage.StudentDeo;

public class Main {
    public static  void main(String[] args) throws SQLException {
        System.out.println("Welcome!");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 for add student");
            System.out.println("Press 2 for display student");
            System.out.println("Press 3 for delete student");
            System.out.println("Press 4 for exit program");

            int c = sc.nextInt();
            sc.nextLine(); // Consume newline character

            if (c == 1) {
                System.out.println("Enter Student Name:");
                String name = sc.nextLine();
                System.out.println("Enter Student Age:");
                int age = sc.nextInt();
                sc.nextLine(); // Consume newline character
                System.out.println("Enter Student City:");
                String city = sc.nextLine();

                // Create Student object
                Students st = new Students(name, age, city);
                StudentDeo conn=new StudentDeo();
                boolean ans=conn.studentinsert(st);
                System.out.println(ans);
                if(ans){
                    System.out.println("Student has  been inserted Congruts");
                }


            } else if (c == 2) {

                StudentDeo conn=new StudentDeo();
                boolean ans=conn.displayStudent();
            } else if (c == 3) {
                System.out.println("Enter Student Id ");
                int id=sc.nextInt();
                StudentDeo conn=new StudentDeo();
                boolean ans=conn.deleteStudent(id);
                if(ans)
                {
                    System.out.println("Student has been deleted  against this id "+id);
                }else{
                    System.out.println("innvalid  Id");
                }

            } else if (c == 4) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("Thank you for using our application.");
        System.out.println("See you soon! Goodbye.");
    }
}
