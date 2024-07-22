package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationTest {

	public static void main(String[] args) {
   WebDriver driver =new EdgeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://www.automationexercise.com/");
   driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]")).click();
   driver.findElement(By.name("name")).sendKeys("rajeshpyb");
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("rajeshpyb1@gmail.com");
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
   driver.findElement(By.id("id_gender1")).click();
   driver.findElement(By.id("password")).sendKeys("Rajeshpyb@1234");
   driver.findElement(By.id("days")).click();
   driver.findElement(By.xpath("//*[@id=\"days\"]/option[24]")).click();
   driver.findElement(By.xpath("//*[@id=\"months\"]/option[3]")).click();
   driver.findElement(By.xpath("//*[@id=\"years\"]/option[26]")).click();
   driver.findElement(By.id("newsletter")).click();
   driver.findElement(By.id("first_name")).sendKeys("Rajesh");
   driver.findElement(By.id("last_name")).sendKeys("pyb");
   driver.findElement(By.id("company")).sendKeys("infosys");
   driver.findElement(By.id("address1")).sendKeys("bethamcherla");
   driver.findElement(By.id("address2")).sendKeys("kurnool dist");
   driver.findElement(By.id("state")).sendKeys("AP");
   driver.findElement(By.id("city")).sendKeys("Kurnool");
   driver.findElement(By.id("zipcode")).sendKeys("518599");
   driver.findElement(By.id("mobile_number")).sendKeys("7093431543");
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
   driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();



	}

}
