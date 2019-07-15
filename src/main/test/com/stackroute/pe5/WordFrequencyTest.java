package com.stackroute.pe5;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class WordFrequencyTest {

    WordFrequency wordFrequency;

    @Before
    public void setUp() {
        wordFrequency = new WordFrequency();
    }

    @After
    public void tearDown() {
        wordFrequency = null;
    }

    @Test
    public void inputStringReturnFrequency() {        //checks whether the expected output matches the result
        String input = "one one -one___two,,three,one @three*one?two";
        String result = wordFrequency.checkFrequency(input);
        String expected = "{one=5, two=2, three=2}";
        assertEquals(expected, result);
    }

    @Test
    public void inputAnotherStringReturnFrequency() {        //checks whether the expected output matches the result
        String input = "one one -one___two,,three,one three,one?two, 77  . 77";
        String result = wordFrequency.checkFrequency(input);
        String expected = "{77=2, one=5, two=2, three=2}";
        assertEquals(expected, result);
    }

    @Test
    public void inputEmptyStringReturnNull() {       //checks whether the expected output matches the result
        String result = wordFrequency.checkFrequency("");
        assertEquals("Empty String is not allowed!",result);
    }

    @Test(expected = NullPointerException.class)  //checks for exception
    public void inputNullRaiseExceptions() {
        String result = wordFrequency.checkFrequency(null);
    }

}