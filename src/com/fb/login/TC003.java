package com.fb.login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003
{
	public static void main(String[] args) throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindu Priya D\\Downloads\\Softwares\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("myfirsttestcase");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("needtoexecute");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(6000);
	driver.navigate().back();
	driver.findElement(By.xpath("//input[@name='email']")).clear();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("checkingthestring");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(5000);
	String page=driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).getText();
	System.out.println(page);
	String pagename=driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]/following-sibling::div")).getText();
	System.out.println(pagename);
	driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]/../preceding-sibling::img")).click();
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("thisiskrubaby");
	String attribute=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("placeholder");
	System.out.println(attribute);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("hitmommy");
	String surname=driver.findElement(By.xpath("//input[@name='lastname']")).getAttribute("type");
	System.out.println(surname);
	}
}
