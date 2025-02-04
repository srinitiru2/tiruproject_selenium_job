package com.sdet;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
public class ScrollUpDownActions{
   public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new FirefoxDriver();

      //Thread.sleep(3000); 
     
      //URL launch
      driver.get("https://www.tutorialspoint.com/index.htm");
      driver.manage().window().maximize();
      
      // object of Actions class to scroll up and down
      Actions at = new Actions(driver);
      
      at.sendKeys(Keys.PAGE_DOWN).build().perform(); 
      //identify element on scroll down
      WebElement l = driver.findElement(By.xpath("/html/body/main/section[3]/div[3]/div[1]/h3[1]/button"));
      String strn = l.getText();
      System.out.println("Text obtained by scrolling down is :"+strn);
      
      
      at.sendKeys(Keys.PAGE_UP).build().perform();
      //identify element on scroll up
      WebElement m = driver.findElement(By.tagName("h4"));
      String s = m.getText();
      System.out.println("Text obtained by scrolling up is :"+s);
     
      driver.quit();
   }
}