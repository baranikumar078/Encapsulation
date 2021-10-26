package org.encap;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.setName("Baranikumar");
		d.setPercentage(99.99f);
		d.setPhoneNo(9840221264l);
		
		Demo1 d1=new Demo1();
		d1.setName("Mukesh");
		d1.setPercentage(98.00f);
		d1.setPhoneNo(6897546859l);
		
		Demo1 d2=new Demo1();
		d2.setName("TamilSelvan");
		d2.setPercentage(98.5f);
		d2.setPhoneNo(9856898752l);
		
		List<Demo1> li=new ArrayList<Demo1>();
		
		li.add(d);
		li.add(d1);
		li.add(d2);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getName());
			System.out.println(li.get(i).getPercentage());
			System.out.println(li.get(i).getPhoneNo());
			
			for (Demo1 mm : li) {
				System.out.println(mm.getName());
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
