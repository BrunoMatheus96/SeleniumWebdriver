package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunBase {

    static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriver getDriver(String browser) {

        ChromeOptions chromeOptions = new ChromeOptions();

        if (driver !=  null) {
            driver.quit();
        }

        switch (browser) {

            case "chrome":
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            case "chrome-ci":
                chromeOptions.addArguments("--headless", "--remote-allow-origins=*");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                throw new IllegalArgumentException("Edge ainda nao suportado");
            default:
                throw new IllegalArgumentException("Navegador não encontrado! Passe um navegador existente: chrome, forefox ou edge.");
        }
        if(driver != null){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        return driver;
    }
}
