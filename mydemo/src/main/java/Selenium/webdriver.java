package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\latha\\\\eclipse-workspace\\\\demo\\\\Browser Driver\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		WebElement googlesearchtextfield = driver.findElement(By.xpath("//input[@title='Search']"));
		googlesearchtextfield.sendKeys("mobile");
		googlesearchtextfield.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='hdtb-msb']/div[1]/div/div[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div[1]/div/div[1]/div[1]/div/div/a[2]")).click();
	}
	
}
