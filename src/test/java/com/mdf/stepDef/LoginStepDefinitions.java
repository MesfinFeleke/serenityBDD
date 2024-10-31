package com.mdf.stepDef;

import com.mdf.stepLib.LoginSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    LoginSteps login;

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        login.openLoginPage();
    }

}
