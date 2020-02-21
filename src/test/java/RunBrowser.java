
    import org.junit.FixMethodOrder;
    import org.junit.Test;
    import org.junit.runners.MethodSorters;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.firefox.FirefoxDriver;
    import org.openqa.selenium.ie.InternetExplorerDriver;

    import java.util.List;
    import java.util.Set;

    public class RunBrowser {

        @Test
        public void openChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

            WebDriver wd= new ChromeDriver();

            wd.get("http://www.gmail.com");

            wd.manage().window().maximize();

            wd.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("bhandaribishal64@gmail.com");

            wd.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();

            Thread.sleep(3000);

            wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("memorypower1");

            wd.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

            Thread.sleep(3000);

            wd.quit();


        }
    }


