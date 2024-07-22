package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobutton {

	public static void main(String[] args) {
   WebDriver driver =new EdgeDriver();
   driver.get("https://demo.guru99.com/test/radio.html");
   driver.findElement(By.name("webform")).click();
   driver.findElement(By.id("vfb-7-2")).click();
   WebElement radio3=driver.findElement(By.id("vfb-7-3"));
   radio3.click();
	}

}
