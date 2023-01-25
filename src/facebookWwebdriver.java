import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookWwebdriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //navigate to Facebook
        driver.get("https://www.facebook.com");
        //lets practice using locaters to locate web elements on FB page:

        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("test@gmail");//ByCssSelector("input[name='email']"));

        Thread.sleep(2000);
        driver.findElement( By.name("pass")).sendKeys("abc123");
        Thread.sleep(2000);
        driver.findElement( By.name("login")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("_97w4")).click();
      //  driver.findElement( By.linkText("forgot pasword")).click();
        Thread.sleep(2000);
        driver.findElement( By.partialLinkText("forgot")).click();
        Thread.sleep(2000);
        driver.close();


       // WebElement password=driver.findElement(new By.ByCssSelector("input[placeholder='Pasword']"));
       // password.click();
       // password.sendKeys("123456789");
       // WebElement login= driver.findElement((new By.ByCssSelector(("button[data-testid= 'royal_login_button']'"))));
        //login.click();
        //WebElement fpsw= driver.findElement((new By.ByCssSelector("a._97w4")));
        //fpsw.click();

        //driver.manage().window().maximize();
//
    }
}
