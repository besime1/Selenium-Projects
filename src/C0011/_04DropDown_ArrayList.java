package C0011;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static utils.BaseClass.*;
public class _04DropDown_ArrayList {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement months = driver.findElement(By.cssSelector("select[name='Month']"));
        Select select= new Select(months);

        //This is the list we are given for test case,required by the company/project
        //Let is assume
        List<WebElement> listOfMonths = select.getOptions();
        System.out.println(listOfMonths.size());
        List<String> expectedList = new ArrayList<>();
        expectedList.add("March");
        expectedList.add("June");
        expectedList.add("November");
        expectedList.add("July");
        expectedList.add("December");

         if (listOfMonths.containsAll(expectedList))
             System.out.println("The  list does match.Test passed.");
         else
             System.err.println("The  list does NOT match.Test failed.");
         //
        List<String> actualList = new ArrayList<>();
        for (WebElement month :listOfMonths){
            actualList.add(month.getText());
        }
        if( actualList.containsAll(expectedList))
            System.out.println("THE LIST DOES NOT MATCH");
        else
            System.err.println("THE LIST DOES NOT MATCH");







    }
}
