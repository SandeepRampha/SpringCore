package CH.CoreApp;

import java.util.List;
import java.util.Map;

public class Office {
	int oid;
	String oname;
	Employee emp;
	List<String> projects;
	Map<Integer, String> pdate;
	public Office(int oid, String oname, Employee emp, List<String> projects, Map<Integer, String> pdate) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.emp = emp;
		this.projects = projects;
		this.pdate = pdate;
	}
	@Override
	public String toString() {
		return "Office [oid=" + oid + ", oname=" + oname + ", emp=" + emp + ", projects=" + projects + ", pdate="
				+ pdate + "]";
	}
	
	
}
