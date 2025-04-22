Feature: Validate file upload with valid format and preview

  Scenario: Upload a valid PDF/DOCX file and view preview
    Given I am on the file upload page
    When I select a PDF or DOCX file under 50 MB
    Then the file is uploaded and preview is displayed with name, size, and type