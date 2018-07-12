package V2;

import java.sql.*;

public class getAllstudentinfo {

    public getAllstudentinfo() {
        try {
            SQLConnection sqlcon = new SQLConnection();
            Connection con = sqlcon.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println("----------------------");
                System.out.println("ID : " + rs.getString(1));
                System.out.println("Name : " + rs.getString(2));
                System.out.println("Age : " + rs.getString(3));
                System.out.println("Address : " + rs.getString(4));
                System.out.println("----------------------");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
