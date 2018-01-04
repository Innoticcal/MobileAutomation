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

public class Profile {
	public AppiumDriver driver;

	String AppPath = "D:\\APK'S\\lms.apk";

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

		List<MobileElement> email = driver.findElements(By.xpath("//android.view.View[@text='Email *']"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		email.get(0).clear();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		email.get(0).sendKeys("gsatishkumar0209@gmail.com");

		List<MobileElement> password = driver.findElements(By.xpath("//android.view.View[@text='Password *']"));
		Thread.sleep(5000);
		password.get(0).clear();
		Thread.sleep(5000);
		password.get(0).sendKeys("123456");

		List<MobileElement> signin = driver.findElements(By.className("android.widget.Button"));
		Thread.sleep(5000);
		signin.get(0).click();
		System.out.println("Login successfully");

		Thread.sleep(5000);

		List<MobileElement> profile = driver.findElements(By.className("android.widget.Image"));
		Thread.sleep(5000);
		profile.get(1).click();
		Thread.sleep(5000);

		WebElement name = driver.findElement(By.xpath("//android.view.View[@index='1']"));
		System.out.println("name : " + name.getAttribute("text"));
		System.out.println("name : " + name.getText());

		WebElement id = driver.findElement(By.xpath("//android.view.View[@index='2']"));
		System.out.println("id : " + id.getAttribute("text"));
		System.out.println("id : " + id.getText());

		WebElement number = driver.findElement(By.xpath("//android.view.View[@index='3']"));
		System.out.println("number : " + number.getAttribute("text"));
		System.out.println("number : " + number.getText());

		WebElement Email = driver.findElement(By.xpath("//android.view.View[@index='4']"));
		System.out.println("Email : " + Email.getAttribute("text"));
		System.out.println("Email : " + Email.getText());
		
		
		
	}

}
