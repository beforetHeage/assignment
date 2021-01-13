package com.example.assignment;

public class CheckData {

    public boolean checkName(String name){
        boolean checkName = false;
        if(name.length() >= 3 && name.length() <= 50) {
            return true;
        } else{
            return checkName;
        }
    }
    public boolean checkSurname(String surname){
        boolean checkSurname = false;
        if(surname.length() >= 3 && surname.length() <= 50) {
            return true;
        } else{
            return checkSurname;
        }
    }
    public boolean checkUsername(String username){
        boolean checkUsername = false;
        if(username.length() >= 3 && username.length() <= 50) {
            return true;
        } else{
            return checkUsername;
        }
    }
    public boolean checkAddress(String address){
        boolean checkAddress = false;
        if(address.length() >= 3 && address.length() <= 50) {
            return true;
        } else{
            return checkAddress;
        }
    }
    public boolean countryChecker(String county){
        boolean checkAddress = false;
        if(county.length() >= 3 && county.length() <= 50) {
            return true;
        } else{
            return checkAddress;
        }
    }
    public boolean zipChecker(String zip){
        boolean zipChecker = false;
        if(zip.length() >= 2 && zip.length() <= 9) {
            return true;
        } else{
            return zipChecker;
        }
    }
    public boolean checkemail(String email){
        boolean checkemail = false;
        if(email.length() >= 3 && email.length() <= 50) {
            return true;
        } else{
            return checkemail;
        }
    }
}
