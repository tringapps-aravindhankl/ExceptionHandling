package exceptionhandlingmaths;
import java.util.*;
import java.util.logging.*;

class Graph implements cloneable {
    Integer coordinatex;
    Integer coordinatey;
    Logger log=Logger.getLogger("hi");

    Graph(Integer a, Integer b) {
       coordinatex = a;
       coordinatey= b;
    }

    void active() {
        Boolean c = coordinatex.equals(coordinatey);
        log.info(c);
    }
    Graph helo()
    {
        try
        {
            return (Graph) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            log.info("cloned error");
            return this;
        }
    }
}

public class Maths
{
    private static Scanner scan;

	public static void main( String[] args ){
    	scan = new Scanner(System.in);
	Logger log=Logger.getLogger("hi");
        log.info("enter x coordinate");
        Integer a = scan.nextInt();
        log.info("Enter y coordinate");
        Integer b = scan.nextInt();
        Graph s1 = new Graph(a, b);
        Graph s2 = s1.helo();
        s2.active();
    }
}
