package com.stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefGoogleSearch extends BaseClass {
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
	    loadDriver();
	}
	@When("user click the searchbox")
	public void user_click_the_searchbox() {
		url("https://www.google.com/");
	}
	@When("enter the key value")
	public void enter_the_key_value()
	{WebElement search=driver.findElement(By.id("input"));
    type(search, "mobile");
    search.submit();
    }
	@Then("the user should see the search result")
	public void the_user_should_see_the_search_result() {
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	}

}
