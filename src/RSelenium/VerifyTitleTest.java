package RSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

       //navigate to google home page
        //google basliginin(title) "Google" olup olmadigini dogrulayin

        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actuel Title : "+actualTitle);
            System.out.println("Expected Title : "+expectedTitle);
        }
        driver.quit();
    }
}
