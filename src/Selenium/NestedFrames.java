package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		 WebDriver driver=new EdgeDriver();
		    driver.get("https://demo.automationtesting.in/Frames.html");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		    driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]")).click();
		    WebElement Frame1=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		    driver.switchTo().frame(Frame1);
		    WebElement Frame2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		    driver.switchTo().frame(Frame2);
		    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("rajesh");
		    
		    
	}

}
