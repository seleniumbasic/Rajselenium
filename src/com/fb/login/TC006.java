package com.fb.login;

public class TC006 
{
	public static void main(String[] args) 
	{
	String name="raj";
	System.out.println(name);
	System.out.println(name.toUpperCase());
	String pass="CHERRY";
	System.out.println(pass.equalsIgnoreCase("cherry"));
	String trail="kru";
	System.out.println(trail.equals("KRU"));
	System.out.println(pass.replace("Y", "i"));
	System.out.println(pass.toLowerCase());
	System.out.println(pass.length());
	System.out.println(pass + " " + name + " " + trail);
	System.out.println(pass.replaceAll(pass, name));
	}
}
