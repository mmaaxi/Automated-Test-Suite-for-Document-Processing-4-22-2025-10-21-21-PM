package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    By uploadInput = By.id("file-upload");
    By previewSection = By.id("file-preview");
    By fileNameElement = By.id("file-name");
    By fileSizeElement = By.id("file-size");
    By fileTypeElement = By.id("file-type");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(filePath);
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewSection).isDisplayed();
    }

    public boolean isFileNameDisplayed(String fileName) {
        return driver.findElement(fileNameElement).getText().equalsIgnoreCase(fileName);
    }

    public boolean isFileSizeDisplayed(String fileSize) {
        return driver.findElement(fileSizeElement).getText().equalsIgnoreCase(fileSize);
    }

    public boolean isFileTypeDisplayed(String fileType) {
        return driver.findElement(fileTypeElement).getText().equalsIgnoreCase(fileType);
    }
}