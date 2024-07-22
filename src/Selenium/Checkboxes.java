package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkboxes {

	public static void main(String[] args) {
    WebDriver driver= new EdgeDriver();
    driver.get("https://demo.guru99.com/test/radio.html");
    List<WebElement> CHK=driver.findElements(By.xpath("//*[@type='checkbox']"));
    System.out.println(CHK.size());
    
    int i=0;
      
    while(i==0 ||  i==1  || i==2)
    {
    	CHK.get(i).click();
    	i++;
    }
    
    
    
    
   /* driver.findElement(By.id("vfb-6-0")).click();
     driver.findElement(By.id("vfb-6-1")).click();
     driver.findElement(By.id("vfb-6-2")).click();*/

	}

}
