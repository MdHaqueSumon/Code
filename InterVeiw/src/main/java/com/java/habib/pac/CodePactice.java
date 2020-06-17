package com.java.habib.pac;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CodePactice {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver","/Users/mdhaque/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		ChromeOptions option =new ChromeOptions();
		option.setHeadless(false);
		driver= new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("")).getCssValue("color");
		driver.findElement(By.xpath("")).getCssValue("fornt size");
		
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		Wait <WebDriver> fl= new FluentWait<WebDriver>(driver);
		wait.withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(Exception.class);
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		action.contextClick();
		action.clickAndHold(driver.findElement(By.xpath(""))).build().perform();
		action.doubleClick();
		action.dragAndDrop(driver.findElement(By.xpath("")), driver.findElement(By.xpath(""))).build().perform();
		action.click();
		
		Select select=new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");
		
		List<WebElement> element = driver.findElements(By.xpath(""));
		for(int i=0; i<element.size(); i++) {
			element.get(i).getText();
			if(element.get(i).getText().contains("")) {
				element.get(i).click();
				break;
			}
		}
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		String parent=driver.getWindowHandle();
		Set <String>allWindow= driver.getWindowHandles();
		for(String child:allWindow) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.close();
			}
		}
		Alert alert= driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.getText();
		alert.sendKeys("");
		
		
		boolean check= driver.findElement(By.xpath("")).isDisplayed();
		driver.findElement(By.xpath("")).isEnabled();
		driver.findElement(By.xpath("")).isSelected();
		
		driver.switchTo().activeElement().sendKeys("");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		ts.getScreenshotAs(OutputType.FILE);
		
		JavascriptExecutor js= (JavascriptExecutor )driver;
		js.executeScript("scroll(0,400)");
		
		
		js.executeScript("", driver.findElement(By.xpath("")));
		
		List <WebElement> allTag=driver.findElements(By.tagName("a"));
		for(int i=0; i<allTag.size();i++) {
			allTag.get(i).getText();
			if(allTag.get(i).getText().contains("")) {
				allTag.get(i).click();
			}
		}
		

}}


