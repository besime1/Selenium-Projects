package Class15;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static utils.BaseClass.*;
public class _08_WaitFromBaseClass {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com");

        driver.findElement(By.cssSelector("button[class='dropbtn']")).click();
        try {
            driver.findElement(By.partialLinkText("Face")).click();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Element is not found.");
        }
        tearDown();
    }


}
