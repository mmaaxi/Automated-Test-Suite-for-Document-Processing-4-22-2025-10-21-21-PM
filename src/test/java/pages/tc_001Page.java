package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_001Page {

    WebDriver driver;
    WebDriverWait wait;

    By uploadDocumentsOption = By.id("uploadDocumentsOption");
    By singleUploadOption = By.id("singleUploadOption");
    By multipleUploadOption = By.id("multipleUploadOption");
    By singleInputBox = By.id("singleInputBox");
    By multipleInputBoxes = By.cssSelector(".multipleInputBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void selectUploadDocumentsOption() {
        driver.findElement(uploadDocumentsOption).click();
    }

    public boolean areUploadOptionsVisible() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(singleUploadOption));
        wait.until(ExpectedConditions.visibilityOfElementLocated(multipleUploadOption));
        return driver.findElement(singleUploadOption).isDisplayed() && driver.findElement(multipleUploadOption).isDisplayed();
    }

    public void selectSingleUploadOption() {
        driver.findElement(singleUploadOption).click();
    }

    public boolean isSingleInputBoxEnabled() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(singleInputBox));
        return driver.findElement(singleInputBox).isEnabled();
    }

    public void selectMultipleUploadOption() {
        driver.findElement(multipleUploadOption).click();
    }

    public boolean areMultipleInputBoxesVisible() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(multipleInputBoxes));
        return driver.findElements(multipleInputBoxes).size() > 0;
    }
}