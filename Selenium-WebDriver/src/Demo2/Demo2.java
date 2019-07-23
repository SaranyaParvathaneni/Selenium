package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Setup\\Drivers\\chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
		cdriver.findElement(By.name("userName")).sendKeys("sunil");
		cdriver.findElement(By.name("password")).sendKeys("sunil");
		cdriver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		//cdriver.findElement(By.linkText("SIGN-OFF")).click();
		///html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a
		//cdriver.findElement(By.xpath("//html/body/div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	}

}
