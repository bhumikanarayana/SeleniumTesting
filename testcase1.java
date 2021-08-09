package selenium;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import java.util.*;
import java.io.*;
import java.lang.*;
public class testcase1 {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("\r\n"
        		+ "https://www.thesparksfoundationsingapore.org/");
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          try {
          Thread.sleep(3000);
          }catch(Exception e) {
        	  e.printStackTrace();
          }
          
         // Click on the Search button  
        driver.findElement(By.linkText("Contact Us")).click();     
  
    }  
  
}  
