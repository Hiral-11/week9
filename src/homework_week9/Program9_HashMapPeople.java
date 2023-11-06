package homework_week9;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */

public class Program9_HashMapPeople {

    public static void main(String[] args) {
       Program9_HashMapPeople obj = new Program9_HashMapPeople();
       obj.people();
    }

    public void people() {
        Map<String, Integer> people = new HashMap<String, Integer>();
        people.put("Victor", 18);
        people.put("John", 25);
        people.put("William", 30);
        people.put("Sam", 42);
        people.put("Roger ", 55);

        for(Map.Entry<String, Integer> entry : people.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(value + " = " + key);
          }

    }

}
