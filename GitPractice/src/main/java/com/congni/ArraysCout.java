package com.congni;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArraysCout {
	
	public static void main(String[] args) {
			
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Optional number = list.stream().findFirst();
		
		System.out.println(number);
		
		long num = list.stream().count();
		
		System.out.println(num);
		
		list.stream().filter(i->i>1).forEach(System.out::println);
		
	}

}
