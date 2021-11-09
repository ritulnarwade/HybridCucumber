package ReusableCompo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.externalconfig.ConfigLoader;

import Utility.ConfigDataProvider;

public class WebDriverHelper {
	

	public static WebDriver driver;
	public Properties pro;
	public static ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;

	public static WebDriver initializedriver() throws IOException
	{
		config = new ConfigDataProvider();
		String browsername = config.getbrowser();
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SDET_Java\\HybridCucumberFramework\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
	
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	

}
