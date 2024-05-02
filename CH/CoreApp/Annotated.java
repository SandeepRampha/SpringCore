
package CH.CoreApp;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class Annotated {
	@Bean
	public Employee emp1() {
		Employee emp = new Employee();
		 emp.setEmpid(121);
		 emp.setName("Sandeep");
		 return emp;
	}
	@Bean
	public Office off1() {
		List<String> list=new ArrayList<String>();
		list.add("JNTUH- Hacking");
		list.add("Coding HUB Page");
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(19052024, "JNTU-H Hacking");
		map.put(19052024,"Coding HUB Page" );
		return new Office(12,"CHIPL", emp1(),list,map);
	}
	
	@PostConstruct
	public void m1() {
		System.out.println("InIt");
	}
	@PreDestroy
	public void m2() {
		System.out.println("Destroy");
	}
	
}
