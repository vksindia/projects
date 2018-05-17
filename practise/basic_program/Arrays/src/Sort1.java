import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Sort1 
{
	 static int temp;
	public static void main(String[] args)
	{
	  Scanner s = new Scanner(System.in);
	  int no;
	  int sortedArray[];
	  List<Integer> list=new ArrayList<Integer>();

	    System.out.println("Enter  the elements:");
	     do
	     {
	    	 no=s.nextInt();	
	    	 list.add(no);	
	     }while(no>0);

		     
		     int[] array = new int[list.size()];
		     for (int i=0; i < array.length; i++)
		     {
		    	 array[i] = list.get(i).intValue();
		     }
		
	     
		  System.out.println("\n Array Before Sorted...");
	        for(int i = 0; i < list.size(); i++)
	        {
	           System.out.print(array[i]+"\t");
	        }
	        
	        sortedArray=sort(array);
	        
	        System.out.println("\n Array After Sorting...");
	         for (int c = 0; c < sortedArray.length; c++)
	      	     System.out.print(sortedArray[c]+"\t");     
	}
	
	
	public static int[] sort(int array[])
	{
		   for (int c = 0; c <  array.length; c++) 
	        {
	  	      for (int d = 1; d < array.length-c  ; d++)
	  	      {
	  	    	 if (array[d-1] > array[d])  
	  	        {
	  	          temp  = array[d-1];
	  	          array[d-1] = array[d];
	  	          array[d] = temp;
	  	        }
	  	      }
	  	    }
	     return array;
     }
}


