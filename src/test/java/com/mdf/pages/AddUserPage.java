package com.mdf.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddUserPage extends PageObject {

    public static final By FIRSTNAME_FIELD = By.id("firstName");
    public static final By LASTNAME_FIELD = By.id("lastName");
    public static final By EMAIL_FIELD = By.id("email");
    public static final By PASSWORD_FIELD = By.id("password");

    public static final By SUBMIT_BUTTON = By.id("submit");
}
