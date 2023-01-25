package Class13;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _02_FrameDemo2 {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://ui.vision/demo/webtest/frames/");
        // how to know how many links (or frames)i n a given webpage?

       List<WebElement> allLinks = driver.findElements(By.tagName("frame"));
        System.out.println("All frame: "+ allLinks.size());

        List<WebElement> allFrames = driver.findElements(By.tagName("frame"));
        System.out.println("All Frame:" +allFrames.size());

         // Switching to frame one
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_1.html']")));
        driver.findElement(By.name("mytext1")).sendKeys("Frame one");

        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        //Switching to frame two
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_2.html']")));
        driver.findElement(By.name("mytext2")).sendKeys("Frame two");

        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        //Switching to frame  (any frame you want within the main window (browser), Frame 5
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_3.html']")));
        driver.findElement(By.name("mytext3")).sendKeys("Frame three");
        tearDown();





    }
}
