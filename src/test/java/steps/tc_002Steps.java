package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage;

    @Given("I am on the file upload page")
    public void navigateToUploadPage() {
        driver = new ChromeDriver();
        driver.get("http://example.com/upload");
        uploadPage = new tc_002Page(driver);
    }

    @When("I select a PDF or DOCX file under 50 MB")
    public void selectValidFile() {
        uploadPage.uploadFile("path/to/valid_file.pdf");
    }

    @Then("the file is uploaded and preview is displayed with name, size, and type")
    public void verifyFilePreview() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
        Assert.assertTrue(uploadPage.isFileNameDisplayed("valid_file.pdf"));
        Assert.assertTrue(uploadPage.isFileSizeDisplayed("Less than 50 MB"));
        Assert.assertTrue(uploadPage.isFileTypeDisplayed("application/pdf"));
        driver.quit();
    }
}