package factoryPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

/*                                                 Example 1
public WebDriver driver;

public WebDriver setDriver(String browserDetails){

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
*/

    /*static WebDriver getDriver() {

        String browser = System.getenv("BROWSER");
        if (browser == null) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        switch (browser)
        {
            case "IE":
                WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

        }
    }
*/
                                  // exmaple 2
WebDriver driver;
    @Before
    public void setUp() {
        String currentBrowser = System.getProperty("selenide.browser", "firefox");
        if ("chrome".equals(currentBrowser)) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if ("firefox".equals(currentBrowser)) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }  else if ("safari".equals(currentBrowser)) {
            driver = new SafariDriver();
        } else if ("edge".equals(currentBrowser)) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if ("ie".equals(currentBrowser)) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
}}


