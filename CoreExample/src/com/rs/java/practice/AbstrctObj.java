package com.rs.java.practice;

public abstract class AbstrctObj {
	public void name() // concrete (non-abstract) method
	{
		System.out.println("Name is Jyostna");
	}

	public void marks() // concrete (non-abstract) method
	{
		System.out.println("Marks scored are 80");
	}

	public static void main(String args[]) {
		AbstrctObj s1 = new AbstrctObj(); // Error raised, see the errror in screenshot
	}
}
