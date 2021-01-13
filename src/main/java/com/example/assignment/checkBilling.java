package com.example.assignment;

public class checkBilling {
    //MVC Controller for setting billing view information and output
    private final BillingInfo billInfo;
    private BillingView billview;

    public checkBilling(BillingView billview, BillingInfo billInfo){
        this.billInfo = billInfo;
        this.billview = billview;
    }
    public void setBillname(String billname){
        billInfo.setCc_name(billname);
    }
    public void setBillcard(String billcard){
        billInfo.setCc_number(billcard);
    }
    public void setBillCCV(String billCCV){
        billInfo.setCc_ccv(billCCV);
    }
    public void setBillexp(String billexp){
        billInfo.setCc_exp(billexp);
    }
    public void setBillpay_method(String billpay_method){
        billInfo.setPaymentMethod(billpay_method);
    }
    public String getBillName(){
        return billInfo.getCc_name();
    }
    public String getBillcard(){
        return billInfo.getCc_number();
    }
    public String getBillCCV(){
        return billInfo.getCc_ccv();
    }
    public String getBillexp(){
        return billInfo.getCc_exp();
    }
    public String getBillpay_method(){
        return billInfo.getPaymentMethod();
    }
}
