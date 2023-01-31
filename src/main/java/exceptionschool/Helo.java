package exceptionschool;
import java.util.Scanner;
import java.util.logging.*;

class Student {
    String name;
    char grade;
    float gpa;
    Logger log=Logger.getLogger("hi");
    Student(String a, char b, float c) {
        name = a;
        grade = b;
        gpa = c;
    }

    void update(float a) {
        gpa = a;
        log.info(" {} has a GPA {}",name,gpa);
    }
}
public class Helo
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
        Logger log=Logger.getLogger("hi");
        try {
        log.info("enter your name");
        String name = scan.nextLine();

        log.info("enter your Grade");
        char grad = scan.next().charAt(0);

        log.info("enter your GPA");
        float gpa = scan.nextFloat();

        Student a = new Student(name, grad, gpa);

        log.info("Do you update GPA? 1.yes  2.no");
        int option = scan.nextInt();
        if (option == 1) {
            log.info("enter GPA");
            float mark = scan.nextFloat();
            a.update(mark);
        } else {
              log.info("thank you");
        }
        }
        catch(Exception e)
        {
        	log.info(String.valueOf(e));
        	System.exit(0);
        }

    }
}
