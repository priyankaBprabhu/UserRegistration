package com.bridgelabz.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {
    public boolean userName(String name) {
        return Pattern.matches("^[A-Z][a-z]{2,}", name);
    }

    public boolean userMail(String userMail) {
        //return Pattern.matches("^(abc)[.]?[a-z 0-9_-]{0,}[@]?(bl)[.]?(co)[.]?(in)", userMail);
        return Pattern.matches("^(abc)([+-.]?[\\da-z])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$",userMail);

    }

    public boolean userMobileNumber(String userPhoneNumber) {
        return Pattern.matches("^(91 )[0-9]{10}", userPhoneNumber);
    }

    public boolean userPassword(String userPassword) {
        return Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", userPassword);
    }
}
