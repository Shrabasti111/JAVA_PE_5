package com.stackroute.pe5;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FrequencyBoolean {

    //this function returns each word in string along with true or false, true if the string is found more than 2 times
    public String checkFrequency(String input) {

        if (input == "")
            return "Empty String is not allowed!";

        List<String> wordString = Arrays.asList(input.split("[\\W_]+")); //splits the string wherever there is a non-word character
        Map<String, Integer> map = new HashMap<>();
        for (String each : wordString) { //for each element in string list
            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1); //if map contains the key, increase it's corresponding value by one
            } else {
                map.put(each, 1); //else, put the element in map and store it's frequency as one
            }
        }

        Map<String,Boolean> anotherMap = new HashMap<>();
        for (String each : wordString) { //for each element in string list
            if (map.containsKey(each)) {
              int value = map.get(each);
              if(value >= 2){            //if the value is greater then 2
                  anotherMap.put(each,true);  //assign true
              } else {
                  anotherMap.put(each,false); //assign false
              }
            }


        }

        return anotherMap.toString(); //convert the map to string and return it
    }


}
