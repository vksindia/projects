import java.util.Scanner;


public class BinarySearch {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int mid;
		
        System.out.print("Enter no. of elements you want in array:");
         int no = s.nextInt();
         
         int start=0,last=no-1;
        int arrays[] = new int[no];
        
        System.out.println("Enter all the elements(In ascending or descending order):");
        
        for(int i = 0; i < no; i++)
     
            arrays[i] = s.nextInt();
    
        
        System.out.println("Enter the element to be search:");
        int search=s.nextInt();
        


 
        while(start<=last)
        {
            int mid=(start+last)/2;
            if(arrays[mid]<search)
            {
            	start=mid+1;
            	
            }
            else if(arrays[mid]==search)
            {
            	System.out.println(search+" is found at loation "+mid);
            	break;
            }
            else
            {
            	last=mid-1;
            }
            
             mid=(start+last)/2;
        }
        if ( start > last ){  
            System.out.println("Element is not found!");  
        }
        s.close();
            
	}

}
