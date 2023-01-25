package Class18_Calenders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

import static utils.BaseClass.*;
import static utils.CommonMethods.*;

public class _01_SimpleCalender extends BaseClass {
    public static void main(String[] args) {
        setUp("https://demoqa.com/date-picker");

        //lets pick october 17,2018

        driver.findElement(By.id("datePickerMonthYearInput")).click();

        //Select month(s) from the calender dropdown
        WebElement monthDD=driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']"));
         selectDdValue(monthDD,"October");

         // Pick year
        WebElement yearDd= driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']"));
        selectDdValue(yearDd,"2018");

        //Pick day
        WebElement daysDD= driver.findElement(By.cssSelector("div.react-datapicker__week div"));
        selectDdValue(daysDD,"17");

        WebElement datePikerField=driver.findElement(By.id("datePickerMonthYearInput"));
        String pickerFieldText=datePikerField.getAttribute("value");
        System.out.println("Date picker input value:"+pickerFieldText);




        tearDown();
    }
}
