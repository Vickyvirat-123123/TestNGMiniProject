package com.reusable;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Libraries.Base;
import com.google.inject.Key;

public class seleniumutilities extends Base {
	public Robot r;

	

	public void toclick(WebElement element) {
		element.click();

	}

	public void addtext(WebElement element, String s) {
		element.sendKeys(s);

	}

	public void downkey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public void Keyenter() {
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void dateselect(WebElement e, Integer i) {
		Select s = new Select(e);
		s.selectByIndex(i);

	}

	public void screenshot() throws IOException {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File target = new File("src\\test\\resources\\screenshot\\app.png");
		FileUtils.copyFile(source, target);
	}
}