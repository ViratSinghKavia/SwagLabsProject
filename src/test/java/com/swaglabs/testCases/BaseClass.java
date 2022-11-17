package com.swaglabs.testCases;






import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.swaglabs.utilities.ReadConfig;





public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	public String username= readconfig.getUserName();
	public String password= readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
		driver= new ChromeDriver();

		logger = Logger.getLogger("swaglabs");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get(baseURL);
		logger.info("*********URL is Opened*******");
		
		driver.manage().window().maximize();
			
			
	}
	
	@AfterClass
	
	public void tearDown() {
		
		driver.quit();
	}
	
	public void CaptureScreen(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(src, target);
		System.out.println("*******Screenshot Taken*********");
		
	}
	
	
	
	

}
