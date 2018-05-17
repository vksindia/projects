import java.util.Scanner;


public class SelectionSort {
	 public static void main(String a[]){ 
		 Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	         int no = s.nextInt();
	         
	        int arrays[] = new int[no];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < no; i++)
	        {
	            arrays[i] = s.nextInt();
	        }
	        
	        System.out.println("Array Before Sorted...");
	        for(int i = 0; i < no; i++)
	        {
	           System.out.println(arrays[i]);
	        }
		 
		 for (int i = 0; i < arrays.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arrays.length; j++){  
	                if (arrays[j] < arrays[index]){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            int smallerNumber = arrays[index];   
	            arrays[index] = arrays[i];  
	            arrays[i] = smallerNumber;  
	        }  
		 
	        System.out.println("Sorted Array...");
	         for (int c = 0; c < ( no ); c++)
	      	  System.out.println(arrays[c]);
	         s.close();
	}  

}
