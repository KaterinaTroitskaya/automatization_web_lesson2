package org.automatization.web.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        AuthorizationTest authorizationTest = new AuthorizationTest();
        authorizationTest.runAuthorization();
        CheckContacts checkContacts = new CheckContacts();
        checkContacts.runCheckContacts();
        LogOutTest logOutTest = new LogOutTest();
        logOutTest.runLogOutTest();
        CheckContacts2 checkContacts2 = new CheckContacts2();
        checkContacts2.runCheckContacts2();

    }
}
