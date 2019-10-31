package com.interveiwpectice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDrop {

	public static void main(String[] args) {
	    System.setProperty("", "");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("");
	    driver.findElement(By.xpath("")).click();
	    
	   List<WebElement> option= driver.findElements(By.xpath(""));
	   for(int i=0;i<option.size();i++) {
		   System.out.println(option.get(i).getText());
		   if(option.get(i).getText().contains("")) {
			   option.get(i).click();
			   break;
		   }
	   }
	    
	    

	}

}
