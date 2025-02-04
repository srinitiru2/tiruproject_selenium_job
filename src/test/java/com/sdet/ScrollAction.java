package com.sdet;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
public class ScrollAction{
   public static void main(String[] args) throws InterruptedException {
      WebDriver driver = new FirefoxDriver();
   
     Thread.sleep(3000);
      //launch application
      driver.get
      ("https://www.tutorialspoint.com/about/about_careers.htm ");
      // identify element
      WebElement n=driver.findElement(By.xpath("//*[text()='Contact']"));
      // Javascript executor
      ((JavascriptExecutor)driver)
      .executeScript("arguments[0].scrollIntoView(true);", n);
   }
}
