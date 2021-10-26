package org.encap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hidden {

	public static void main(String[] args) {
		Orginal n1=new Orginal();
		n1.setID(12345);
		n1.setName("Arshath");
		n1.setPercentage(100f);
		
		Orginal n2=new Orginal();
		n2.setID(124566);
		n2.setName("Baranikumar");
		n2.setPercentage(99.99f);
		
		Orginal n3=new Orginal();
		n3.setID(127899);
		n3.setName("Karthik");
		n3.setPercentage(99.98f);
		
		Orginal n4=new Orginal();
		n4.setID(112354);
		n4.setName("Nandakumar");
		n4.setPercentage(99.96f);
		
		List<Orginal> li=new LinkedList<>();
		li.add(n1);
		li.add(n2);
		li.add(n3);
		li.add(n4);
	
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getID());
			System.out.println(li.get(i).getName());
			System.out.println(li.get(i).getPercentage());
			
		}
		for (Orginal q : li) {
			System.out.println(q.getID());
			System.out.println(q.getName());
			System.out.println(q.getPercentage());
			
		}
		System.out.println("  ");
		Set<Orginal>s=new LinkedHashSet<>();
		s.add(n1);
		s.add(n2);
		s.add(n3);
		s.add(n4);
		
		for (Orginal o : s) {
			System.out.println(o.getID());
			System.out.println(o.getName());
			System.out.println(o.getPercentage());
		System.out.println(" ");	
		Map<Integer, Orginal>m=new LinkedHashMap<Integer, Orginal>();
		
		m.put(1,n1);
		m.put(2,n2);
		m.put(3, n3);
		m.put(3, n4);
		
		m.entrySet();
		
		for (Orginal org : s) {
			System.out.println(org.getID());
			System.out.println(org.getName());
			System.out.println(org.getPercentage());
			
		}
		
		
		
		
		
		}
		
		
		
	}
}
