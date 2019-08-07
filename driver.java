import java.util.ArrayList;
import java.util.Scanner;

public class driver {
ArrayList<invoice> list;	
Scanner scan = new Scanner (System.in);
 
public driver()
{
	list = new ArrayList <invoice> ();
}

public void enterDetails()
{
	String address, date, matter, type,
	firstName, surname;  
	
	double professionalFee, vat;
	
	System.out.println("Enter address");
	address = scan.nextLine();
	
	System.out.println("Enter date");
	date = scan.nextLine();
	
	System.out.println("Enter matter");
	matter = scan.nextLine();
	
	System.out.println("Enter first name");
	firstName = scan.nextLine();
	
	System.out.println("Enter surname");
	surname = scan.nextLine();
	
	System.out.println("Enter professional fee");
	professionalFee = scan.nextDouble();
	
	scan.nextLine();
	
	invoice.setVat();
	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void main(String[] args) {
		new driver();	

	}

}
