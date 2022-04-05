package com.platzi.javatests.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void test_repeat_string_once(){
        assertEquals("hola", StringUtil.repeat("hola",1));
    }

    @Test
    public void test_repeat_multiple_times(){
        assertEquals("holaholahola", StringUtil.repeat("hola",3));
    }

    @Test
    public void test_repeat_zero_times(){
        assertEquals("", StringUtil.repeat("hola",0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_repeat_negative_times(){
        StringUtil.repeat("hola",-1);
    }

    @Test
    public void string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("Raul"));
    }

    @Test
    public void string_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_string_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_spaces_is_string_empty(){
        assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void string_several_spaces_is_string_empty(){
        assertTrue(StringUtil.isEmpty("   "));
    }




}