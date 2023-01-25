package C006;
       //** TC 4.3: Print visible links from the Exelenter Homepage
       // 1. Open the Chrome browser
      //  2. Go to Exelenter Website
        //3. Iterate through the links until you find "Enroll Now"
      //  4. Once expected keyword is found, print it and exit
      //  5. Close the browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TCRadioAndCheckbox {
    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> colors = driver.findElements(By.cssSelector("input[name='color']"));
        for (WebElement element : colors) {
            String colorName = element.getAttribute("value");
            while (colorName.equalsIgnoreCase("orange") || colorName.equalsIgnoreCase("yellow")) {
                element.click();
                System.out.println(element.getAttribute("value"));
                break;
            }
        }

//        System.out.println("--- For Loop ---");
//        for (int i = 0; i < colors.size(); i++) {
//            while (colors.get(i).getAttribute("value").equalsIgnoreCase("orange")
//                    || colors.get(i).getAttribute("value").equalsIgnoreCase("yellow")) {
//                colors.get(i).click();
//                System.out.println(colors.get(i).getAttribute("value"));
//                break;
//            }
//        }

//        Thread.sleep(2000);
        driver.close();

    }
}
