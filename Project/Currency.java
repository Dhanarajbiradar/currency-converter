package dhanraj.Project;
import java.util.Scanner;
public class Currency {

	    public static void main(String[] args) {
	    	
	    	System.out.println(":Currences are:");
	        System.out.println("1 Ruppe");
	        System.out.println("2 Dollar");
	        System.out.println("3 Euro");
	        
	        Scanner sc = new Scanner(System.in);
	        System. out.print("Choose the currency: ");
	        int choice = sc.nextInt();
	        System.out.print("Enter the amount: ");
	       
	        double amount = sc.nextDouble();
	        System.out.println();
	     
	        switch (choice) {
	            case 1:
	                Ruppe_to_other(amount);
	                break;
	            case 2:
	                Dollar_to_other(amount);
	                break;
	            case 3:
	                Euro_to_other(amount);
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	    }

	public static void Ruppe_to_other(double amt) {
	    System.out.println("1 Ruppe = " + 0.012 + " Dollar");
	    System.out.println();
	    

	    System.out.println(amt+" Ruppe = " + (amt*0.012) + " Dollar");
	    System.out.println();

	    System.out.println("1 Ruppe = " + 0.011 + " Euro");
	    System.out.println();
	    System.out.println(amt+" Ruppe = " + (amt*0.011) + " Euro");
	    System.out.println();
	    
	 

	}
	    

	public static void Dollar_to_other(double amt) {
	    System.out.println("1 Dollar = " + 82.51 + " Ruppe");
	    System.out.println();
	    System.out.println(amt+" Dollar = " + (amt*82.51) + " Ruppe");
	    System.out.println();

	    System.out.println("1 Dollar= " + 0.94 + " Euro");
	    System.out.println();

	    System.out.println(amt+" Dollar = " + (amt*0.94) + " Euro");
	}

	    

	public static void Euro_to_other(double amt){
	    System.out.println("1 Euro = " + 88.06 + " Ruppe");
	    System.out.println();
	    System.out.println(amt+" Euro = " + (amt*88.06) + " Ruppe");
	    System.out.println();

	    System.out.println("1 Euro = " + 1.07 + " Dollar");
	    System.out.println();

	    System.out.println(amt+" Euro = " + (amt*1.07) + " Dollar");
  }
	
}



