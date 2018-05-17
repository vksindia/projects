package Variable_Datatype;

public class VariableTypes {
         
	int num1, num2;       //instance variable
    static String name="Addtion is";     //static or class variable
        
    public int addition(int n1,int n2) 
    {
        	  int sum =0;         //local variable
        	  sum = n1 + n2 ;
        	  return sum;
    }
          
    
    public static void main(String args[])
    {
        	  VariableTypes type = new VariableTypes();
        	  System.out.println(VariableTypes.name+":"+  type.addition(10, 20));
    }
}

