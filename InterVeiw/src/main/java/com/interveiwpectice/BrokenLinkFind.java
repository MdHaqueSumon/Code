package com.interveiwpectice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkFind {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/mdhaque/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for (int i = 0; i < link.size(); i++) {
			WebElement element = link.get(i);
			String url = element.getAttribute("href");
			varifyLink(url);
		}

	}

	public static void varifyLink(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + "---->>>" + httpURLConnect.getResponseMessage());

			}
			if (httpURLConnect.getResponseCode() == httpURLConnect.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " ---->>>" + httpURLConnect.getResponseMessage() + "--->>>"
						+ httpURLConnect.HTTP_NOT_FOUND);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
