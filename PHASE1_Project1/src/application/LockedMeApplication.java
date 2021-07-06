package application;

import Showallfile.*;
import fileOption.*;
import java.util.Scanner;





public class LockedMeApplication {

	public static int mainmenu() {
		// TODO Auto-generated method stub
		//Display the menu
		Scanner in= new Scanner(System.in);

System.out.println("**************************************************************************************************************");
//System.out.println("                              *");
System.err.println("            ******************* LockedMe.com **************         Developed by:Tejashri Jadhav"); 
System.err.println("                                                                    EmailId:tejashrijadhav3128");
System.out.println(" ************************************************************************************************************"); 
System.out.println();
System.out.println("               **************LockedMe Application ****************                       ");
System.out.println("*************************************************************************************************************");
System.out.println(" 1.show all files present in Directory");
System.out.println(" 2.File Option Menu");
System.out.println(" 3.Exit(Back to Main Menu)");


System.out.println();
System.out.println(" **********Please Enter your choice:");


//get user choice

int choice = in.nextInt();

//Display the title of the chosen  module
switch (choice)
{
case 1:
	ShowallFiles sf=new ShowallFiles();
	sf.Show();
	break;
	
case 2:
	FileManagement fn=new FileManagement();
	fn.Filemenu();
	break;
	
case 3:
	mainmenu();
	break;
default:
		System.err.println("Invalid option");
}
return choice;
	}
public static void main(String[] args) {
	int user;
	user=mainmenu();
}}
	
	
	




                




		
	


