package com.example.assignment;

public class BillingInfo {
    // Create MVC pattern Model
    private String paymentMethod;
    private String cc_name;
    private String cc_exp; //expiration date
    private String cc_number;
    private String cc_ccv;

    public BillingInfo(String paymentMethod, String cc_name, String cc_exp, String cc_number, String cc_ccv){
        this.paymentMethod = paymentMethod;
        this.cc_name = cc_name;
        this.cc_exp = cc_exp;
        this.cc_number = cc_number;
        this.cc_ccv = cc_ccv;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setCc_number(String cc_number) {
        this.cc_number = cc_number;
    }

    public void setCc_ccv(String cc_ccv) {
        this.cc_ccv = cc_ccv;
    }

    public void setCc_exp(String cc_exp) {
        this.cc_exp = cc_exp;
    }

    public void setCc_name(String cc_name) {
        this.cc_name = cc_name;
    }

    public String getCc_ccv() {
        return cc_ccv;
    }

    public String getCc_exp() {
        return cc_exp;
    }

    public String getCc_name() {
        return cc_name;
    }

    public String getCc_number() {
        return cc_number;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

}
