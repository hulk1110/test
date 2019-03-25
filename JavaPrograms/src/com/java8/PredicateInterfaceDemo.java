package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> {
			if (t % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};

		// we can alternativerly write as below
		Predicate<Integer> predicate2 = t->t%2==0;
		System.out.println(predicate.test(3));
		System.out.println(predicate2.test(4));
		
		
		List<Integer> arrayOfNo = Arrays.asList(1,11,22,43,20,48,50);
		arrayOfNo.stream().filter(p->p%2==0).forEach(consumer->System.out.println(consumer));
	}
}
