package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver =new EdgeDriver();
     driver.get("https://demo.automationtesting.in/Alerts.html");
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
     driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
     Thread.sleep(2000);
     driver.switchTo().alert().accept();
     
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
     driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
     Thread.sleep(2000);
     driver.switchTo().alert().dismiss();
     
     driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
     driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
     Thread.sleep(2000);
     Alert ALTWIN= driver.switchTo().alert();
     ALTWIN.sendKeys("techqflow");
     ALTWIN.accept();


	}

}
