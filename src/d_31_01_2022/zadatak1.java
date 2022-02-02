package d_31_01_2022;
import java.awt.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadatak1 {

	public static void main(String[] args) {
	

         System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();

				driver.navigate().to("https://s.bootsnipp.com/iframe/Dq2X");

				List elementi = (List) driver.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));



				for (int i = 1; i <= elementi.size(); i++) {
					driver.findElement(By.xpath("//*[contains(@class, 'col-md-12')]//div[last()]/button")).click();
					Thread.sleep(1000);
					List brisanjaElemenata = (List) driver
							.findElements(By.xpath("//*[contains(@class, 'col-md-12')]//button"));
					if (brisanjaElemenata.size() == elementi.size() - i) {
						System.out.println("Obrisan je element.");
					} else {
						System.out.println("Nije obrisan element.");
					}
				}

				driver.close();

			}

		}

	


