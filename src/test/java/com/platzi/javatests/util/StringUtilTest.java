package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void test_repeat_string_once(){
        Assert.assertEquals("hola", StringUtil.repeat("hola",1));
    }

    @Test
    public void test_repeat_multiple_times(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola",3));
    }

    @Test
    public void test_repeat_zero_times(){
        Assert.assertEquals("", StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_repeat_negative_times(){
        StringUtil.repeat("hola",-1);
    }


}