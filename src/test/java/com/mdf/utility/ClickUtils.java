package com.mdf.utility;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ClickUtils extends PageObject {

    public void clickElement(WebElement element) {
        for (int i = 0; i < 3; i++) {
            try {
                element.click();
                break; // Exit loop if successful
            } catch (Exception e) {
                // Wait a moment and retry
                waitABit(1000);
            }
        }
    }
}
