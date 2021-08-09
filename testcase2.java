package selenium;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class testcase2 {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.thesparksfoundationsingapore.org/");  
          
          
         // Click on the Search button  
        driver.findElement(By.linkText("Contact Us")).click();
        try{
        	Thread.sleep(3000);
        	}catch(Exception e){
        	e.printStackTrace();
        	}
        driver.findElement(By.className("col-md-6")).click();
  
    }  
  
}