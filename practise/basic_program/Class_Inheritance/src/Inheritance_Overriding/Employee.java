package Inheritance_Overriding;

public class Employee extends Company{
	private int empId;
	private String empName;
	private String empAddress;
	private long contactNo;
	private String designation;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, String empAddress,
			long contactNo, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.contactNo = contactNo;
		this.designation = designation;
	}
	
	public void empDetails(int empId, String empName, String empAddress,
			long contactNo, String designation)
	{
	
		System.out.println("Employee Details is:\n id:"+empId+"\n"+"Name:"+empName+"\n"+"Address:"+empAddress+"\n"+"Contact:"+contactNo+"\n"+"Designation:"+designation);
	}
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empAddress=" + empAddress + ", contactNo=" + contactNo
				+ ", designation=" + designation + "]";
	}
	
	

}
