package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("user opens the application")
	public void user_opens_the_application() {
	   
	}

	@When("user enter valid product {string} into Search TextBox Field")
	public void user_enter_valid_product_into_search_text_box_field(String string) {
	    
	}

	@And("user clicks search buttom")
	public void user_clicks_search_buttom() {
	    
	}

	@Then("user see the Results of Search Item")
	public void user_see_the_results_of_search_item() {
	  
	}

	@When("user enter invalid product {string} into Search TextBox Field")
	public void user_enter_invalid_product_into_search_text_box_field(String string) {
	    
	}

	@Then("user should get Messgae There is no product that matches the search criteria")
	public void user_should_get_messgae_there_is_no_product_that_matches_the_search_criteria() {
	    
	}

	@When("user dont enter  product into Search TextBox Field")
	public void user_dont_enter_product_into_search_text_box_field() {
	    
	}


}
