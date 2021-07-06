package fileOption;
import java.util.Scanner;

public class FileManagement {
	
public static int Filemenu(){
		
		// TODO Auto-generated method stub
Scanner in= new Scanner(System.in);
System.out.println("               *****************LockedMe.com ******************************" );
System.err.println("                 *******************FILE OPTION MENU***********************");
System.out.println("****************************************************************************");
System.out.println("1. Creating_New_Files");
System.out.println("2. write_in_File");
System.out.println("3.Read_File");
System.out.println("4. FileInformation");
System.out.println("5. Delete_file");
System.out.println("0.Exit(back to main Menu)");
System.out.println("Enter your File option Menu");


System.out.println();

//Get user's choice
int choice=in.nextInt();


//Display the Title of the Chosen module

switch(choice) {
case 1:
	System.out.println(" Creating file:");
	creatingfiles  cf= new creatingfiles ();
	cf.create();
	break;
	
	
case 2:
	System.out.println(" write a file:");
	writeFile wf= new writeFile ();
	wf.write();
	break;

case 3:
	
	System.out.println(" read a file:");
ReadFile re= new  ReadFile();
re.Read();
break;

case 4:
	System.out.println(" File Information:");
	 Fileinformation fi= new  Fileinformation ();
	fi.fileinfo();
	break; 

	
case 5:
	System.out.println(" Delete a File:");
	DeleteFile df= new DeleteFile();
	df.Delete();
	break;
	
case 0:
	Filemenu();
	default:
		System.out.println("Invalid choice");
}
return choice;




	}

}
