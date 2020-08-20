package com.redfin.base;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedfinBase {
	
	public static Properties prop;
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest logger;	
	
	/*
	 * Name of the Method: createReport 
	 * Brief Description : This will create a empty Extent Report. 
	 * Arguments : No Arguments 
	 * Created By : Deepika Pathinga 
	 * Created Date : 08/19/2020 
	 * Last Modified : 08/19/2020
	 */
	public static void createReport() {
		String fileName = new SimpleDateFormat("'Redfin_Report_'YYYYMMddHHmmss'.html'").format(new Date());
		String path = "C:\\Users\\deepi\\Desktop\\TekArch\\GitHub\\Redfin\\target\\Reports\\" + fileName;
		report = new ExtentReports(path);
	}
	
	/*
	 * Name of the Method: propertyExtentSetup
	 * Brief Description : This will initialize property file. 
	 * Arguments : No Arguments 
	 * Created By : Deepika Pathinga 
	 * Created Date : 08/19/2020 
	 * Last Modified : 08/19/2020
	 */
	/*public void propertyExtentSetup() throws IOException {
	//property file for global properties under utility folder
		prop = new Properties();
		FileInputStream file = new FileInputStream(System.getProperty("C:\\Users\\deepi\\eclipse-workspace\\Redfin\\src\\com\\redfin\\utility\\GlobalEnvironments.properties"));
		prop.load(file);
	}*/	
	
	/*
	 * Name of the Method : InitializeDriver 
	 * Brief Description : This will initialize browser (chrome, firefox, edge, opera, ie) 
	 * Arguments : No Arguments
	 * Created By : Deepika Pathinga 
	 * Created Date : 08/19/2020 
	 * Last Modified : 08/19/2020
	 */
	public static void initializeDriver() throws Exception {
		//String browserName = prop.getProperty("browsername");
		String browserName = "chrome";

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
	}
	
	/*
	 * name of the Method : OpenUrl
	 * Brief Description  : This will open the url passed and maximizes the window screen
	 * Arguments		  : No Arguments
	 * Created By 		  : Deepika Pathinga
	 * created Date		  : 08/19/2020
	 * Last Modified	  : 08/19/2020
	 */
	public static void openUrl() throws InterruptedException {
		//driver.get(prop.getProperty("url"));
		driver.get("https://redfin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*
	 * name of the Method : CloseBrowser
	 * Brief Description  : This will close the browser
	 * Arguments		  : No Arguments
	 * Created By 		  : Deepika Pathinga
	 * created Date		  : 08/19/2020
	 * Last Modified	  : 08/19/2020
	 */
	public static void closeBrowser() {
		driver.quit();
	}

	/*
	 * name of the Method : CloseReport
	 * Brief Description  : This will generate the report
	 * Arguments		  : No Arguments
	 * Created By 		  : Deepika Pathinga
	 * created Date		  : 08/19/2020
	 * Last Modified	  : 08/19/2020
	 */
	public static void closeReport() {
		//report.endTest(logger);
		report.flush();
	}	

}
