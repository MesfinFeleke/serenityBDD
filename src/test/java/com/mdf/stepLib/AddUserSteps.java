package com.mdf.stepLib;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import com.mdf.pages.AddUserPage;
import com.mdf.pages.ContactListPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.time.Duration;
import java.util.Locale;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class AddUserSteps extends UIInteractionSteps {

    @Step("I create a new user")
    public void createNewUser() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        FakeValuesService fakeValuesService = new FakeValuesService(
                Locale.ENGLISH, new RandomService());

        String email = fakeValuesService.bothify("??????##@?????.com");
        String password = fakeValuesService.bothify("?#?#?#?#?#?#?#??");

        find(AddUserPage.FIRSTNAME_FIELD).clear();
        find(AddUserPage.FIRSTNAME_FIELD).sendKeys(firstName);

        find(AddUserPage.LASTNAME_FIELD).clear();
        find(AddUserPage.LASTNAME_FIELD).sendKeys(lastName);

        find(AddUserPage.EMAIL_FIELD).clear();
        find(AddUserPage.EMAIL_FIELD).sendKeys(email);

        find(AddUserPage.PASSWORD_FIELD).clear();
        find(AddUserPage.PASSWORD_FIELD).sendKeys(password);

        find(AddUserPage.SUBMIT_BUTTON).click();

        withTimeoutOf(Duration.ofSeconds(10))
                .waitFor(presenceOfElementLocated(ContactListPage.LOGOUT_BUTTON));
    }


}
