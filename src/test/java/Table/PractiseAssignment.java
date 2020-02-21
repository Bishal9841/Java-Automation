package Table;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseAssignment {
     WebDriver = new ChromeDriver();

     @Test
    public void first() throws InterruptedException{
         System.setProperty("driver.chromedriver","chromeDriver.exe");
         driver=new ChromeDriver();
         driver.get("https://www.toolsqa.com/automation-practice-form/");
         driver.manage().window().maximize();
     }

     @Test
    public void second() throws InterruptedException{
         driver.findElement(By.linkText("Partial Link Test")).isDisplayed();
         Assert.assertTrue(driver.findElement(By.linkText("Partial link Test")).isDisplayed());
         System.out.println("Partial link test Exists");

         @Test
                 public void linkTest() throws InterruptedException{
             WebElement text = driver.findElement(By.xpath())
         }

     }
}
