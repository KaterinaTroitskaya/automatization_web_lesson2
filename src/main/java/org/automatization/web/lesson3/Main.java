package org.automatization.web.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        AuthorizationTest authorizationTest = new AuthorizationTest();
        authorizationTest.runAuthorization();
        CheckPhoneNumberTest checkPhoneNumberTest = new CheckPhoneNumberTest();
        checkPhoneNumberTest.runCheckPhoneNumber();
        LogOutTest logOutTest = new LogOutTest();
        logOutTest.runLogOutTest();
        CheckWorkingHoursTest checkWorkingHoursTest = new CheckWorkingHoursTest();
        checkWorkingHoursTest.runCheckWorkingHours();

    }
}
