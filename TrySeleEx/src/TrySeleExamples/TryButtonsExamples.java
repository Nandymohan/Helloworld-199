package TrySeleExamples;
import org.openqa.selenium.chrome.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryButtonsExamples {

		public static void main (String args[]) {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91770\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		//System.setProperty("Webdriver.chrome.driver","C:\\Users\\91770\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		//driver.findElement(By.id("home")).click();
		Point loc= driver.findElement(By.id("position")).getLocation();
		System.out.println("x is:" +loc.getX());
		System.out.println("y is:" +loc.getY());
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("Color is " +color);
		Dimension hcolor = driver.findElement(By.id("size")).getSize();
		System.out.println("gheight"+hcolor.getHeight());
		System.out.println("gWidth" +hcolor.getWidth());

		System.out.println("height"+hcolor.height);
		System.out.println("Width" +hcolor.width);
}
}