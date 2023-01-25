package C0011;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static  utils.BaseClass.*;

public class DropdownDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        // 1st way:Without using Select Class
       List<WebElement> countries =  driver.findElements(By.cssSelector("select[name='country']option"));
       for (WebElement country: countries) {
           System.out.println(country.getText());
       }
        // 2nd way: using Select Class provided by Selenium
        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select= new Select(countryDD);
        // Get  the size of the dropdown
        System.out.println("total number of countries : " + countries.size());

        // Loop through all countries using their index

        for ( WebElement country :countries) {
            if (  country.getText().equals("Belgium")){
                country.click();
                break;
            }

        }

      //  for( int i = 0; i< countries.size(); i++){
        //    countries.get(i).click();
        //    Thread.sleep(200);

      //  }


        tearDown();

    }
}
