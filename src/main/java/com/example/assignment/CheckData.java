package com.example.assignment;

public class CheckData {
    public boolean checkName(String name){
        boolean checkName = false;
        if(name.length() >= 5 && name.length() <= 30) {
            return true;
        } else{
            return checkName;
        }
    }
    public boolean checkSurname(String surname){
        boolean checkSurname = false;
        if(surname.length() >= 5 && surname.length() <= 30) {
            return true;
        } else{
            return checkSurname;
        }
    }
    public boolean checkUsername(String username){
        boolean checkUsername = false;
        if(username.length() >= 5 && username.length() <= 30) {
            return true;
        } else{
            return checkUsername;
        }
    }
    public boolean checkAddress(String address){
        boolean checkAddress = false;
        if(address.length() >= 3 && address.length() <= 20) {
            return true;
        } else{
            return checkAddress;
        }
    }
    public boolean countryChecker(String county){
        boolean checkAddress = false;
        if(county.length() >= 3 && county.length() <= 20) {
            return true;
        } else{
            return checkAddress;
        }
    }
}
