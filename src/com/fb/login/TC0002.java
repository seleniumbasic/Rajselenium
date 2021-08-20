package com.fb.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC0002 
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sindu Priya D\\Downloads\\Softwares\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
			WebElement emailtextbox=driver.findElementById("email");
			emailtextbox.sendKeys("rajsinkru");
			emailtextbox.clear();
			emailtextbox.sendKeys("krubaby");
			WebElement passtextbox=driver.findElementByName("pass");
			passtextbox.sendKeys("iloveyou");
			
			WebElement textbox=driver.findElementByXPath("//input[contains(@id,'email')]");
			textbox.clear();
			textbox.sendKeys("newemailid");
			
			WebElement pass=driver.findElementByXPath("//input[contains(@name,'pass')]");
			pass.clear();
			pass.sendKeys("thisisyou");
			
			WebElement forgotpwdlink=driver.findElementByXPath("//*[contains(text(),'Forgotten password?')]");
			forgotpwdlink.click();
			driver.navigate().back();
						
			WebElement text=driver.findElementByXPath("//input[@type='text']");
			text.clear();
			text.sendKeys("krubabyiscomingsoon");
			
			WebElement passtext=driver.findElementByXPath("//input[@type='password']");
			passtext.sendKeys("jojojokrubaby");
			
		
			WebElement loginbutton=driver.findElementByXPath("//button[contains(@name,'login')]");
			loginbutton.click();
			
			/*System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());*/
			
			/*System.out.println(ActualUrl);
			String ActualTitle=driver.getTitle();
			System.out.println(ActualTitle);
			String ExpectedUrl= "https://www.amazon.in/";*/

			String ActualTitle=driver.getTitle();
			System.out.println(ActualTitle);
			String ExpectedTitle="Facebook-log in or signup";
			System.out.println(ExpectedTitle);
		
				if(ActualTitle.equals(ExpectedTitle))
				{
				System.out.println("test is pass");
				}
				else
				{
				System.out.println("test is failed");
				}
	
}
}
