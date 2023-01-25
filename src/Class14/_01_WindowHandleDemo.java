package Class14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;
public class _01_WindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/windows");
        /**
         *  How to handle new TABS and new WINDOWS in Selenium?
         *  We have two methods for handling new tabs/windows.
         *      1. getWindowHandle();    ==> handles main window only
         *      2. getWindowHandles();   ==> handles ALL windows (or tabs) including the main/parent window
         */




        String mainWindowTitle = driver.getTitle();
        System.out.println("main Window Title: " + mainWindowTitle);

        String windowHandle = driver.getWindowHandle();// this will return parents window
        System.out.println("window Handle: " +windowHandle);

        driver.findElement(By.linkText("Click Here")).click();

        //System.out.println(driver.getTitle());  // switch window title will print here?

        Set<String> allwindows = driver.getWindowHandles();//this will return unique IDs for all windows
        int allOpenWindows= allwindows.size();
        System.out.println("All tabs currently open: " + allOpenWindows);

        System.out.println("============");
        System.out.println(allwindows);
        allwindows.forEach(System.out::println);

        // Here comes your iterator skills - put them in good use
        Iterator<String> iterator = allwindows.iterator();
        String mainWindow = iterator.next();
        String childWindow = iterator.next();
        System.out.println("mainWindow: " + mainWindow);
        System.out.println("childWindow: " + childWindow);

        System.out.println("===================");
        System.out.println("Get title before the switch: " + driver.getTitle());

        // How to switch focus to the child window and print its title
        driver.switchTo().window(childWindow);               // Here we are switching from the Parent window to Child window

        System.out.println("Get title after the switch: " + driver.getTitle());

        // if I call driver.close() in this line, which window/tab will close?
        Thread.sleep(1000);
        driver.close();                   // it should close child, because as of this line FOCUS is on the child.

        //Thread.sleep(1000);
        // driver.close();                   // if we try to close it again. Child window is already closed, and when it is not found, we get NoSuchWindowException


        tearDown();

    }

}
