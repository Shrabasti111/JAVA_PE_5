package com.stackroute.pe5;
import java.util.Map;

public class ExchangeValues {

        //     If the key `val1` has a value, set the key `val2` to have that value, and
        //         Set the key `val1` to have the value `" "` (empty string).
        public String exchange(Map<String, String> map) {
            if(map == null) {
                return null;
            }
            String value = map.get("val1");
            map.replace("val2",value); //replace val2 with value of val1
            map.replace("val1"," ");  //replace value of val1 with empty
            return map.toString();
        }


}
