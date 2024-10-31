package com.mdf.stepDef;

import com.mdf.stepLib.ContactListSteps;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class ContactListStepDefinitions {

    @Steps
    ContactListSteps contactList;

    @Then("I log out")
    public void i_log_out() {
        contactList.logOut();
    }
}
