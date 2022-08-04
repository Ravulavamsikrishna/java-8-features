package packager.corejava.task28.java;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> q=new ArrayList();
		q.add(34);
		q.add(54);
		q.add(78);
		q.add(90);
		q.add(89);
		q.forEach(a->{
			System.out.println(a);

		});
	ArrayList<Integer> w=	(ArrayList<Integer>) q.stream().collect(Collectors.toList());
	System.out.println(w);
	}
	}
