public class Account{
	//intializing variables
   private String accname;
   private String acctype;
   private String branch;
   private double balance;
   private java.util.Date datecreated;
    int accnum;
  
   public Account(){

  }
  //constructor with arguments
  public Account(String accnum, String branch, double balance,String accname,String acctype){

  }
   public void setAccnum(int newAccnum){
   	this.accnum= newAccnum;
   }
   public int getAccnum(){
   	return accnum = (int)(Math.random() * 10000); 
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
    void deposit(double amount){
      if (amount != 0) {
      		balance += amount;
      	}	
    }
  void withdraw(double amount) {
  	if (amount != 0) {
  	  balance -= amount;	
  	}
  }

  void showMenu(){
  	int ch = '\0';


       
       }
        
}
