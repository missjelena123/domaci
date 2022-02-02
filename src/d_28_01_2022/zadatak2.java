package d_28_01_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php\r\n");
		driver.findElement(By.id("")).click();
		
		driver.findElement(By.xpath("//button[contains(@class, 'btn btn-info add-new')]")).click();

		driver.findElement(By.id("name")).sendKeys("Jelena");
		driver.findElement(By.id("department")).sendKeys("IT");
		driver.findElement(By.id("phone")).sendKeys("0665569787");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@data-original-title, 'Add')]")).click();
	}
	}


