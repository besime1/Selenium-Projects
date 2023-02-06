package C0011;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class HW_Countries {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");
        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select= new Select(countryDD);
        //1st way
        select.selectByVisibleText("United States of America");

        //2nd way
        // Before looping I need list of web elements
        List<WebElement> listOfCountries = select.getOptions();
        for( WebElement country: listOfCountries){
            if(country.getText().equals("United States of America")){
                country.click();
                System.out.println("USA is found and selected :"+country.getText());
                break;
            }
        }
        //Task: loop through list of until 'Morocco' country is found, select and exit.

        for (WebElement country :listOfCountries){
            country.click();
            if (country.getText().equals("Morocco")){
                country.click();
                System.out.println("Country is found : " + country.getText());
                break;
            }

        }
        tearDown();
    }

}
