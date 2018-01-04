import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Loan {
	public AppiumDriver driver;

	String AppPath = "D:\\APK'S\\LMS.apk";

	@Test
	public void createAppiumInstance() throws InterruptedException, IOException {

		FileInputStream f = new FileInputStream("D:\\programes\\Destimoney\\src\\lms.properties");
		Properties p = new Properties();
		p.load(f);
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
		email.get(0).sendKeys(p.getProperty("loginemail"));

		List<MobileElement> password = driver.findElements(By.xpath("//android.view.View[@text='Password *']"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		password.get(0).clear();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		password.get(0).sendKeys(p.getProperty("password"));

		List<MobileElement> signin = driver.findElements(By.className("android.widget.Button"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		signin.get(0).click();
		System.out.println("Login successfully");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		// Access location allow button
		driver.findElement(MobileBy.id("com.android.packageinstaller:id/permission_allow_button")).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<MobileElement> plus = driver.findElements(By.className("android.widget.Image"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		plus.get(1).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("1");
		Thread.sleep(5000);
		final WebElement lead=driver.findElement(By.className("android.widget.Button[@index='0']"));
		Thread.sleep(5000);
		lead.click();
		lead.click();
		
//		List<MobileElement> Add =  	driver.findElements(By.xpath("android.widget.Button[contains(text(),'ADD LEAD')]"));
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		Add.get(0).click();
		System.out.println("2");

		// List<MobileElement> username =
		// driver.findElements(By.xpath("//android.view.View[@text='User Name']"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// username.get(0).clear();
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// username.get(0).sendKeys(p.getProperty("username"));
		//
		// List<MobileElement> Email = driver.findElements(By.id("lbl-3"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Email.get(0).clear();
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Email.get(0).sendKeys(p.getProperty("Email"));
		//
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// List<MobileElement> Mobile =
		// driver.findElements(By.xpath("//android.view.View[@text='Mobile No.']"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Mobile.get(0).clear();
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Mobile.get(0).sendKeys(p.getProperty("mobile"));
		//
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// List<MobileElement> address =
		// driver.findElements(By.xpath("//android.widget.EditText[@text='Address']"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// address.get(0).clear();
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// address.get(0).sendKeys(p.getProperty("address"));
		// Thread.sleep(5000);
		//
		// driver.hideKeyboard();
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// List<MobileElement> dropdown =
		// driver.findElements(By.xpath("//android.view.View[@text='Type of Lead']"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// dropdown.get(0).click();
		//
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// List<MobileElement> Loan = driver.findElements(By.id("lbl-7"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Loan.get(0).click();
		//
		// Thread.sleep(5000);
		// List<MobileElement> subtype =
		// driver.findElements(By.xpath("//android.view.View[@text='Type of Loan']"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// subtype.get(0).click();
		//
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// List<MobileElement> car = driver.findElements(By.id("lbl-10"));
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// car.get(0).click();
Thread.sleep(5000);
		
	}
}
