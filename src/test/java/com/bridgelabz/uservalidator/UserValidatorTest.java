package com.bridgelabz.uservalidator;

import junit.framework.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProperFormat_ShouldReturnTrue()  {
        UserValidator obj = new UserValidator();
        boolean result = obj.userName.test("Priya");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProperFormat_ShouldReturnFails()  {
        UserValidator obj = new UserValidator();
        boolean result = obj.userName.test("iya");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProperFormat_ShouldReturnTrue()  {
        UserValidator obj = new UserValidator();
        boolean result = obj.userName.test("Developer");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProperFormat_ShouldReturnFails()  {
        UserValidator obj = new UserValidator();
        boolean result = obj.userName.test("abc");
        Assert.assertFalse(result);
    }


    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userMail.test("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userMail.test("abc.x.co.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenValidFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userMobileNumber.test("91 6405786859");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenInValidFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userMobileNumber.test("91 64057868");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userPassword.test("hjhhGHJ1n@d");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotInProperFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userPassword.test("hjhhGHJ1d");
        Assert.assertFalse(result);

    }

}


