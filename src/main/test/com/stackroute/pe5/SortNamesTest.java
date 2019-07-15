package com.stackroute.pe5;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class SortNamesTest {

    SortNames sortNames;

    @Before
    public void  setUp() {
        sortNames = new SortNames();
    }

    @After
    public void tearDown() {
        sortNames = null;
    }

    @Test
    public void inputStringReturnsSortedString() {   //checks whether the expected output matches the result
        String input= "Harry Olive Alice Bluto Eugene";
        String result = sortNames.sortStringOfNames(input);
        String expected = "[Alice, Bluto, Eugene, Harry, Olive]";
        assertEquals(expected, result);
    }

    @Test
    public void inputNumberStringReturnsSortedString() {   //checks whether the expected output matches the result
        String input= "1234 2341 2122 5466";
        String result = sortNames.sortStringOfNames(input);
        String expected = "[1234, 2122, 2341, 5466]";
        assertEquals(expected, result);
    }

    @Test
    public void inputEmptyStringReturnNull() {   //checks whether the expected output matches the result
        String result = sortNames.sortStringOfNames("");
        assertNull(result);
    }

    @Test(expected = NullPointerException.class)  //checks for exception
    public void inputNullRaiseExceptions(){
        String result = sortNames.sortStringOfNames(null);
    }



}