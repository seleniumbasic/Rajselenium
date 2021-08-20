package com.fb.login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC005 
{
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindu Priya D\\Downloads\\Softwares\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	boolean logo=driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]")).isEnabled();
	
	System.out.println(logo);
	
	boolean emailtxt=driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
	System.out.println(emailtxt);
	boolean pwdtxt=driver.findElement(By.xpath("//input[@id='pass']")).isEnabled();
	System.out.println(pwdtxt);
	boolean loginbtn=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	System.out.println(loginbtn);
	boolean link=driver.findElement(By.xpath("//*[contains(text(),'Forgotten password?')]")).isEnabled();
	System.out.println(link);
	boolean newacc=driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).isEnabled();
	System.out.println(newacc);
	driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]")).click();
	Thread.sleep(5000);
	boolean radio1=driver.findElement(By.xpath("//*[contains(text(),'Female')]/following-sibling::input")).isEnabled();
	System.out.println(radio1);
	boolean radio2=driver.findElement(By.xpath("//*[contains(text(),'Male')]/following-sibling::input")).isEnabled();
	System.out.println(radio2);
	
	boolean radio3=driver.findElement(By.xpath("//*[contains(text(),'Custom')]/following-sibling::input")).isSelected();
	System.out.println(radio3);
	driver.findElement(By.xpath("//*[contains(text(),'Custom')]/following-sibling::input")).click();
	boolean radio3ver=driver.findElement(By.xpath("//*[contains(text(),'Custom')]/following-sibling::input")).isSelected();
	System.out.println(radio3ver);
	Thread.sleep(4000);
	driver.close();
	}
	
}
