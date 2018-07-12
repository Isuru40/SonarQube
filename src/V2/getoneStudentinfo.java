package V2;

import java.sql.*;
import java.util.Scanner;

public class getoneStudentinfo {

    public getoneStudentinfo() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the Student Id to get info:");

        int idno = keyboard.nextInt();

        try {
            SQLConnection sqlcon = new SQLConnection();
            Connection con = sqlcon.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where ID='" + idno + "'");
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
