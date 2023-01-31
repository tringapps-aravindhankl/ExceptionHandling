package exceptionhandlingbank;
import java.util.*;
import java.util.logging.*;

class Welcome {
    String holdername;
    int accountnum;
    private double balance = 0;
    Scanner a = new Scanner(System.in);
    static Logger log = Logger.getLogger("hi");

    Welcome() {
        try {
            log.info("ENTER ACCOUNT HOLDERNAME");
            String name = a.next();
            holdername = name;
            log.info("ENTER YOUR ACCOUNTNUMBER");
            int number = a.nextInt();
            accountnum = number;
        } catch (InputMismatchException e) {
            log.info(String.valueOf(e));
            System.exit(0);
        }
    }

    void deposite() {
    	try {
        log.info("enter your deposite amount");
        double deposite = a.nextDouble();
        balance = balance + deposite;
    	}
    	catch(InputMismatchException e) {
    		log.info(String.valueOf(e));
    		System.exit(0);
    	}
    }

    void withdraw() {
    	try {
        log.info("enter withdraw amount");
        double withdraw = a.nextDouble();
        if (withdraw < balance) {
            balance = balance - withdraw;
        } else {
            log.info("your balance is low");
        }
    	}
    	catch(InputMismatchException e) {
    		log.info(String.valueOf(e));
    		System.exit(0);
    	}
    }

    void balance() {
        log.fine("your balance is {}",balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        int option = 0;
        Welcome hi = new Welcome();
        Logger log = Logger.getLogger("hi");
        Scanner b = new Scanner(System.in);
        do {
            log.info("1.Deposite");
            log.info("2.withdraw");
            log.info("3.balance");
            log.info("4.Exit");
            try {
            option=b.nextInt();
            }
            catch(InputMismatchException e) {
            	log.info(String.valueOf(e));
            	System.exit(0);
            }
            switch (option) {
                case 1:
                    hi.deposite();
                    break;
                case 2:
                    hi.withdraw();
                    break;
                case 3:
                    hi.balance();
                    break;
                case 4:
                    log.info("Enter Valid option");
                    break;
                default:
            }
        } while (option < 4);

    }

}
