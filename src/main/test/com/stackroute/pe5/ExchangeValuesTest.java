package com.stackroute.pe5;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import static org.junit.Assert.*;

public class ExchangeValuesTest {

    ExchangeValues exchangeValues;

    @Before
    public void setUp() {
        exchangeValues = new ExchangeValues();
    }

    @After
    public void tearDown() {
        exchangeValues = null;
    }

    @Test
    public void inputMapReturnString() {   //checks whether the expected output matches the result
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("val1","java");
        stringMap.put("val2","c++");
        String result = exchangeValues.exchange(stringMap);
        String expected = "{val2=java, val1= }";
        assertEquals(expected, result);

    }

    @Test
    public void inputMap2ReturnString() {   //checks whether the expected output matches the result
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("val1","mars");
        stringMap.put("val2","saturn");
        String result = exchangeValues.exchange(stringMap);
        String expected = "{val2=mars, val1= }";
        assertEquals(expected, result);

    }

    @Test
    public void inputNullRaiseException() {  //checks for exception
        String result = exchangeValues.exchange(null);
        assertNull(result);
    }



}