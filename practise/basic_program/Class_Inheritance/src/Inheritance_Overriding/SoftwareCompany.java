package Inheritance_Overriding;

public class SoftwareCompany extends SalaryCalclation {
	
	protected double TA;
	protected double FA;
	protected double grossSalary;
public double getTA() {
	return TA;
}
public void setTA(double tA) {
	TA = tA;
}
public double getFA() {
	return FA;
}
public void setFA(double fA) {
	FA = fA;
}
public double getGrossSalary() {
	return grossSalary;
}
public void setGrossSalary(double grossSalary) {
	this.grossSalary = grossSalary;
}

public double calTA(double income,double ta)
{
	TA=(income*ta)/100;
	return TA;
}

public double calFA(double income,double fa)
{
	FA=(income*fa)/100;
	return FA;
}
public SoftwareCompany(double basicSalary, double dA, double hRA, double pF,
		double tA, double fA) {
	super(basicSalary, dA, hRA, pF);
	TA = tA;
	FA = fA;
}
public void grossSalary()
{
	grossSalary=basicSalary+DA+HRA+FA+TA;
	System.out.println("Gross Salary:"+grossSalary);
}
}
