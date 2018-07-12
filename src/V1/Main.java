package V1;
import java.sql.*;
import java.util.Scanner;


public class Main {

      
    public Main(){
        
    }
    public static void main(String[] args) {
        
        System.out.println("Which operater do you want to do?\n1.Add net student\tPress 1\n2.Get all student info\tPress 2\n3.Get one student info which you perfer\t Press 3\n4.Exit\tPress 4");
        Scanner keyboard = new Scanner(System.in);
        int cmd=0;
        while(cmd!=1 &&cmd!=2&&cmd!=3){
            cmd = keyboard.nextInt();
            if(cmd!=1 &&cmd!=2&&cmd!=3){
                System.out.println("Please try again.....");
            }
        }
        
        
       
        
       switch(cmd){
    
           case 1:
               enterNewstudentinfo();
               break;

           case 2:
               getAllstudentinfo();
               break;

           case 3:
               getoneStudentinfo();
               break;
               
            case 4:
               System.exit(0);
               break;
                
           default:
               System.out.println("Enter wrong :\nPlease try again.");
              
    
         }
          
    }
    
    static void  getAllstudentinfo(){
    
              try{
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from student");
         while(rs.next())
         {
             System.out.println("----------------------");
             System.out.println("ID : "+rs.getString(1));
             System.out.println("Name : "+rs.getString(2));
             System.out.println("Age : "+rs.getString(3));
             System.out.println("Address : "+rs.getString(4));
             System.out.println("----------------------");
         }
         
     }catch(Exception e)
     {
         System.out.println(e.getMessage());
     }
        
    
    }
    
    static void enterNewstudentinfo(){
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the Student Id:");
        
        int idno=keyboard.nextInt();
        
        System.out.println("Enter the Student Name:");
        
        String Name=keyboard.next();
        
         System.out.println("Enter the Student Age:");
        
        int age=keyboard.nextInt();
        
        System.out.println("Enter the Student Address:");
        
        String Address=keyboard.next();
        
        
                 try{
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
         Statement st = con.createStatement();
          String sql = "INSERT INTO student(ID,Name,Age,Address)"+"VALUES('"+idno+"','"+ Name+"','"+age+"','"+Address+"');";
          st.executeUpdate(sql);
         
     }catch(Exception e)
     {
         System.out.println(e.getMessage());
     }
        
       
    
    }
    
    static void getoneStudentinfo(){
        
            Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the Student Id to get info:");
        
        int idno=keyboard.nextInt();
        
               try{
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/students","root","");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from student where ID='"+idno+"'");
         while(rs.next())
         {
             System.out.println(rs.getString(1));
             System.out.println(rs.getString(2));
             System.out.println(rs.getString(3));
             System.out.println(rs.getString(4));
             System.out.println("----------------------");
         }
     }catch(Exception e)
     {
         System.out.println(e.getMessage());
     }
        
    
    }
}
