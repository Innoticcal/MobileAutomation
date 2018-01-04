import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Forgotpassword {
	public AppiumDriver driver;
	String AppPath = "D:\\APK'S\\basepath.apk";

	@Test
	public void createAppiumInstance() throws MalformedURLException, InterruptedException {

		// Set DesiredCapabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		// device udid
		caps.setCapability("device ID", "SM-G920L");
		// device name
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S6");
		// device version
		caps.setCapability("version", "6.0");
		caps.setCapability("app", AppPath);
		caps.setCapability("newCommandTimeout", "600");
		// Appium instancey
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), caps);

		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);

		Thread.sleep(5000);
		List<MobileElement> password = driver.findElements(By.xpath("//android.view.View[@text='Forgot Password?"));

		Thread.sleep(8000);
		password.get(0).click();

	}
}
