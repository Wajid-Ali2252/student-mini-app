
import java.util.*;
//import StudentPackage.Students;
//import  Db.DbConnection;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          System.out.println("welcome");

          while (true)
          {
              System.out.println("Press 1  for add student");
              System.out.println("Press 2  for display student");
              System.out.println("Press 3  for delete student");
              System.out.println("Press 4  for exit program");
              Scanner sc = new Scanner(System.in);
              int c =sc.nextInt();
              if(c == 1)
              {
                  //  add student
              } else if (c==2) {
                     // display students
              } else if (c == 3) {
                  /// delete student
              }else if (c ==4){
                  break;
              }else {

              }
          }
        }


    }
