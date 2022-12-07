package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.time.Duration;

public class Driver {

    /*
   Creating a private constructor, so we are closing
   access to the object of this class from outside the class
    */
    private Driver(){}

    /*
    We make WebDriver private, because we want to close access from outside the class.
    We make it static because we will use it in a static method.
     */

    private static WebDriver driver; // value is null by default

    public static WebDriver getDriver() {
        // browser type can come from properties file or command line.
        if (driver == null) {
            /*
            We read our browserType from configuration.properties.
            This way, we can control which browser is opened from outside our code, from configuration.properties.
             */
            // if the System.getProperty("browser") is not null
            // the browser is equal to  System.getProperty("browser")
            // if the System.getProperty("browser") is  null
            // then browser is equal to ConfigurationReader.getProperty("browser")

            String browser = System.getProperty("browser") != null ? System.getProperty("browser")
                    : ConfigurationReader.getProperty("browser");

             /*
                Depending on the browserType that will be return from configuration.properties file
                switch statement will determine the case, and open the matching browser
            */

            switch (browser) {
                case "firefox":
                    driver = new FirefoxDriver();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "chrome":
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "ie":
                    driver = new InternetExplorerDriver();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }
        }
        return driver;

        // No need webdriver-manager and setup after Selenium 4.6.0
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();// this line will terminate the existing session. value will not even be null
            driver = null;
        }
    }

    public static WebDriver get() {
        return driver;
    }
}
