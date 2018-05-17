package Inheritance_Type;

import java.util.Scanner;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Entern techer name");
	String name=sc.next();
	
	System.out.println("Enter Subject name");
	String subject=sc.next();
	
	System.out.println("Enter qualification");
	String qualification=sc.next();
	
	System.out.println("Enter staff id");
	int id=sc.nextInt();
	
	System.out.println("Enter department name");
	String department=sc.next();
	
	System.out.println("Enter Working day");
	int day=sc.nextInt();
	
	System.out.println("Enter Working hours");
	int hours=sc.nextInt();
	
	System.out.println("Enter salary per hours");
	double salPerHours=sc.nextInt();
	
	TemporyStaff tStaff=new TemporyStaff(name, subject, qualification, id, department, day, hours, salPerHours);
	tStaff.salary();	
	}

}
