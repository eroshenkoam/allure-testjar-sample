package com.opx.common;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

/**
 * eroshenkoam
 * 02.08.17
 */
public class SimpleTest {

    @Test
    public void simpleTest() {
        firstStep();
    }

    @Step
    public void firstStep() {

    }
}
