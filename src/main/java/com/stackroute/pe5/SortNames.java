package com.stackroute.pe5;
import java.util.*;
public class SortNames {


    //    method is used to implement set interface which sorts the given randomly ordered names in ascending order

    public String sortStringOfNames(String string){
        if (string=="")return null;
        TreeSet<String> sortedSet=new TreeSet<>(Arrays.asList(string.split(" "))); //split the string and store it in a TreeSet object
        System.out.println(new ArrayList<String>(sortedSet).toString());
        return new ArrayList<String>(sortedSet).toString(); //convert the array list to string and return it
    }

}
