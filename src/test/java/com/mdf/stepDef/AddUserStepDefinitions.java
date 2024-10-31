package com.mdf.stepDef;


import com.mdf.stepLib.AddUserSteps;
import com.mdf.stepLib.LoginSteps;
import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;

public class AddUserStepDefinitions {

    @Steps
    LoginSteps login;

    @Steps
    AddUserSteps addUser;

    @Given("I create a new user")
    public void i_create_a_new_user() {
        login.signUp();
        addUser.createNewUser();
    }
}
