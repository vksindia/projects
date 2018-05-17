package RecursiveFun_loop;

public class NestedForLoop {
	public static void main(String[] args) {
		String name="School";
		for(int i=0;i<name.length();i++)
		{
			for(int j=0;j<name.length()-i;j++)
			{
			System.out.print(name.charAt(j));
			}
			System.out.print("\n");
		}
	}

}
