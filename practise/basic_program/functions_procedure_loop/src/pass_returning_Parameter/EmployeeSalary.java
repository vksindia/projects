package pass_returning_Parameter;

public class EmployeeSalary {
	
	double totalSalary,PF,TA,FA,HRA;
	public void calTotalSalary(double income,double PF,double TA,double FA,double HRA)
	{
		totalSalary=income+PF+TA+FA+HRA;
		System.out.println("Total Salary:"+totalSalary);
	}
	
	public double calPF(double income,double pf)
	{
		PF=(income*pf)/100;
		return PF;
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
	public double calHRA(double income,double hra)
	{
		HRA=(income*hra)/100;
		return HRA;
	}
}
