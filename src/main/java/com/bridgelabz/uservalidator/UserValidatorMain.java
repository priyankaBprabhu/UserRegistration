package com.bridgelabz.uservalidator;

import java.util.Scanner;

public class UserValidatorMain {
    static UserValidator register = new UserValidator();

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First-Name: ");
        String firstName = sc.next();
        register.userName(firstName);
        System.out.println("Enter Last-Name: ");
        String lastName = sc.next();
        register.userName(lastName);
        System.out.println("Enter Email: ");
        String mail = sc.next();
        register.userMail(mail);
        System.out.println("Enter Phone Number: ");
        String number = sc.next();
        register.userMobileNumber(number);
        System.out.println("Enter Password: ");
        String password = sc.next();
        register.userPassword(password);

    }
}