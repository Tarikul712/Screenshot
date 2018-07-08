package sample;

import java.util.Scanner;

/*public class PrimeNo {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		while(true) {
	        int c =0;
	        System.out.println("enter any no ");
	        int n= scan.nextInt();
	        for(int i=1;i<=n;i++){
	        	if(n%i==0){
	        	c++;
	        	}
	        }
	        	if(c==2){

	        	System.out.println(n+" is prime no");
	        	}else{
	        	System.out.println(n+" is not a prime no");
	        	}
	        }
	        
	   }
}
*/




public class PrimeNo {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
        int c ,i;
        System.out.println("enter any no ");
        int n= scan.nextInt();
        for(i=2;i<=n;i++){
        	
        		c=0;       /* Check whether i is prime or not */
        
        for(int j=2;j<=i/2;j++){
                                   /* Check If any number between 2 to i/2 divides I 
                                   completely If yes the i cannot be prime number */
        	if(i%j==0){
        		c=1;   		//3.**963.        }
        }
        	 if(c==0 && n!=1){
             	System.out.print(i+ "   ");
       
        }
        
        }
        }
	}
}


        