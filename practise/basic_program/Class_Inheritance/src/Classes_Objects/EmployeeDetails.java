package Classes_Objects;

public class EmployeeDetails {
	int empId;
	String empName;
	String empAddress;
	long contactNo;
	
	
	public EmployeeDetails() {
		super();
	}
	
	public EmployeeDetails(int empId, String empName, String empAddress,
			long contactNo) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.contactNo = contactNo;
	}
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empName=" + empName
				+ ", empAddress=" + empAddress + ", contactNo=" + contactNo
				+ "]";
	}
	
	

	

	}


