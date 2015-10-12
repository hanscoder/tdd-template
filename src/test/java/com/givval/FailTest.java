package com.givval;

import org.junit.Test;

import static junit.framework.TestCase.fail;

public class FailTest {

    @Test
    public void should_fail() {
        fail("Write a failing Test.");
    }
}
