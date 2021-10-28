package com.osa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static void main(String[] args) {
		WebDriver driver =openBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.close();	
		
		
	}
		public static WebDriver  openBrowser(String browser) {
			
			WebDriver driver=null;
			if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				if(browser.toLowerCase().equals("chrome")) {
					System.setProperty("webdriver.chrome.driver", "D:\\Dirvers new2021\\chrom95\\chromedriver.exe");
					driver=new ChromeDriver();
				}else if (browser.toLowerCase().equals("firefox")) {
						System.setProperty("webdriver.gecko.driver", "");
						driver=new FirefoxDriver();
						driver.manage().window().maximize();
				}else {
					System.out.println("***Test is Runing"+System.getProperty("os.name"));
					
						
				}
			
		}
			return driver;
	}
}
