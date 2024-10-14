package TrySeleExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCheckBoxEx {
	
	//private static final boolean True = false;

	//private static boolean ;

	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91770\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
	Boolean state=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).isSelected();
	System.out.println(state);
	
	WebElement sta=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
	if (sta.isSelected())
	{
		sta.click();
	}
		
	
	WebElement sta1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
	if (sta1.isSelected())
	{
		sta1.click();
	}
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[1]/input")).click();
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[2]/input")).click();
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[3]/input")).click();
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[4]/input")).click();
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[5]/input")).click();
	
	
	
	
}
}
