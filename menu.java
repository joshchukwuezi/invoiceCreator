import java.util.Scanner;

public class menu {

public menu()
{
	Scanner scan = new Scanner (System.in);
	String option;
	
	System.out.println("Select option");
	System.out.println("1. Create Invoice");
	System.out.println("2. Search for Invoice");
	System.out.println("3. Create PDF");
	option = scan.nextLine();
	
	if (option.equals("1"))
	{
		
	}
	
	if (option.equals("2"))
	{
		
	}
	
	if (option.equals("3"))
	{
		
	}
	
 if (!(option.equals("1") || option.equals("2") || option.equals("3")))
 {
	 System.out.print("ERROR, Enter one of the options from the menu");
 }


}

	public static void main(String[] args) {
		new menu();
	}

}
