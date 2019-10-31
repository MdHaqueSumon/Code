package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void ss(WebDriver driver,String screenshot) throws Throwable {
		TakesScreenshot tkss=(TakesScreenshot)driver;
		File fl=tkss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl, new File("/Users/mdhaque/eclipse-workspace/GitHubProjectSumon/ScreenShot/"+screenshot+".jpg"));
	}

}
