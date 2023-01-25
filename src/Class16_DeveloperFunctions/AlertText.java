package Class16_DeveloperFunctions;
import org.openqa.selenium.By;
import utils.CommonMethods;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class AlertText {
    public static void main(String[] args)  {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");

        driver.findElement(By.id("simple")).click();
        //driver.findElement(By.cssSelector(".header-widget div a")).click();  // Clicks on Selenium menu, which will cause NoAlertException.
        System.out.println(getAlertText());
        acceptAlert();

        driver.findElement(By.id("confirm")).click();
        System.out.println(getAlertText());
        dismissAlert();

        driver.findElement(By.id("prompt")).click();
        sendAlertText("Said");
        System.out.println(getAlertText());
        acceptAlert();


        tearDown();
    }

}
