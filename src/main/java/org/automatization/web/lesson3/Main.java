package org.automatization.web.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        Test1 test1 = new Test1();
        test1.runAutorization();
        Test2 test2 = new Test2();
        test2.runCheckPhoneNumber();
        Test3 test3 = new Test3();
        Test4 test4 = new Test4();


    }
}
