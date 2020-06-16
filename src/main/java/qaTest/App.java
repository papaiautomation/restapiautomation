package qaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sr673869\\Desktop\\LatestChrome_Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.gmail.com");
        
    }
}
