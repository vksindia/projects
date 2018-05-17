package RecursiveFun_loop;

import java.util.Scanner;

public class ForLoopEx {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no:");
		int num=sc.nextInt();
		int mul;
		for(int i=1;i<=10;i++)
		{
			mul=num*i;
			System.out.println(num+"*"+i+":"+mul);
		}

	}

}
