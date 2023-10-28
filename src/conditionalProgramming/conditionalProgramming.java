package conditionalProgramming;

public class conditionalProgramming {
	
	public static void main(String[] args) {
		
		int balanceAmount=600000;
		int withdrawalAmount=400000;
		
		//1. Only If condition
		
	/*	if(balanceAmount>=withdrawalAmount) {
			
			
			balanceAmount=balanceAmount-withdrawalAmount;
			System.out.println("Balance after deduction:"+balanceAmount);			
	} */
		   
		
		
		//2. Multiple If statement
		
      
           /* if(balanceAmount>=withdrawalAmount) {
			
			
			balanceAmount=balanceAmount-withdrawalAmount;
			System.out.println("Balance after deduction:"+balanceAmount);			
	}
		
		
		
       if(balanceAmount<withdrawalAmount) {
			
			
			System.out.println("Insufficient Balance Amount!!!!!!:");			
	}
		
       if(balanceAmount==withdrawalAmount) {
	
	
	       balanceAmount=0;
	       System.out.println("Balance after deduction:"+balanceAmount);			
    }*/

		// 3. If with else statement

	    /*   if(balanceAmount>=withdrawalAmount) {
	    		
	    		
		       balanceAmount=balanceAmount - withdrawalAmount;
		       System.out.println("Balance after deduction:"+balanceAmount);			
	} else {
		   
		System.out.println("Insufficient balance!!!!!");
	}*/

      
	       
	       
	       
	       // 4. If - else - If
		
	       
	       if(balanceAmount>withdrawalAmount) {
	    		
	    		
		       balanceAmount=balanceAmount - withdrawalAmount;
		       System.out.println("Balance after deduction:"+balanceAmount);	
		       
		       
	}      else if(balanceAmount<withdrawalAmount) {
		
		
	       
	       System.out.println("Insufficient balance!!!!!");		
	       
	       
	       
    }      else if(balanceAmount == withdrawalAmount) {
    	
    	
    	balanceAmount=0;
    	System.out.println("Balance after deduction:"+ balanceAmount);
    }



   }

	
	
	
	
	
	
	
}