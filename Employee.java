package javaassignment3;

public class Employee {
	private double salary;
	private int nohw;
	
    public void getInfo(double salary,int nohw){
    	 this.salary=salary;
    	 this.nohw=nohw;
     }
    
   public void addSalary() {
	   if(salary<500) {
		   salary+=10;
	   }
   }
   
   public void addWork() {
	   if(nohw>6) {
		   salary+=5;
	   }
   }
   
   
   public void display() {
	   System.out.println("Salary: "+salary+"\n number of hours work per day:"+nohw);
   }
}
