package Inheritance_Type;

public class Techer {
	protected String name;
	protected String Subject;
	protected String qualification;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public Techer(String name, String subject, String qualification) {
		super();
		this.name = name;
		Subject = subject;
		this.qualification = qualification;
	}
	
	public void display()
	{
		System.out.println("Name of Techer:"+name);
		System.out.println("Name of subject for tech:"+Subject);
		System.out.println("Techer Qualification:"+qualification);
	}
	
	
	
	

}
