package DEN.REPOS.HashMap;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Collections {

    public static void myMap(){
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Вова");
        myMap.put(2, "Денис");
        myMap.put(3, "Артем");

        for (Map.Entry entry : myMap.entrySet())
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Ден");
        stringSet.add("Макс");
        stringSet.add("Ден");
        for( String entry : stringSet ){
            System.out.print(entry + " ");
        }
    }

}
