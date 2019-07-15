package com.stackroute.pe5;
import java.util.*;
public class UpdateElement {

      //this function updates an element at a specific position with a new element
      public List<String> updateList(List<String> fruitsList, int indexOfElement, String newElement) {

          fruitsList.set(indexOfElement, newElement); //assigns the new element to the given position

          return fruitsList;

      }

      //this functions removes all element and returns an empty list
      public List<String> removeElements(List<String> fruitsList) {
          fruitsList.clear();
          return fruitsList;
      }

}
