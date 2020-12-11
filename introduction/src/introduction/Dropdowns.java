package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "c\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ststicdropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown=new Select(ststicdropdown);
		
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("option2");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("Option3");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

	}

}
