import java.util.Scanner;

public class User{
public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  Account Stu = new Stu();
  Account Excutive = new Excutive();
  

  System.out.println("MERCHANT BANK WELCOMES YOU : ");
  System.out.println("============================================"); 
      System.out.println("Main Menu");
      System.out.print('\n');
      System.out.println("1. Display All");
      System.out.println("2. Create Account");
      System.out.println("3. Deposit");
      System.out.println("4. Withdraw");
      System.out.println("5. Exit");

        do  {

              System.out.println("Ur Choice :");
                 int ch = input.nextInt();
       

                    switch (ch) {
                    case 1:
                       Account.getShowAccount();
                       System.out.print("Enter your account number:");
                       this.getAccnum = input.nextInt();
                       System.out.print("Enter your account name: ");
                       this.getAccname= input.nextLine();
                       System.out.print("Write the branch:");
                       this.getBranch= input.nextLine();

                      System.out.print("Enter your Account number:");
                       this.getAcctype= input.nextLine();

                        Stu.getShowAccount();
                       Excutive.getShowAccount();
 
                        break;

        
                     case 2:
                         
                        System.out.println("===============================================================");
                        System.out.println("Choose Account type you want to Create : ");
                        
                        System.out.println("1. Student");
                        System.out.println("2.Excutive");

                         if () {
                           
                         }

                        
                      break; 

                    case 2:

    
}
}
}

     

      
     
  