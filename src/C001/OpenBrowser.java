package C001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        // 1. Establish a connection with the driver(s)
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // Windows users add .exe at the end ("drivers/chromedriver.exe")
        // 2. Open the browser using the Chromedriver's class constructor
        WebDriver driver = new ChromeDriver(); // <--- This will launch the browser (empty, no links) for us.

        // Navigate to a website
        driver.get("https://google.com");

        // Retrieve the title of the current website and store it in a String
        String title = driver.getTitle();
        System.out.println("Title: " + title);
//        System.out.println(driver.getTitle());

        // Go to Google website and retrieve the URL and print it to the console:
        System.out.println("getCurrentUrl: " + driver.getCurrentUrl());

        driver.quit();
    }
}
