package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FBlogin {

	public static void main(String[] args) {
 WebDriver driver =new EdgeDriver();
 driver.get("https://www.facebook.com/login.php");
driver.findElement(By.id("email")).sendKeys("7093431543");
driver.findElement(By.id("pass")).sendKeys("Rajeshpyb@1234");
driver.findElement(By.name("login")).click();

	}

}
