import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Forfacebook {

    @Test

    public void openChromeBrowser() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

            WebDriver wd = new ChromeDriver();

            wd.get("http://www.facebook.com");
            wd.manage().window().maximize();
            wd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("lfcbishal");
            wd.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("memorypower");
            wd.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();

            Thread.sleep(6000);

        }
    }



