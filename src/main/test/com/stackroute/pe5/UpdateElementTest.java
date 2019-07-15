package com.stackroute.pe5;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.*;
import static org.junit.Assert.*;

public class UpdateElementTest {

    UpdateElement updateElement;

    @Before
    public void setUp() {
        updateElement = new UpdateElement();
    }

    @After
    public void tearDown() {
        updateElement = null;
    }

    @Test
    public void inputListUpdateElement() {    //checks whether the expected output matches the result
        List<String> listFruits = new ArrayList<>();
        listFruits.add("apple");
        listFruits.add("grape");
        listFruits.add("melon");
        listFruits.add("berry");
        List<String> result = updateElement.updateList(listFruits,2,"orange");
        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("grape");
        expected.add("orange");
        expected.add("berry");
        assertEquals(expected,result);
        assertNotNull(updateElement);
    }

    @Test
    public void inputListDeleteAllElements() { //checks whether elements are deleted
        List<String> listFruits = new ArrayList<>();
        listFruits.add("apple");
        listFruits.add("grape");
        listFruits.add("melon");
        listFruits.add("berry");
        List<String> result = updateElement.removeElements(listFruits);
        List<String> expected = new ArrayList<>();
        assertEquals(expected,result);
    }

    @Test
    public void inputNullElementRaiseException() { //checks for exception
        List<String> listFruits = new ArrayList<>();
        listFruits.add(null);
        listFruits.add(null);
        listFruits.add(null);
        listFruits.add(null);
        List<String> result = updateElement.updateList(listFruits,0,"kiwi");
    }

}