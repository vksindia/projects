package RecursiveFun_loop;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class WhileLoopExample 
{
	static char temp ;
	static String reverse="";
	static int cnt=0;
	static char charArray[];
    static int cnt1 ;
	public static void main(String[] args) 
	{
	
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    String name=sc.nextLine();
    
	int flen = name.length();
     cnt1 = flen-1;
    char[] convertArray = name.toCharArray();
    
	  for(int i = 0 ; i < flen/2; i++)
	    {
	    	charArray=swap(convertArray,cnt1,temp,i);
	    	cnt1--;
	    	cnt++;
	    }
  
    
	  for (int i = 0 ; i < charArray.length; i++)
	  {
		  reverse=reverse+charArray[i];
		 
	  }
	  System.out.print("Reverse of  String " + name + " is :" + reverse+ " In " +cnt+ " loops ");
	  
  
	}
	
	public static char[] swap(char[] charArray,int cnt1, char temp,int i)
	{
		       
		    	temp = charArray[i];
		    	charArray[i] = charArray[cnt1];
		    	charArray[cnt1] = temp; 
		    	
		    	return charArray;
		  
			  
	}
	
}


