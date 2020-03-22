package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;

public class Utils {
	public static ChromeDriver driver;
	
	public static void acessarSistema() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	public static <T> T Na(Class<T>classe) {
		return PageFactory.initElements(driver, classe);
	}
	
	@SuppressWarnings("deprecation")
	public static void capturarScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png");
	}

}

