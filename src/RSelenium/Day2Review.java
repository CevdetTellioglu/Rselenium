package RSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Review {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/cevdettellioglu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Youtube web sayfasina gidin ve sayfa basliginin "youtube" olup olmadigini dogrulayin
        //eger degilse Actual title i konsolda yazdirin
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL ! ACTUAL TITLE IS : "+actualTitle);
        }
        //Sayfa url sinin "youtube" icerip icermedigini(contains) dograulayin, icermiyorsa
        //dogru URL yi yazdirin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "youtube";

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Yes, Actual URL ( "+actualUrl+") contains is expected URL( "+expectedUrl+")");
        }else {
            System.out.println("No,Actual url : "+actualUrl);
        }
            //After than navigate to https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        // After than check page title is contain "Amazon" if doesn't contains
        //show Actual page title
        String actualAmazonTitle =driver.getTitle();
        String expectedAmazonTitle = "Amazon";
        if (actualAmazonTitle.contains(expectedAmazonTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL "+actualAmazonTitle);
        }
        //Check Page Url "https://www.amazon.com
        String actualAmazonUrl =driver.getCurrentUrl();
        String expectedAmazonUrl = "https://www.amazon.com";
        if (actualAmazonUrl.contains(expectedAmazonUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL "+actualAmazonUrl);
        }
        driver.quit();

    }
}
