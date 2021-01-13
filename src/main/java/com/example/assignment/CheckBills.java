package com.example.assignment;

public class CheckBills {
    public static boolean checkBill(String cc_number, String cc_ccv){
        return cc_number.length() == 16 && cc_ccv.length() == 3;
    }
}
