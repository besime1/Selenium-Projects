package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchContextException;

import java.time.Duration;

import static utils.BaseClass.*;
/**
 * Task: Implicit Wait HW: Get the text from a link which will load a paragraph when you click on it.
 *    1. Go to this URL: http://uitestpractice.com/Students/Contact
 *    2. Click on the link where it says 'This is a Ajax link'
 *    3. First use without wait, handle the exception, should say "Element is not found, Please wait longer for element to become visible".
 *    4. Wait for its content to load and retrieve the text from it and print it to the console.
 */
public class _02_ImplicitWait_Task {
    public static void main(String[] args) {
        setUp("http://uitestpractice.com/Students/Contact");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            driver.findElement(By.linkText("This is a Ajax link")).click();
            System.out.println(driver.findElement(By.className("ContactUs")).getText());
        } catch (NoSuchContextException e) {
            e.printStackTrace();
            System.out.println("Element is not found.Wait longer for the element to become visible on the UI");
        }
        tearDown();
    }

}
