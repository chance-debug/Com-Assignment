
//class student inheriting from super class Account()

 class Stu extends Account{

 	private String regnum;
 	private int bookb = 200;

 	public Stu(){

 	}
  
    public Stu(String accnum, String branch, double balance,String accname,String acctype,int regnum, int bookb){
    
     }
    
   //setters and getters
  public void setRegnum(String newRegnum){
 	this.regnum = newRegnum;
 }
  public String getRegnum(){
  	return regnum;
  }
   public void setBookb(int newBookb){
    this.bookb=newBookb;
  }
  public int getBookb(){
    return bookb;
  }
 

    void deposit(double amount){
        } 
    
      void createAccount(){
        System.out.print("Enter your regnum  :");
        System.out.print("enter your account number: ");
        System.out.print("enter your Account name: ");
        System.out.print("Enter bank branch: ");
   
  }  

       void withdraw(double amount) {
      
       }   
    
    
    
    
   }

