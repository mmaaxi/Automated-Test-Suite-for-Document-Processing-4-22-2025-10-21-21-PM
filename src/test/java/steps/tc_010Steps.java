package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {
    tc_010Page page = new tc_010Page();

    @Given("I have completed the upload and processing of documents")
    public void i_have_completed_the_upload_and_processing_of_documents() {
        page.uploadAndProcessDocuments();
    }

    @When("the system generates the 'Slip de salida'")
    public void the_system_generates_the_slip_de_salida() {
        boolean isGenerated = page.isSlipGenerated();
        Assert.assertTrue("Slip de salida should be generated", isGenerated);
    }

    @Then("the documents and extracted data should be saved in the request history")
    public void the_documents_and_extracted_data_should_be_saved_in_the_request_history() {
        boolean isSavedInHistory = page.isDataSavedInHistory();
        Assert.assertTrue("Documents and extracted data should be saved in history", isSavedInHistory);
    }
}