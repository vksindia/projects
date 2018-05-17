package pass_returning_Parameter;

import java.util.Scanner;

public class AutomobileCompany {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeSalary empSalary=new EmployeeSalary();
		
		System.out.println("Enter Income of employee:");
		double salary=sc.nextDouble();
		
		System.out.println("Enter basic PF of employee:");
		double pf=sc.nextDouble();
		
		System.out.println("Enter basic TA of employee:");
		double ta=sc.nextDouble();
		
		System.out.println("Enter basic FA of employee:");
		double fa=sc.nextDouble();
		
		System.out.println("Enter basic HRA of employee:");
		double hra=sc.nextDouble();
		 empSalary.calTotalSalary(salary,empSalary.calPF(salary,pf),empSalary.calTA(salary,ta),empSalary.calFA(salary,fa),empSalary.calHRA(salary,hra));
	}

}
