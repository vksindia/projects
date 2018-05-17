import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
	      int no,temp;
	   
		  Scanner s = new Scanner(System.in);
	       System.out.print("Enter no. of elements you want in array:");
	        no = s.nextInt();
	       
	        int arrays[] = new int[no];
	        int sortedArray[] = new int[arrays.length];
	        
	       System.out.println("Enter array Element:");
	         for(int i = 0; i < no; i++)
	        {
	            arrays[i] = s.nextInt();
	            sortedArray[i]=arrays[i];
	        }
	        
	         
	      
	       System.out.println("Array Before Sorted...");
	        for(int i = 0; i < no; i++)
	        {
	           System.out.println(sortedArray[i]);
	        }
	        
	        for (int c = 0; c <  sortedArray.length; c++) 
	        {
	  	      for (int d = 1; d < sortedArray.length-c  ; d++)
	  	      {
	  	        if (sortedArray[d-1] > sortedArray[d])  
	  	        {
	  	          temp       = sortedArray[d-1];
	  	        sortedArray[d-1]   = sortedArray[d];
	  	      sortedArray[d] = temp;
	  	        }
	  	    
	  	      }
	  	  
	  	    }
	        System.out.println("Sorted Array...");
	         for (int c = 0; c < ( no ); c++)
	      	  System.out.println(sortedArray[c]);
	         s.close();
	}
		}
		
