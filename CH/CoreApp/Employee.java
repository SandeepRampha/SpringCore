package CH.CoreApp;

public class Employee {
	int empid;
	String name;
	public void one() {
		System.out.println("I'm InIt");
	}
	
	public void two() {
		System.out.println("I'm Destroy");
	}
	
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
}
