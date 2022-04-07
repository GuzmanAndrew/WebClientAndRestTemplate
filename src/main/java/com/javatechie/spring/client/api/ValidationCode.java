package com.javatechie.spring.client.api;

public class ValidationCode {
    private String[] errors;
    private boolean isValid;

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
