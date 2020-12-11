package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String [] args)
	{
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("123123");
		driver.navigate().to("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("8105777730");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
	}
	
}

