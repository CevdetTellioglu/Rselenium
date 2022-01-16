package RSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //navigate to google home page
        //google ana sayfa url nin "www.google.com" olup olmadigini dogrulayin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "www.google.com";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual URL : "+actualUrl);
            System.out.println("Expected URL : "+expectedUrl);
        }

        driver.quit();


    }
}
