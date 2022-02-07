package d_03_02_2022;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak2 {


		public static void main(String[] args) throws InterruptedException {
			

			System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;

			driver.manage().window().maximize();
			driver.navigate().to("https://www.wikipedia.org/");

			List<WebElement> elementi = driver.findElements(By.xpath("//div[contains(@class, 'central-featured')]//a"));

			for (int i = 0; i < elementi.size(); i++) {
				js.executeScript("window.open(arguments[0]);", elementi.get(i));
			}
	        Thread.sleep(2000);
			driver.quit();

		}

	}


