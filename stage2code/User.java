import java.util.Scanner;

public class User{
public static void main(String [] args){
  //intializing input scanner
  Scanner input = new Scanner(System.in);
  //creating pbjects
  Account myf = new Account();
  Account myobj = new Stu();
  Account myExct = new Excutive();

//welcoming messsage display
  System.out.println("MERCHANT BANK WELCOMES YOU : ");
  System.out.println("============================================"); 
   //show list for user to select 
     System.out.println("Main Menu");
      System.out.print('\n');
      System.out.println("1. Display All");
      System.out.println("2. Create Account");
      System.out.println("3. Deposit");
      System.out.println("4. Withdraw");
      System.out.println("5. Exit");

   //allow the user to select from the list
      System.out.print("Choose action from the list: ");
      int action = input.nextInt();
      System.out.println("=================================================================");
        if (action ==2) {
        	
        	System.out.println("1. Student");
            System.out.println("2. Excutive");

        	System.out.print("Choose Account type: ");
        	int choose = input.nextInt();
             if (choose ==1) {
             	myobj.createAccount();
             	String regnum = input.nextLine();
             	int    accnum = input.nextInt();
                String accname =input.nextLine();
                String branch = input.nextLine();
                String acctype = input.nextLine();
             }
             else if (choose ==2) {
             	System.out.println("Create excutive account with 2000: ");
             }
             else{
             	System.out.println("wrong pick");
             }
        }
          else if (action == 3) {
         	System.out.println("Enter amount to Deposit: ");
         }
     
         else if (action == 4) {
         	System.out.println("Enter amount to Withdraw");
         }
         else if (action == 5) {
         	System.out.println("loging out , thanks for using our service");
         }
        // display the account types
        
       }  
}
         
        
     
      
     
 