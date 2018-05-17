package Inheritance_Overriding;

import java.util.Scanner;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter basic salary:");
		int salary=sc.nextInt();
		
		System.out.println("Enter basic PF of employee:");
		double pf=sc.nextDouble();
		
		System.out.println("Enter basic TA of employee:");
		double ta=sc.nextDouble();
		
		System.out.println("Enter basic FA of employee:");
		double fa=sc.nextDouble();
		
		System.out.println("Enter basic HRA of employee:");
		double hra=sc.nextDouble();
		
		System.out.println("Enter basic FA of employee:");
		double da=sc.nextDouble();
		
		SoftwareCompany company=new SoftwareCompany(salary,pf,ta,fa,hra,da);
		company.grossSalary();
		company.netSalary();
		

	}

}
