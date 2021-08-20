package com.fb.login;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC007 
	{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindu Priya D\\Downloads\\Softwares\\chromedriver.exe");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	String expected=driver.getCurrentUrl();
	System.out.println(expected);
	String actual="http://www.facebook";
	if(expected.equalsIgnoreCase(actual))
	{
		System.out.println("test case is passed");
	}	
	else
	{
		System.out.println("test case is failed");
	}
	String title=driver.getTitle();
	System.out.println(title);
	String actualtitle="Facebook – log in or sign up";
	if(title.equalsIgnoreCase(actualtitle))
	{
	System.out.println("test case is paased");
	}
	else
	{
		System.out.println("test case is failed");
	}
	driver.close();
	}
	}
