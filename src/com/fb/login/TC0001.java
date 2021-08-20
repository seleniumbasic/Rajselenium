package com.fb.login;

import org.openqa.selenium.chrome.ChromeDriver;

public class TC0001 {
					

					public static void main(String[] args)
					 {
						 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindu Priya D\\Downloads\\Softwares\\chromedriver.exe");
						 ChromeDriver driver=new ChromeDriver();
						 driver.get("http://www.google.com");
						 System.out.println(driver.getTitle());
						 System.out.println(driver.getCurrentUrl());
						 driver.get("http://www.flipkart.com");
						 System.out.println(driver.getTitle());
						 System.out.println(driver.getCurrentUrl());
						 driver.navigate().back();
						 System.out.println(driver.getTitle());
						 System.out.println(driver.getCurrentUrl());
						 driver.navigate().forward();
						 System.out.println(driver.getTitle());
						 System.out.println(driver.getCurrentUrl());
						 driver.navigate().refresh();
						 
					}

}
