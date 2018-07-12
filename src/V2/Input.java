package V2;

import java.util.Scanner;

public class Input {

    public Input() {
         int cmd = 0;

        System.out.println("Which operater do you want to do?\n1.Add net student\tPress 1\n2.Get all student info\tPress 2\n3.Get one student info which you perfer\t Press 3\n4.Exit\tPress 4");
        Scanner keyboard = new Scanner(System.in);
        cmd = keyboard.nextInt();

        switch (cmd) {

            case 1:
                new enterNewstudentinfo();                
                break;

            case 2:
                new getAllstudentinfo();
                break;

            case 3:
                new getoneStudentinfo();
                break;
             case 4:
                System.exit(0);
                break;    
            default:
                System.out.println("Please try again.....");
                new Input();
        }
    }

  
       
        
   
}
