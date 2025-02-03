package org.selenium.cucumber.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.sound.midi.Soundbank;

public class FirstStepDefination {

    @Given("User should on login page")
    public void user_should_on_login_page() {
        System.out.println("User should on login page");
    }
    @When("User inter valid user name and password")
    public void user_inter_valid_user_name_and_password() {
        System.out.println("User enter valid user name password");
    }
    @When("click on submit button")
    public void click_on_submit_button() {
        System.out.println("Submit the form");
    }
    @Then("Dispply the succefully login message")
    public void dispply_the_succefully_login_message() {
        System.out.println("display the Massage once login succefully");
    }

    @Given ("User on Facebook website")
    public void landing_page(){
        System.out.println("User should be facebook landong page ");
    }

    @When ("User Should enter facebook user name <"user"> and password <password>")
    public void loginDemo(){
        System.out.println("Enter Valid credintial");
    }

    @Then ("User navigate to home page")
    public void message(){
        System.out.println("Massge facebook");
    }






}
