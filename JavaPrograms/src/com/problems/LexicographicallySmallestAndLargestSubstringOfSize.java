package com.problems;

/*problem statement: Given a String str and an integer k, 
 * find the lexicographically smallest and largest substring of length k*/

public class LexicographicallySmallestAndLargestSubstringOfSize {
	public static void main(String[] args) {
		String str = "MyNameIsNishantandIamMontyAlso";
		int k = 3;
		getSmallestAndLargest(str, k);
	}

	private static void getSmallestAndLargest(String str, int k) {
		// TODO Auto-generated method stub
		String curr = str.substring(0, k);
		String min = curr;
		String max = curr;
		
		for (int i = k; i < str.length(); i++) {
//			System.out.println("now value of Curr is "+ curr);
//			System.out.println("curr.substring(1,k)"+ curr.substring(1,k));
			curr= curr.substring(1,k) + str.charAt(i);
//          System.out.println("curr now is"+ curr);
			if(max.compareTo(curr)<0)
				max=curr;
			if(min.compareTo(curr)>0)
				min=curr;
		}
		System.out.println("min of given string is"+min);
		System.out.println("max of given String is"+ max);
	}
}
