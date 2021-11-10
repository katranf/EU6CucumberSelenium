package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationsMenuStepDefs {

    @When("the user click the Vehicles under the Fleet menu")
    public void the_user_click_the_Vehicles_under_the_Fleet_menu() {
        System.out.println("User clicked on Vehicles under Flees menu");
    }

    @Then("the user should be able to see Vehicles as Title")
    public void the_user_should_be_able_to_see_Vehicles_as_Title() {
        System.out.println("User is able to see Vehicles as Title");
    }

    @When("the user click the Campaings under the Marketing menu")
    public void the_user_click_the_Campaings_under_the_Marketing_menu() {
        System.out.println("User clicked on Campaigns under the Marketing menu");
    }

    @Then("the user should be able to see Campaigns as Title")
    public void the_user_should_be_able_to_see_Campaigns_as_Title() {
        System.out.println("User is able to see Campaigns as Title");
    }

    @When("the user click the Calendar Events under the Activities menu")
    public void the_user_click_the_Calendar_Events_under_the_Activities_menu() {
        System.out.println("User clicked on Calendar Events under the Activities menu");
    }

    @Then("the user should be able to see Calendar Events as Title")
    public void the_user_should_be_able_to_see_Calendar_Events_as_Title() {
        System.out.println("User is able to see Calendar Events as Title");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
    }


    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNum) {
        BrowserUtils.waitFor(3);
        ContactsPage contactsPage = new ContactsPage();
        Integer actualNumber =Integer.parseInt(contactsPage.pageNumber.getAttribute("value"));

        Assert.assertEquals(expectedPageNum,actualNumber);
    }
}
