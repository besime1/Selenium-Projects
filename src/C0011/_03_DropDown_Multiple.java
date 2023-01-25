package C0011;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

import static utils.BaseClass.*;

public class _03_DropDown_Multiple {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement months = driver.findElement(By.cssSelector("select[name='Month']"));
        Select select= new Select(months);


        List<WebElement> listOfMonths = select.getOptions();
        int totalMonths =listOfMonths.size();
        System.out.println("totalMonths: " + totalMonths);

        //Task: print All months using 1. For Loop, 3.Iterator loop;

        // before looping we need to know the size-length.
        // first for loop
         for( int i= 0;i<totalMonths; i++) {
             String month = listOfMonths.get(i).getText();
             System.out.println(month);
         }

             System.out.println("======Enhanced loop===");
             for (WebElement month : listOfMonths){
                 System.out.println(month.getText());
             }

             System.out.println("===Iterator===");
             Iterator<WebElement> iterator= listOfMonths.iterator();
             while (iterator.hasNext()){
                 System.out.println(iterator.next().getText());
             }

             //Task2: Print only a specific (selected) months from the list. For example ,March,May,September.
             //Hint:we can use loop or we can use one of existing select class methods such as  ByVisibleText(),by index/value
             // first way:without select

              for (WebElement month : listOfMonths){
                  if ( month.getText().equals("March") || month.getText().equals("May") || month.getText().equals("September")){
                      month.click();
                      //break;  // if you use 'if' dont use 'break',if you use 'while' then you can use break
                  }
              }
              // 2nd way
              if ( select.isMultiple()){
                  select.selectByIndex(3 );//March
                  select.selectByVisibleText("May");// May
                  select.selectByValue("Sept");// sept
                  Thread.sleep(2000);
                  select.deselectByIndex(3);// deselect month of March
                  Thread.sleep(2000);
                  select.deselectAll();

              }

             tearDown();



    }
}
