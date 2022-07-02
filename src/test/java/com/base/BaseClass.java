package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
public static void loadDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	
	
	public static void url(String site) {
		driver.get(site);
	}
	
	public void type(WebElement element,String text) {
		element.sendKeys(text);
	}
	public void click(WebElement element) {
		element.click();
	}
	
	public static void screenshot(String name){
		TakesScreenshot tk =(TakesScreenshot)driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File file = new File(name+".png");
		try {
			FileHandler.copy(screenshotAs, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String pro(String key) throws IOException {
		File file = new File("E:\\eclipse\\Jan 2022 Java Batch 2\\PageobjectModuel\\src\\test\\resources\\testData.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties po = new Properties();
		po.load(fis);
		String property = po.getProperty(key);
		return property;
	}

}
