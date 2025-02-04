package tutorialpoint_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TPoint_BrowserCommand {
   public static void main(String[] args) throws InterruptedException {

      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();

      // adding implicit wait of 15 secs
     //driver.manage().timeouts().implicitlyWait(15, null);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      // launching a browser and open a  URL
      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
      driver.manage().window().maximize();
      // Getting browser title after launch
      System.out.println("Title: Getting browser title after launch: " + driver.getTitle());

      // Getting browser URL after launch
      System.out.println("URL: Getting URL after launch: " + driver.getCurrentUrl());
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
      
      // identify link then click
      WebElement l = driver.findElement(By.xpath("//*[@id='collapseTwo']/div/ul/li[2]/a"));
      System.out.println(l.getText());
      l.click();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
      
      // Getting browser title after clicking link
      System.out.println("Getting browser title after clicking link: " + driver.getTitle());

      // Getting browser URL after launch
      System.out.println("Getting URL after clicking link: " + driver.getCurrentUrl());

      //drivver.wait(4);
      
      
      // Quitting browser
      driver.quit();
   }
}