package com.mdf.stepLib;

import com.mdf.pages.ContactListPage;
import com.mdf.pages.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class ContactListSteps extends UIInteractionSteps {


    @Step("I log out")
    public void logOut() {
        find(ContactListPage.LOGOUT_BUTTON).click();

        withTimeoutOf(Duration.ofSeconds(10))
                .waitFor(presenceOfElementLocated(LoginPage.SIGNUP_BUTTON));
    }
}
