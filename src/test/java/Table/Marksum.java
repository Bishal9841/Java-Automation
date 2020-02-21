
package Table;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Marksum {

    WebDriver wd;

    @Before
    public void table() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        wd = new ChromeDriver();

        wd.get("http://www.w3schools.com/sql/sql_count_avg_sum.asp");
        Thread.sleep(2000);


    }

    @Test
    public void openChromeBrowser() throws InterruptedException {

        double sum = 0.00; //sum: 90.35
        double expectedSum = 91.35; //expected sum: 91.35


        List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"main\"]/div[6]/table/tbody/tr/td[6]"));
        for (WebElement row : rows) {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;

        }
        System.out.println(sum);
    }

    //delta is the 2 decimal place value

    @After
    public void exit() {
        wd.quit();
    }
}


