package javaassignment3;

public class TestBank {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		sbi.add("tejas","Shrirampur","7888166172",100000.12f);
		sbi.add("A","Shrirampur","7888166172",89078.12f);
		sbi.add("B","Shrirampur","7888166172",67967f);
		sbi.add("C","Shrirampur","7888166172",42456f);
		sbi.add("D","Shrirampur","7888166172",53536f);
		sbi.add("E","Shrirampur","7888166172",12323f);
		sbi.add("F","Shrirampur","7888166172",97532f);
		sbi.add("F","Shrirampur","7888166172",76355f);
		sbi.add("F","Shrirampur","7888166172",76355f);
		//sbi.add("F","Shrirampur","7888166172",76355f);
        sbi.add("yash","Shrirampur","7856562651",993465.12f);
        sbi.display("yash");
        sbi.delete(333823);
        sbi.diplayall();
        sbi.witdraw(333822, 200000);
        sbi.deposit(333822, 200000);
        sbi.display("tejas");
	}

}
