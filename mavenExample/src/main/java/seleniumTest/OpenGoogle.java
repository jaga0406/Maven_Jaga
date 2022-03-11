package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class OpenGoogle {
	static WebDriver driver; 
	 public static void main(String[] args) {
		 ExtentHtmlReporter reporter = new ExtentHtmlReporter("report.html");
		 ExtentReports reports = new ExtentReports();
		 reports.attachReporter(reporter);
		 ExtentTest test = reports.createTest("whatsapp duck");
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\git\\Selenium_Automation1\\jaga_selenium\\browser drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.get("http://www.google.com");
	    driver.findElement(By.name("q")).sendKeys("Whatsup Duck!");
	    driver.findElement(By.name("q")).submit();
	    test.pass("Test passed");
	    driver.quit();
	    reports.flush();	
	    } 
	

}
