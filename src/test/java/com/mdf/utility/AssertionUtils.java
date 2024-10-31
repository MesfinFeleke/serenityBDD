package com.mdf.utility;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertionUtils extends PageObject{

    public void assertElementIsVisible(WebElement element) {
        assertTrue(element.isDisplayed(), "Element should be visible");
    }
}
