package Class12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utils.BaseClass.*;

public class _02ModalAlert {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/modal-dialogs");// switch to url");

        WebElement modalAlert = driver.findElement(By.id("showSmallModal"));
        modalAlert.click();
        System.out.println(modalAlert.getText());

         // print in two lines (Tittle of Modal)
        String modalTitleText= driver.findElement(By.xpath("//div[@class='modal-title h4']")).getText();
        System.out.println("modalTitleText:" +modalTitleText);

        //print in one line(body content of modal
        System.out.println("modalBodyText:"+driver.findElement(By.xpath("//div[@class='modal-title h4']")));

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Close']")).click();



        tearDown();
    }
}
