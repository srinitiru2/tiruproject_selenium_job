package com.sdet;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectMultipleDropdowns {
   public static void main(String[] args) throws InterruptedException {

      // Initiate the Webdriver
	 
       WebDriver driver = new ChromeDriver();

      // adding implicit wait of 15 secs
     // driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       
       

      // Opening the webpage where we will get dropdown
      driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");

      // identify multiple dropdown
      WebElement dropdown = driver.findElement
        (By.xpath("//*[@id='demo-multiple-select']"));
     
      
      WebElement arrow =  driver.findElement(By.xpath("//*[@id=\"mbsc-control-0\"]/div/label/span[2]/span[1]"));
      arrow.click();
      
      
    
      System.out.println("Options arexxxxx: " +   dropdown.getText());
      // object of Select class
      Select select = new Select(dropdown);
    
   
      
      // gets options of dropdown in list
      List<WebElement> options = select.getOptions();
      
      System.out.println("Options size is: " +options.size());
      System.out.println("The first Options is: " + options.getFirst());
      
      
      for (WebElement opt : options){
         System.out.println("Options are: " + opt.getText());
      }

      // return true if multi-select dropdown
      Boolean b = select.isMultiple();
      System.out.println("Boolean value for multiple dropdown: "+ b);

      // select item by value
      select.selectByValue("3");

      // select item by index
      select.selectByIndex(7);

      // get all selected options of dropdown in list
      List<WebElement> selectedOptions = select.getAllSelectedOptions();
      for (WebElement opt : selectedOptions){
         System.out.println("Selected Options are: " + opt.getText());
      }

      // get first selected option in dropdown
      WebElement f = select.getFirstSelectedOption();
      System.out.println("First selected option is: "+ f.getText());

      // deselect option by index
      select.deselectByIndex(7);
      
      //WebDriverWait wait = new WebDriverWait(driver, 30);
      
     //driver.wait()
      
      // deselect all selected items
      select.deselectAll();

      // get all selected options of dropdown after deselected
      List<WebElement> delectedOptions = select.getAllSelectedOptions();
      System.out.println("No. options selected: " + delectedOptions.size());

      // Closing browser
      driver.quit();
   }
}
