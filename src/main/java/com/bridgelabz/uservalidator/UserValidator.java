package com.bridgelabz.uservalidator;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public  class UserValidator {
    boolean result;
    Predicate<String> userName = userName -> {
        result = userName.matches("^[A-Z][a-z]{2,}");
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Name");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;
    };

    Predicate<String> userMail = userMail -> {
        //return Pattern.matches("^(abc)[.]?[a-z 0-9_-]{0,}[@]?(bl)[.]?(co)[.]?(in)", userMail);
        result = userMail.matches("^(abc)([+-.]?[\\da-z])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$");
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Mail");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;

    };

    Predicate<String> userMobileNumber = userMobileNumber -> {
        result = userMobileNumber.matches("^(91 )[0-9]{10}");
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Number");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;
    };

    Predicate<String> userPassword = userPassword -> {
        result = userPassword.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$");
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Password");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;
    };
}
