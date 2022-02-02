package d_01_02_2022;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zadatak2 {
	

	public static void main(String[] args) {
	} public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait waitForVideo = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.manage().window().maximize();
		driver.navigate().to("https://videojs.com/city");
	  @@ -49,6 +52,26 @@ public static void main(String[] args) {
	  	System.out.println("Dugme za play nije pretisnuto.");
		}

		waitForVideo.until(ExpectedConditions
				.attributeContains(By.xpath("//button[contains(@class, 'vjs-ended')]"), "title", "Replay"));
		boolean videoFinished;
		try {
			driver.findElement(By.xpath("//button[contains(@class, 'vjs-ended')]"));
			videoFinished = true;
		} catch (Exception e) {
			videoFinished = false;
		}

		if (videoFinished) {
			System.out.println("Video je gotov.");
		} else {
			System.out.println("Video nije gotov.");
		}

		Thread.sleep(3000);

		driver.close();

	}

}


