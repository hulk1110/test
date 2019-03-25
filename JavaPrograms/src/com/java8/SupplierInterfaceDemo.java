package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceDemo  {
// supplier doesn't accept any input
	public static void main(String[] args) {
		Supplier<String> supplier = ()-> {
			
			return "Hello from monty";
		};
		System.out.println(supplier.get());
		
		
		List<String> arrayOfString = Arrays.asList("a","b");
		
		System.out.println(arrayOfString.stream().findAny()
		.orElseGet(supplier));
		
		// or we can alternatively write as
		System.out.println(arrayOfString.stream().findAny()
				.orElseGet(()-> "Hello from monty"));
	}
}
