package exceptionhandlingshape;
import java.util.*;
import java.util.logging.*;
class Shap {
    float length;
    float width;
    float radius;
    float length1;
    String type;
    Logger log=Logger.getLogger("hi");
    // triangle
    Shap(String type, float width, float length, float length1) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.length1 = length1;

    }

    // circle
    Shap(String type, float radius) {
        this.type = type;
        this.radius = radius;
    }

    // rectangle
    Shap(String type, float width, float length) {
        this.type = type;
        this.width = width;
        this.length = length;
    }

    void area() {
        // triangle
        if ("TRIANGLe".equalsIgnoreCase(type)) {
            float area = width * length;  
            area = area / 2;
            log.info("area of triangle is" + area);
        }

        // circle
        else if ("Circle".equalsIgnoreCase(type)) {
            float area1 = radius * radius;
            area1 = area1 * 3.14f;
            log.info("area of circle is" + area1);
        }

        // rectangle
        else if ("ReCtangle".equalsIgnoreCase(type)) {
            float area2 = width * length;
            log.info("area of rectangle is" + area2);
        }

    }

    void perimeter() {
        // rectangle
        if ("RectanGle".equalsIgnoreCase(type)) {
            double perimeter1 = 2 * length * width;
            log.info("Perimeter of rectangle is" + perimeter1);
        }

        // circle
        else if ("cirCle".equalsIgnoreCase(type)) {
            double perimeter2 = 2 * 3.14f * radius;
            log.info("Perimeter of circle is" + perimeter2);
        }

        // triangle
        else if ("TRIAnGLE".equalsIgnoreCase(type)) {
            double perimeter3 = width + length + length1;
            log.info("Perimeter of trianlge is" + perimeter3);
        }
    }
}

public class Shape
{
	 private static Scanner scan;
		public static void main( String[] args){
	    	int option;
		Logger log;
	        log=Logger.getLogger("hi");
	        scan = new Scanner(System.in);
	        try{
	        do {
	            log.info("Enter your option 1.Triangle 2.circle 3.Rectangle 4.Exit");
	            option = scan.nextInt();
	            if (option == 1) {
	                log.info("ENTER WIDTH");
	                float width = scan.nextFloat();
	                log.info("Enter length");
	                float length = scan.nextFloat();
	                log.info("Enter length1");
	                float length1 = scan.nextFloat();
	                Shap a = new Shap("TRIANGLE", width, length, length1);
	                a.area();
	                a.perimeter();
	            } else if (option == 2) {
	                log.info("Enter radius");
	                float rad = scan.nextFloat();
	                Shap b = new Shap("circle", rad);
	                b.area();
	                b.perimeter();
	            } else if (option == 3) {
	                log.info("Enter width");
	                float width = scan.nextFloat();
	                log.info("Enter length");
	                float length = scan.nextFloat();
	                Shap c = new Shap("Rectangle", width, length);
	                c.area();
	                c.perimeter();
	            }else if(option==4) {
	            	log.info("Exit Successfully");
	            }
	        } while (option < 4);
	        }
	        catch(InputMismatchException e) {
	        	log.info(String.valueOf(e));
	        	System.exit(0);
	        }
    }
}