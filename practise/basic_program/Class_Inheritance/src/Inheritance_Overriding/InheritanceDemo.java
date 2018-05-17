package Inheritance_Overriding;

import java.util.Scanner;

public class InheritanceDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter Company Details(id,name,address,contact_no):");
		int id=sc.nextInt();
		String name=sc.next();
		String address=sc.next();
		long contact=sc.nextLong();
		emp.companyDetails(id, name, address, contact);
		
		System.out.println("Enter employee Information(id,name,address,contact_no,designation):");
		int eId=sc.nextInt();
		String eName=sc.next();
		String eAddress=sc.next();
		long eContact=sc.nextLong();
		String eDesignation=sc.next();
		
		emp.empDetails(eId, eName, eAddress, eContact, eDesignation);
		
		sc.close();
		
	}

}
