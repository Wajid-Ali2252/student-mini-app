package StudentPackage;
import java.sql.*;

import Db.*;

public class StudentDeo {

    public static boolean studentinsert(Students st) throws SQLException {
        boolean f = false;
        try {

            Connection conn = DbConnection.createConn();
            String sql = "insert into student(name,age,city) Values(?,?,?)";
            PreparedStatement pt = conn.prepareStatement(sql);

            pt.setString(1, st.getStname());
            pt.setInt(2, st.getStage());
            pt.setString(3, st.getStcity());
            pt.executeUpdate();

            f = true;
        }catch (Exception e)
        {
            e.printStackTrace();

        }
        return f;
    }

    public static boolean displayStudent()
    {
        boolean f =false;
        try{
            Connection conn=DbConnection.createConn();
            String sql="Select * from student";
            PreparedStatement pt =conn.prepareStatement(sql);
            ResultSet rs;
            rs = pt.executeQuery();
            while(rs.next())
            {
                System.out.println("ID "+rs.getInt(1));
                System.out.println("Name "+rs.getString(2));
                System.out.println("Age "+rs.getInt(3));
                System.out.println("City "+rs.getString(4));
                System.out.println("++++++++++++++++++++++++");
            }
            f=true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return f;
    }
//      return f;
    public static boolean deleteStudent(int id)
    {
        Boolean f=false;
        try{
               Connection conn=DbConnection.createConn();
               String q="Delete from student where studentid=?";
               PreparedStatement pt=conn.prepareStatement(q);
               pt.setInt(1,id);
               pt.executeUpdate();
            return f;
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return false;
    }

}
