public class Account{
	//intializing variables
   private String accname;
   private int    accnum;
   private String acctype;
   private String branch;
   private double balance;
   private java.util.Date datecreated;
   private double amount;
  
  
   public Account(){

  }
  //constructor with arguments
  public Account(int accnum, String branch, double balance,String accname,String acctype){

  }
   public void setAccnum(int newAccnum){
   	this.accnum= newAccnum;
   }
   public int getAccnum(){
   	return accnum; 
   }
  public void setAccname(String newAccname){
  	this.accname = newAccname;
  }
  public String getAccname(){
  	return  accname;
  }
  public void SetBranch(String newBranch){
  	this.branch = newBranch;
  }

   public String getBranch(){
   	return branch;
   }

  public void setBalance(double newBalance){
 	this.balance =newBalance;

 }
  public double getBalance(){
 	return balance;

 }
 //constructors
 public void setAmount(double newAmount){
  this.amount = newAmount;
 } 
 public double getAmount(){
  return amount;
 }

   void createAccount(){
    
   }

    void deposit(double amount){
     System.out.print("Enter amount you want to deposit :");
     this.getAmount();
       if (amount != 0) {
      		balance += amount;
      	}	
    }
  void withdraw(double amount) {
  	if (amount != 0) {
  	  balance -= amount;	
  	}
  }

   
   void showAccount(){
    System.out.println(accname + "," + branch + "," + balance + "," + accnum);
   }

  void showMenu(){
  	      
       }
        
}
