package SeleniumDers02.C001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C002 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");// windoows users add.exe
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        // we are maximizing the webpage
        String title=driver.getTitle();
        System.out.println("title = " + title);
        driver.close();

    }
}
