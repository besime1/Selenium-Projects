package Class12;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;


public class _01AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");
        //How to handle a simple alert
        WebElement simpleAlert = driver.findElement(By.id("simple"));
        simpleAlert.click();
        Thread.sleep(2000);

        //Question:What happens when we try to click on another element without handling on alert

        // driver.findElement(By.xpath("//div[text()='Search']")).click();

        //Answer:You will get "UnhandledAlertException" if you do not handle

        Alert alert=driver.switchTo().alert();// we switch to focus of the web browser to the alert window
        String alertText = alert.getText();
        System.out.println("alertText: " + alertText);
        alert.accept();  // accept =Ok

        // Handling Confirmation Alert
        // Handling Confirmation Alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        Alert confirmationAlert = driver.switchTo().alert();  //note :for all alert types we use the same.switchTo().alert();
        String confirmationAlertText = confirmationAlert.getText();
        System.out.println("confirmationAlertText: " + confirmationAlertText);
        Thread.sleep(2000);
        confirmationAlert.dismiss();                       // dismiss = 'Cancel' button

        Thread.sleep(2000);

        // Handling Prompt alert
        driver.findElement(By.id("prompt")).click();// identify webElement for the Alert and click on it
        Alert promptAlert= driver.switchTo().alert();
        String  promptAlertText= promptAlert.getText();
        System.out.println("promptAlertText:"+promptAlertText);
        Thread.sleep(1000);

        promptAlert.sendKeys("Besime"); //  Iam sending text/value into the input text
        Thread.sleep(1000);

        promptAlert.accept(); // press OK button to close the alert

        // Lets verify our entered text
        String enteredText = driver.findElement(By.xpath("//div[contains(text(),'Besime')]")).getText();

        System.out.println("enteredText:"+enteredText);
        String  expectedText="Besime123";
        if(enteredText.contains(expectedText))
        System.out.println("test is added successfully.text passed");
        else
            System.out.println("test is NOT added successfully.text FAILED");

        tearDown();
    }

}
