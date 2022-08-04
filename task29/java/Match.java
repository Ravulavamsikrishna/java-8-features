package packager.corejava.task29.java;

import java.util.List;
import java.util.function.Predicate;

public class Match {

	  public static void main(String[] args) {
		     Predicate<Employee> p1 = e -> e.id < 3 && e.name.startsWith("v");
		     Predicate<Employee> p2 = e -> e.sal < 20000;
		     List<Employee> list = Employee.getEmployeeList();
		     
		     boolean b1 = list.stream().allMatch(p1);
		     System.out.println(b1);
		     boolean b2 = list.stream().allMatch(p2);
		     System.out.println(b2);
		     
		     boolean b3 = list.stream().anyMatch(p1);
		     System.out.println(b3);
		     boolean b4 = list.stream().anyMatch(p2);
		     System.out.println(b4);
		     boolean b5 = list.stream().noneMatch(p1);
		     System.out.println(b5);
}
}