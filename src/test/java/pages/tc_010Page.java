package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    // Locators
    By uploadButton = By.id("uploadButton");
    By processButton = By.id("processButton");
    By slipGeneratedMessage = By.id("slipGeneratedMessage");
    By historySection = By.id("historySection");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadAndProcessDocuments() {
        driver.findElement(uploadButton).click();
        driver.findElement(processButton).click();
    }

    public boolean isSlipGenerated() {
        return driver.findElement(slipGeneratedMessage).isDisplayed();
    }

    public boolean isDataSavedInHistory() {
        return driver.findElement(historySection).isDisplayed();
    }
}