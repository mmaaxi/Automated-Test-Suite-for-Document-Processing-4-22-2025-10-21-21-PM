Feature: Validate Slip Generation and Storage in History

  Scenario: Validate generation of 'Slip de salida' and storage in history
    Given I have completed the upload and processing of documents
    When the system generates the 'Slip de salida'
    Then the documents and extracted data should be saved in the request history