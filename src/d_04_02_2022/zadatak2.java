package d_04_02_2022;

public class zadatak2 {

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

	WebDriver driver;

	public Helper(WebDriver driver) {
		this.driver = driver;
	}

	public boolean elementExists(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements.size() > 0;
	}

	public void clickOnElementByJS(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", driver.findElement(locator));
	}
}
