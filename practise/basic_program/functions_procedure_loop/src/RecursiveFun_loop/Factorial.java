package RecursiveFun_loop;

public class Factorial {
	
             static int calFactorial(int n){      
		          if (n == 1)      
		            return 1;      
		          else      
		            return(n * calFactorial(n-1));      
		    }      
		  
		public static void main(String[] args) {  
		System.out.println("Factorial of 10 is: "+calFactorial(5));  
		}  
	
	}


