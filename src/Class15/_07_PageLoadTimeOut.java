package Class15;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

import static utils.BaseClass.*;

public class _07_PageLoadTimeOut {
    public static void main(String[] args) {
        //setUp("https://exelenter.com");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");// chromedriver.exe
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        Instant startTime = Instant.now();
        System.out.println("startTime:" + startTime);

        try {
            driver.get("https://amozon.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("====>TOO SLOW TO LOAD... ADD MORE TIME<====");
        }
            Instant endTime = Instant.now();
            System.out.println("endTime:" + endTime);

            Duration pageLoadTime = Duration.between(startTime, endTime);
            System.out.println("pageLoadTime: =" + pageLoadTime.toMillis());

            System.out.println(driver.getTitle());
            driver.close();
        }
    }
