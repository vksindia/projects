package Inheritance_Overriding;

public class Company {
	private int companyId;
	private String companyName;
	private String companyAddress;
	private long contactNo;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
	public Company() {
		super();
	}
	public Company(int companyId, String companyName, String companyAddress,
			long contactNo) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.contactNo = contactNo;
	}
	
	public void companyDetails(int companyId, String companyName, String companyAddress,
			long contactNo)
	
	{
		System.out.println("Company Details is:\n id:"+companyId+"\n"+"Name:"+companyName+"\n"+"Address:"+companyAddress+"\n"+"Contact:"+contactNo);
	}
	

}
