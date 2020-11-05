
//class student inheriting from super class Account()

 class Stu extends Account{

 	private String regnum;
 	private int bookb = 200;

 	public Stu(){

 	}
  
    public Stu(String accnum, String branch, double balance,String accname,String acctype,int regnum, int bookb){
    
     }
    
   //setters and getters
  public void setBookb(int newBookb){
  	this.bookb=newBookb;
  }
  public int getBookb(){
  	return bookb;
  }
  public void setRegnum(String newRegnum){
 	this.regnum = newRegnum;
 }
  public String getRegnum(){
  	return regnum;
  }

     
       void withdraw(double amount) {

        if (amount > bookb) {
    	bookb += amount;
    } 
     else if (amount == bookb || amount <=bookb) {
    	System.out.println("Error Insufficient");
    }
    
   }
}
