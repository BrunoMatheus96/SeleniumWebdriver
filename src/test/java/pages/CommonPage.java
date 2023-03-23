package pages;

import org.openqa.selenium.JavascriptExecutor;
import runner.RunCucumber;

public class CommonPage  extends RunCucumber {
    public  void scrollDown(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollTo(0, 10000)");
    }
}
