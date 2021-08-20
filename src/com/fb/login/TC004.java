package com.fb.login;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC004
{
public static void main(String[] args) 
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindu Priya D\\Downloads\\Softwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhagyaraj");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).clear();


		//driver.close();
		
		
		}
}
