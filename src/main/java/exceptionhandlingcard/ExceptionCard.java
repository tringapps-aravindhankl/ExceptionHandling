package exceptionhandlingcard;
import java.util.*;
import java.util.logging.*;
class Credit implements Cloneable{
	String cardholder;
	Long cardnumber;
	String expirydate;
	Logger log=Logger.getLogger("hi");
	Credit(String cardholder,Long cardnumber,String expirydate)
	{
		this.cardholder=cardholder;
		this.cardnumber=cardnumber;
		this.expirydate=expirydate;
	}
	Credit active() {
		try{
			return (Credit) super.clone();
		}
		catch(Exception e) {
			log.info("error");
			return this;
		}
	}
	boolean helo(Long card)
	{
		return cardnumber.equals(card);
	}
}
public class ExceptionCard
{
    private static Scanner scan;

	public static void main( String[] args )
	{
	    Logger log=Logger.getLogger("hi");
	    long cardnumber = 0;
	    String cardholder="";
		String expirydate="";
        scan = new Scanner(System.in);
        try {
        log.info("Enter CardHolder Name");
        cardholder=scan.next();
        log.info("Enter CardNumber");
        cardnumber = scan.nextLong();
        log.info("Enter ExpiryDate");
        expirydate=scan.next();
        }
        catch(InputMismatchException  e) {
        	log.info(String.valueOf(e));
        	System.exit(0);
        }
        Long card=1234l;
		Credit s1=new Credit(cardholder,cardnumber,expirydate);
        Credit s2=s1.active();
        boolean ans=s2.helo(card);
        System.out.println(ans);
	if(cardnumber==card) {
			log.info("CardHolder:" +cardholder+ "     cardnumber:" +cardnumber+ "    expirydate:" +expirydate);
		}
		else {
			log.info("Failed");
		}
    }
}