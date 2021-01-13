package com.example.assignment;
public class BillingView {
    //MVC View model
    BillingInfo billingInfo;
    public String BillingInfo(String paymentMethod,String cc_name,String cc_exp,String cc_number,String cc_ccv){
        String rand = "";
        rand += "Your payment details:\n";
        rand += "PaymentMethod: " + paymentMethod + '\n';
        rand += "Card number: " + cc_number.substring(0,4) + "********" + cc_number.substring(12,16) + '\n';
        rand += "Expiration Date:" + cc_exp + '\n';
        rand += "Name: " + cc_name + '\n';
        rand += "CCV Code: " + cc_ccv;
        return rand;
    }

}
