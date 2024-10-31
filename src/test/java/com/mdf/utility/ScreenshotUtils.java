package com.mdf.utility;

import net.serenitybdd.core.pages.PageObject;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScreenshotUtils extends PageObject {

  /*  public File takeScreenshot() {
        return getDriver().getScreenshotAs(Screenshot.OutputType.FILE);
        // This will take a screenshot and save it in the target directory
       // getDriver().getScreenshotAs(OutputType.FILE);
    }

 */


    public void takeScreenshot(String pathname) throws IOException {
        File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(pathname));
    }
}
