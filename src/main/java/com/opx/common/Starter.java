package com.opx.common;

import org.testng.TestNG;

/**
 * eroshenkoam
 * 02.08.17
 */
public class Starter {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.setTestClasses(new Class[]{SimpleTest.class});
        testNG.run();
    }
}
