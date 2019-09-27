package com.rs.java.practice;

	abstract class Student
	{
	  public void name()              // concrete (non-abstract) method
	  {
	    System.out.println("Name is Jyostna");
	  }
	  public void marks()             // concrete (non-abstract) method
	  {
	    System.out.println("Marks scored are 80");
	  }
	  public static void main(String args[])
	  {
	    Student s1 = new Student();   // Error raised, see the errror in screenshot
	  }
	}

}
