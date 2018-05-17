package String_function;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name="Poonam";
		
		System.out.println("Length of String:" + name + ": is " +name.length());   
		
		System.out.println(name.toUpperCase()); 
		System.out.println(name.toLowerCase());
		
		System.out.println(name.startsWith("poo"));
		System.out.println(name.endsWith("o"));
		
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(5));
		
		
		//String str="Kava is a prbgramming language.";    
	    
		System.out.println("Enter String");
		String userInput  = sc.nextLine();
	 
		String  str = userInput;
		
		System.out.println(str.replace('b', 'o'));
		String replaceString=str.replaceAll("Kava","Java");   
		System.out.println(replaceString);  
		
		String line="java is platform independent language";
		System.out.println(str.concat(line));
		System.out.println(line.indexOf("platform"));
		System.out.println(line.lastIndexOf("language"));
		System.out.println("Char Array:");
		char[] charArray=line.toCharArray();  
		for(int i=0;i<charArray.length;i++){  
		System.out.println(charArray[i]);  
		}  
		
		String name2="javatpoint";  
		System.out.println(name2.substring(2,6));
		System.out.println(name2.substring(2));
	 
		System.out.println("Byte Array:");
		byte byteArray[]=name2.getBytes();
		for(int i=0;i<byteArray.length;i++)
		{
			System.out.println(byteArray[i]);
		}
		
		String name3="javatpoint";
		System.out.println(name3.equals(name2));
		System.out.println(name2.equals(name));
	//System.out.println(name3.contains('a','s'));

		
		System.out.println(str.compareTo(line));
		System.out.println(name2.compareTo(name3));
		System.out.println(line.compareTo(str));
		
		String name4="         pooja      ";
		System.out.println(name4.trim());
		
		
	
		
		
	}

}
