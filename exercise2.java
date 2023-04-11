package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise2 {
	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver;
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(co);
	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	WebElement name=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
	name.sendKeys("Pradeep");
	WebElement email=driver.findElement(By.xpath("//*[@name=\"to_email\"]"));
	email.sendKeys("pradeep@gmail.com");
	WebElement your_name=driver.findElement(By.xpath("//*[@name=\"from_name\"]"));
	your_name.sendKeys("Sana");
	WebElement your_email=driver.findElement(By.xpath("//*[@name=\"from_email\"]"));
	your_email.sendKeys("xyz@gmail.com");
	WebElement bd= driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
	bd.click();
	
	WebElement msg= driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
	msg.sendKeys("Happy Birthday");
	
	WebElement amt= driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
	amt.sendKeys("2000");
	
    WebElement terms= driver.findElement(By.xpath("//*[@name=\"agree\"]"));
    terms.click();
	
	 WebElement con = driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
	 con.submit();
	
	
}
}