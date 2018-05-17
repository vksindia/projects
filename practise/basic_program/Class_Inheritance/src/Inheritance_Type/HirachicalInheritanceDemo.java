package Inheritance_Type;

import java.util.Scanner;

 class Employees  {
	    int age;
	    String name, address, gender;
	    Scanner get = new Scanner(System.in);
	    Employees()
	    {
	        System.out.println("Enter Name of the Employee:");
	        name = get.nextLine();
	        System.out.println("Enter Gender of the Employee:");
	        gender = get.nextLine();
	        System.out.println("Enter Address of the Employee:");
	        address = get.nextLine();
	        System.out.println("Enter Age:");
	        age = get.nextInt();
	    }
	 
	    void display()
	    {
	        System.out.println("Employee Name: "+name);
	        System.out.println("Age: "+age);
	        System.out.println("Gender: "+gender);
	        System.out.println("Address: "+address);
	    }
	}
	 
	class fullTimeEmployees extends Employees
	{
	    float salary;
	    int des;
	    fullTimeEmployees()
	    {
	        System.out.println("Enter Designation:");
	        des = get.nextInt();
	        System.out.println("Enter Salary:");
	        salary = get.nextFloat();
	    }
	    void display()
	    {
	        System.out.println("Full Time Employee Details");
	        super.display();
	        System.out.println("Salary: "+salary);
	        System.out.println("Designation: "+des);
	    }
	}
	 
	class partTimeEmployees extends Employees
	{
	    int workinghrs, rate;
	    partTimeEmployees()
	    {
	        System.out.println("Enter Number of Working Hours:");
	        workinghrs = get.nextInt();
	    }
	    void calculatepay()
	    {
	        rate = 8 * workinghrs;
	    }
	 
	    void display()
	    {
	        System.out.println("Part Time Employee Details");
	        super.display();
	        System.out.println("Number of Working Hours: "+workinghrs);
	        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
	    }
	}
	 
	public class HirachicalInheritanceDemo
	{
	    public static void main(String args[])
	    {
	        System.out.println("Enter Full Time Employee Details");
	        fullTimeEmployees ob1 = new fullTimeEmployees();
	        partTimeEmployees ob = new partTimeEmployees();
	        System.out.println("\n"+"Enter Part Time Employee Details");
	        ob1.display();
	        ob.calculatepay();
	        ob.display();
	    }
	}


