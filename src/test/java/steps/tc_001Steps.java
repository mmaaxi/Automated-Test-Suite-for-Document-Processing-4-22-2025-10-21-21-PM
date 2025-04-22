package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {

    tc_001Page page = new tc_001Page();

    @Given("I am on the document upload page")
    public void i_am_on_the_document_upload_page() {
        page.navigateToDocumentUploadPage();
    }

    @When("I select the option 'cargar documentos'")
    public void i_select_the_option_cargar_documentos() {
        page.selectUploadDocumentsOption();
    }

    @Then("I should see options for single upload and multiple uploads")
    public void i_should_see_options_for_single_upload_and_multiple_uploads() {
        Assert.assertTrue(page.areUploadOptionsVisible());
    }

    @When("I choose 'carga en un solo archivo'")
    public void i_choose_carga_en_un_solo_archivo() {
        page.selectSingleUploadOption();
    }

    @Then("a single input box should be enabled for file upload")
    public void a_single_input_box_should_be_enabled_for_file_upload() {
        Assert.assertTrue(page.isSingleInputBoxEnabled());
    }

    @When("I choose 'cargar documentos por separado'")
    public void i_choose_cargar_documentos_por_separado() {
        page.selectMultipleUploadOption();
    }

    @Then("multiple input boxes should be shown for each required document")
    public void multiple_input_boxes_should_be_shown_for_each_required_document() {
        Assert.assertTrue(page.areMultipleInputBoxesVisible());
    }
}