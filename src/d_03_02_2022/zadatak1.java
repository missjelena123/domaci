package d_03_02_2022;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	 

public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Scanner s = new Scanner(System.in);

		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");

		WebElement e = driver.findElement(By.tagName("body"));
		js.executeScript("arguments[0].style='background: red';", e);
		Thread.sleep(2000);

		System.out.println("Unesite zeljenu boju: ");
		String boja = s.next();

		js.executeScript("arguments[0].style='background:' + arguments[1];", e, boja);

	}



	}


