package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce
{

	public static void main(String [] args)
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c\\chromedriver.exe");
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[class*='mb16']")).sendKeys("123444");
		driver.findElement(By.xpath("//input[contains(@type,'passwo')]")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		
	}
	
}

