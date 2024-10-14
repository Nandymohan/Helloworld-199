package TrySeleExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryAlertsEx {
	
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91770\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://leafground.com/pages/Alert.html");
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
driver.switchTo().alert().accept();

driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
driver.switchTo().alert().dismiss();

driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
Alert pbox= driver.switchTo().alert();
pbox.sendKeys("NANDY");
pbox.accept();
/*
 * pbox.sendKeys("Nandhinii"); Thread.sleep(10); pbox.accept();
 */
	
	
}}
