Feature: Validate Document Upload Mode Selection

  Scenario: Verify upload mode selection functionality
    Given I am on the document upload page
    When I select the option 'cargar documentos'
    Then I should see options for single upload and multiple uploads
    When I choose 'carga en un solo archivo'
    Then a single input box should be enabled for file upload
    When I choose 'cargar documentos por separado'
    Then multiple input boxes should be shown for each required document