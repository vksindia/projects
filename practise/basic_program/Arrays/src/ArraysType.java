import java.util.Scanner;


public class ArraysType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("single Dimension array");
		System.out.println("Enter no:");
		int arrays[]=new int[5];   //single Dimension array
		for(int i=0;i<5;i++)
		{
			
			arrays[i]=sc.nextInt();
		}
		int minNum=arrays[0];
		for(int i=0;i<arrays.length;i++)
		{
			if(minNum>arrays[i])
			{
				minNum=arrays[i];
			}	
		}
		System.out.println("Minimum no:"+minNum);
		
		System.out.println("two Dimension array");
		int arrays1[][]={{4,2},{3,6}};   //two Dimension array
		int arrays2[][]={{4,2},{3,6}};
		int sum[][]=new int[2][2];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				sum[i][j]=arrays1[i][j]+arrays2[i][j];
				System.out.println("Sum of two diamension array:"+sum[i][j]);
			}
		//	System.out.println();
		}
		sc.close();
	}

}
