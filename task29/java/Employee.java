package packager.corejava.task29.java;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	public int id;
	public String name;
	public int sal;

	Employee(int id,String name,int sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
	}	


public static  List<Employee> getEmployeeList(){
	List<Employee> s=new ArrayList();
	s.add(new Employee(1,"vamsi",10000));
	s.add(new Employee(2,"ravi",20000));
	s.add(new Employee(3,"balu",30000));
	s.add(new Employee(4,"ravi",40000));
	return s;
}
}