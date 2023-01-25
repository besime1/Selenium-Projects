package Class16_DeveloperFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;
public class _05_DropDown3 {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://vitalets.github.io/combodate/");

        WebElement dayDD = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        WebElement monthDD = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        WebElement yearDD = driver.findElement(By.xpath("(//select[@class='year '])[1]"));
        //go and select  March20th,2014.
        selectDdValue(dayDD,"15");
        selectDdValue(monthDD,"Apr");
        selectDdValue(yearDD,"2012");
        Thread.sleep(2000);

        //Lest assume dropdown does not have class tag,how would you locate and select dates from it?
        List<WebElement> daysDD = driver.findElements(By.xpath("(//select[@class='day '])[1]/option"));
        selectDdValue(daysDD,"17");

        tearDown();
    }
}
