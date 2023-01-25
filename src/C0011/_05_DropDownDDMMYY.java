package C0011;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _05_DropDownDDMMYY {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://vitalets.github.io/combodate/");
        //1, find element
        WebElement dayDD  = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select selectDayDD= new Select(dayDD);
        selectDayDD.selectByVisibleText("25");

        Thread.sleep(2000);

        //2.way
        WebElement monthDD  = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        Select selectMonthDD= new Select(monthDD);
        selectMonthDD.selectByIndex(4); //April

        Thread.sleep(2000);

        //3. way
        WebElement yearDD  = driver.findElement(By.xpath("(//select[@class='year '])[1]"));
        Select selectYearDD= new Select(yearDD);
        selectYearDD.selectByValue("1985");

        Thread.sleep(2000);

        //NOTE:NEVER TYPE YOUR LOCATORS, SUCH AS XPATH CSS
        //Loop through the dayDD,find a specific date("23")
        List<WebElement> dayList = selectDayDD.getOptions();
        for(WebElement day :dayList);
        dayDD.click();
        String  dayText = dayDD.getText();
        if (dayText.equals("23")){
            System.out.println(dayText);

            //break;
        }




        tearDown();




    }

}
