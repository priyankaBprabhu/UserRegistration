package com.bridgelabz.uservalidator;

import java.util.regex.Pattern;

public class UserValidator {
    boolean result;
    public boolean userName(String name)  {
        result = Pattern.matches("^[A-Z][a-z]{2,}", name);
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Name");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean userMail(String userMail) {
        //return Pattern.matches("^(abc)[.]?[a-z 0-9_-]{0,}[@]?(bl)[.]?(co)[.]?(in)", userMail);
        result = Pattern.matches("^(abc)([+-.]?[\\da-z])*[@][0-9a-z]+([.][a-z]{2,3}){1,2}$",userMail);
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Mail");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;

    }

    public boolean userMobileNumber(String userPhoneNumber) {
        result = Pattern.matches("^(91 )[0-9]{10}", userPhoneNumber);
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Number");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public boolean userPassword(String userPassword) {
        result = Pattern.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", userPassword);
        try {
            if(!result)
                throw new UserValidatorException( "Entered Invalid Password");
        }catch(UserValidatorException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
