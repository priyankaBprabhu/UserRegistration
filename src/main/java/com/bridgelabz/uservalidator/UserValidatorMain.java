package com.bridgelabz.uservalidator;

import java.util.Scanner;

public class UserValidatorMain {

    public static void main(String[] args)  {
        UserValidator register = new UserValidator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First-Name: ");
        String firstName = sc.next();
        register.userName.test(firstName);
        System.out.println("Enter Last-Name: ");
        String lastName = sc.next();
        register.userName.test(lastName);
        System.out.println("Enter Email: ");
        String mail = sc.next();
        register.userMail.test(mail);
        System.out.println("Enter Phone Number: ");
        String number = sc.next();
        register.userMobileNumber.test(number);
        System.out.println("Enter Password: ");
        String password = sc.next();
        register.userPassword.test(password);

    }
}