package support;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static runner.RunBase.getDriver;

public class ScreenshotUtils {
    @After
    public static void takeScreenshoot(Scenario scenario) {
        System.out.println("===================");
        System.out.println("Teste executado" + scenario.getName());
        System.out.println("Status: " + scenario.getStatus());
        System.out.println("Tag: " + scenario.getSourceTagNames());
        System.out.println("===================");
        if (scenario.isFailed()) {
            //Tirar print da tela
            ScreenshotUtils.addScreenshotOnScenario(scenario);
        }
    }
    public static void addScreenshotOnScenario(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }
}