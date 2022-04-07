package com.javatechie.spring.client.api;

public class ParseResult {
    private Integer condifence;
    private DriverLicense driverLicense;
    private String errorMessage;
    private String reference;
    private boolean success;
    private ValidationCode validationCode;

    public Integer getCondifence() {
        return condifence;
    }

    public void setCondifence(Integer condifence) {
        this.condifence = condifence;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ValidationCode getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(ValidationCode validationCode) {
        this.validationCode = validationCode;
    }
}
