package V2;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class enterNewstudentinfo {

    public enterNewstudentinfo() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the Student Id:");

        int idno = keyboard.nextInt();

        System.out.println("Enter the Student Name:");

        String Name = keyboard.next();

        System.out.println("Enter the Student Age:");

        int age = keyboard.nextInt();

        System.out.println("Enter the Student Address:");

        String Address = keyboard.next();

        try {
            SQLConnection sqlcon = new SQLConnection();
            Connection con = sqlcon.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO student(ID,Name,Age,Address)" + "VALUES('" + idno + "','" + Name + "','" + age + "','" + Address + "');";
            st.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
