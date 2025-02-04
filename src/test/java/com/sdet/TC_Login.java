package com.sdet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Login {
	@Test
	public void Login_Test() {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmLive.com/");
		
		String WebsiteTitle = driver.getTitle();
		System.out.println(WebsiteTitle);
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.close();
		
		
		
		
	}
	
	
	

}
