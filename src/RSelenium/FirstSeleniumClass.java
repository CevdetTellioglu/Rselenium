package RSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        // System.setProperty:driver i tanitir
        System.setProperty("webdriver.chrome.driver","/Users/cevdettellioglu/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();  //ChromeDriver dan driver adinda WebDriver turunde obje olusturduk..
        //get():istedigimiz web sayfasina gider
        //driver imiza get komutu ile google.com a gitmesini soyledik
        driver.get("https://www.google.com");
        Thread.sleep(3000); //bekleme suresi
        //driver.navigate().to("https://google.com"); de ayni isi yapar
        driver.get("https://www.amazon.com");
        //driver.close(); // driver da acik olan sayfayi kapatiyor
        driver.quit();  // driver da acik butun sayfalari ile tamamen kapatiyor
    }
}
