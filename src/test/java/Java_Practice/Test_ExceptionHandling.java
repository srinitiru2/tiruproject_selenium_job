package Java_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test_ExceptionHandling {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		 
		
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmLive.com/");
		
		String WebsiteTitle = driver.getTitle();
		System.out.println(WebsiteTitle);
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		try {
		driver.findElement(By.id("fake")).click();
		}
		catch(NoSuchElementException e){
			System.out.println("Element is not found");
			System.out.println("Hello in the e block");
			
			throw(e); //Optional - add this to just throw the exception inspite of being caught
		}
		//System.out.println("Hello outside e block");
		
		finally{
	        driver.quit();
	    }
		
	}

}
