package scope_of_variable;

public class VariableScope {
	static int s = 343; // static variable (scope:in class & outside of class)
	
	int id; // instance variable (scope:in class & outside of class)
	String name;
	String address;
	
	public VariableScope(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void doStuff(int num) 
	{ 
		int y = 0;               //local variable scope only within method
		for(int z = 0; z < 4; z++)
		{
	         y = z + num; 
		} 
		System.out.println(y);
	}

	public String toString() {
		return " [id=" + id + ", name=" + name + ", address="
				+ address + "]";
	}
	
}
