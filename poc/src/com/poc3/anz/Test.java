package com.poc3.anz;

public class Test {
	public static void main(String[] args) {
		PathProcessUtils utility = new PathProcessUtils();
		ProcessPath path1 = utility.createPojoforPath("PATH-A");
		path1.display();
		ProcessPath path2 = utility.createPojoforPath("PATHB");

		path2.display();
		ProcessPath path3 = utility.createPojoforPath("PATHC");
		path3.display();
		
		
		ProcessPath path4 = utility.createPojoforPath("PATHD");
		path4.display();
	}
}