package com.pagesss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Libraries.Base;
import com.reusable.seleniumutilities;

public class pages123 extends Base {
	public seleniumutilities si;

	public pages123(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//i[@class='wewidgeticon we_close']")
	WebElement addclose;
	
	@FindBy(xpath = "//span[@class='commonModal__close']")
	WebElement clickcancel;
	
	@FindBy(xpath = "(//span[@data-cy='item-wrapper'])[6]")
	WebElement clickbuses;
	@FindBy(xpath = "//input[@id='fromCity']")
	WebElement clickfrom;
	
	@FindBy(xpath = "//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	WebElement clickfromtext;
	
	@FindBy(xpath = "//label[@for='toCity']")
	WebElement clickto;
	@FindBy(xpath = "//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	WebElement clicktotext;
	
	
	

	@FindBy(xpath = "//span[@class='font30 latoBlack']")
	WebElement selectdate;
	@FindBy(xpath = "//div[@aria-label='Sat Nov 11 2023']")
	WebElement date11;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	WebElement clicksearch;

	



	public WebElement getClickcancel() {
		return clickcancel;
	}

	public WebElement getDate11() {
		return date11;
	}

	public seleniumutilities getSi() {
		return si;
	}

	public WebElement getClickbuses() {
		return clickbuses;
	}

	public WebElement getClickfrom() {
		return clickfrom;
	}

	public WebElement getClickto() {
		return clickto;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getClicksearch() {
		return clicksearch;
	}

	public WebElement getClickfromtext() {
		return clickfromtext;
	}

	

	public WebElement getClicktotext() {
		return clicktotext;
	}

	public WebElement getAddclose() {
		return addclose;
	}

}
