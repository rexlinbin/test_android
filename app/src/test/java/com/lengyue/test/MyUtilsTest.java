package com.lengyue.test;

import org.junit.Assert;
import org.junit.Test;

public class MyUtilsTest {

    @Test
    public void add() {
        Assert.assertEquals(3,MyUtils.add(1,2));
    }

    @Test
    public void plus() {
        Assert.assertEquals(30,MyUtils.plus(10,3));
    }
}