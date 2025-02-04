package tutorialpoint_practice;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Tpoint_Alrts {
   public static void main(String[] args) throws InterruptedException {
   
      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();
      
      // adding implicit wait of 12 secs
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
      driver.manage().timeouts().getImplicitWaitTimeout();
      // Opening the webpage where we will get alert
      driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
      driver.manage().window().maximize();
      // identify button for clicking to get alert
      WebElement c = driver.findElement(By.xpath("//button[text()='Alert']"));
      c.click();
      
      // switch driver context to alert
      Alert alrt = driver.switchTo().alert();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
      // dismiss alert
      alrt.dismiss();
      
      //again get the alert
      c.click();
      
      // Get alert text
      String s = alrt.getText();
      System.out.println("Alert text is: " + s);
      
      // accept alert
      alrt.accept();
      
      // quitting the browser
      driver.quit();
   }
}