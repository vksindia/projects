package Inheritance_Type;

public class Staff extends Techer{
	protected int id;
	protected String deparment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	
	
	public Staff(String name, String subject, String qualification, int id,
			String deparment) {
		super(name, subject, qualification);
		this.id = id;
		this.deparment = deparment;
	}
	public void display()
	{
		super.display();
		System.out.println("Staff Id:"+id);
		System.out.println("Staff Department:"+deparment);
	}

}
