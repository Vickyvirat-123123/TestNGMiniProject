package com.stepdefinition;

import java.io.IOException;

import com.pagesss.pages123;
import com.reusable.seleniumutilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsdef  extends seleniumutilities{
	public pages123 pag ;
	
	
	@Given("the user ha launch the application")
	public void the_user_ha_launch_the_application() throws Exception {
		launching();
		Thread.sleep(10000);

		  pag = new pages123(driver);
		
	   
	}

	@When("the user click the buses icon")
	public void the_user_click_the_buses_icon() throws InterruptedException {
		
		
		toclick(pag.getClickcancel());
		
		Thread.sleep(2000);
		toclick(pag.getClickbuses());
		
	   
	}

	@Then("it should be ticket booking page")
	public void it_should_be_ticket_booking_page() {
		
	    	}

	@When("the user click the from location")
	public void the_user_click_the_from_location() {
		toclick(pag.getClickfrom());
	   	}

	@When("the user enter the from location name")
	public void the_user_enter_the_from_location_name() throws Exception {
		addtext(pag.getClickfromtext(), "Chennai");
		Thread.sleep(5000);
		downkey();
		Thread.sleep(3000);
		Keyenter();

		
		
		
	    	}

	@When("the user should click and enter the To location")
	public void the_user_should_click_and_enter_the_To_location() throws Exception {
		toclick(pag.getClickto());
		addtext(pag.getClicktotext(), "Madurai");
		Thread.sleep(3000);
		downkey();
		Thread.sleep(3000);
		Keyenter();

		
	   	}

	@When("the user should select the travel date")
	public void the_user_should_select_the_travel_date() {
		toclick(pag.getSelectdate());
		toclick(pag.getDate11());
	   	}

	@When("the user should click the search button")
	public void the_user_should_click_the_search_button() {
		toclick(pag.getClicksearch());
	    	}

	@Then("it should show the bus details and timing")
	public void it_should_show_the_bus_details_and_timing() {
	    	}

}
