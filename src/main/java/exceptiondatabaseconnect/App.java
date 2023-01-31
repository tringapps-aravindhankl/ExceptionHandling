package exceptiondatabaseconnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.*;
import java.util.*;
class Database{
	String url;
	String username;
	String password;
	Connection con;
	Logger log=Logger.getLogger("hi");
	
	private Database(String url,String username,String password) {
		this.url=url;
		this.username=username;
		this.password=password;
	}
	
	public static Database s1(String url,String username,String password){
		return new Database(url,username,password);
	}
	
	void connect() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,username,password);
		log.info("Connection Successfully");
		}
		catch(Exception e){
			log.info("error");
		}
	}
	void close() {
		try {
		con.close();
		log.info("Connection Closed");
		}
		catch(Exception e){
			log.info("error");
		}
	}
	void exit() {
		log.info("Exit");
	}
}
public class App 
{
    private static Scanner scan;

	public static void main( String[] args )
    {
        scan = new Scanner(System.in);
	Logger log=Logger.getLogger("hi");
        log.info("Enter URL");
        String url=scan.nextLine();
        log.info("Enter Username");
        String username=scan.nextLine();
        log.info("Enter Password");
        String password=scan.nextLine();
        log.info("1.connect  2.close  3.exit");
        int option=scan.nextInt();
        Database s2=Database.s1(url, username, password);
        if(option==1)
        {
        s2.connect();
        }
        else if(option==2)
        {
        s2.close();
        }
        else
        {
        s2.exit();	
        }
    }
}
