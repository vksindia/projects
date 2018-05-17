package Inheritance_Overriding;

public class SalaryCalclation{

	protected double basicSalary;
	protected double DA;
	protected double HRA;
	protected double PF;
	protected double grossSalary;
	protected double netSalary;
	
	
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDA() {
		return DA;
	}

	public void setDA(double dA) {
		DA = dA;
	}

	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}

	public double getPF() {
		return PF;
	}

	public void setPF(double pF) {
		PF = pF;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double calDA(double income,double da)
	{
		DA=(income*da)/100;
		return DA;
	}
	
	public double calHRA(double income,double hra)
	{
		HRA=(income*hra)/100;
		return HRA;
	}
	
	
	public SalaryCalclation(double basicSalary, double dA, double hRA,
			double pF) {
		super();
		this.basicSalary = basicSalary;
		DA = dA;
		HRA = hRA;
		PF = pF;
	
	}

	public void grossSalary()
	{
		System.out.println(DA);
		grossSalary=basicSalary+DA+HRA;
		System.out.println("Gross Salary:"+grossSalary);
	}
	
	public double calPF(double income,double pf)
	{
		PF=(income*pf)/100;
		return PF;
	}
	
	public void netSalary()
	{
		netSalary=grossSalary-PF;
		System.out.println("Net Salary:"+netSalary);
	}

}
