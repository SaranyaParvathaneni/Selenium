package DemoWebdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set the property of Firefox driver
		//System.setProperty("webdriver.gecko.driver", "C:\\Selenium Setup\\Drivers\\geckodriver.exe");
		
		//Firefox driver can be used only for FireFox browser
		//FirefoxDriver ffdriver = new FirefoxDriver();
		
		//set the property of chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Drivers\\chromedriver.exe");
		
		//webdriver is a interface of selenium which contains all the browser implementation, webdriver can be used for any of the browsers
		WebDriver cdriver = new ChromeDriver();
		
		//API command to maximize
		cdriver.manage().window().maximize();
		
		//command to open url in browser
		cdriver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Alternate API to navigate to browser
		//cdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		//wait (but should not be used in real time)
		Thread.sleep(3000);
		
		//refresh the web app
		//cdriver.navigate().refresh();
		
		//cdriver.findElement(By.id("txtUsername")).sendKeys("admin");
		//cdriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//Thread.sleep(3000);
		//cdriver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(3000);
		//cdriver.findElement(By.id("welcome")).click();
		//Thread.sleep(3000);
		//cdriver.findElement(By.linkText("Logout")).click();
		
		cdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");
		cdriver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		Thread.sleep(3000);
		cdriver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(3000);
		cdriver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(5000);
		cdriver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
	}

}
