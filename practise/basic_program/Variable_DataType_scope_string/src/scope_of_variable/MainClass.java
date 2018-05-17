package scope_of_variable;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VariableScope scope=new VariableScope(101,"poonam","thane");
		System.out.println(scope);
         scope.doStuff(10);
         System.out.println(VariableScope.s);
	}

}
