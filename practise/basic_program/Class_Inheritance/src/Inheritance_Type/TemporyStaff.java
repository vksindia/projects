package Inheritance_Type;

public class TemporyStaff extends Staff{
	protected int days; 
	 protected int hoursWorked; 
	 protected double salPerHours;
	 protected double salary;
	 
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getSalPerHours() {
		return salPerHours;
	}
	public void setSalPerHours(int salPerHours) {
		this.salPerHours = salPerHours;
	}
	
	 public TemporyStaff(String name, String subject, String qualification,
			int id, String deparment, int days, int hoursWorked,
			double salPerHours) {
		super(name, subject, qualification, id, deparment);
		this.days = days;
		this.hoursWorked = hoursWorked;
		this.salPerHours = salPerHours;
	
	}
	public void salary()
	 {
		 display();
		 salary=days*hoursWorked*salPerHours;
		 System.out.println("Salary of tempory Employee:"+salary);
	 }
	 
	    
}
