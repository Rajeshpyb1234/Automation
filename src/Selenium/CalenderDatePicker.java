package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDatePicker {

	private static final Object March = null;

	public static void main(String[] args) {
     WebDriver driver=new EdgeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     
     driver.findElement(By.id("datepicker")).click();
     
     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
     
     String aMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
     String bYear=driver.findElement(By.className("ui-datepicker-year")).getText();
     
     while(!(aMonth.equals(March) && bYear.equals(1997))) 
     {
      driver.findElement(By.xpath("//a[@data-handler='prev']"));
      aMonth=driver.findElement(By.className("ui-datepicker-month")).getText();
      bYear=driver.findElement(By.className("ui-datepicker-year")).getText();
      
	}
     // driver.findElement(By.xpath()))
}
}
