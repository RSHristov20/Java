package FifthOfMarch;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Map<String, Map<String, Map<String, Integer>>> mymap = new HashMap();
        mymap.put("123", new HashMap());
        ((Map)mymap.get("123")).put("456", new HashMap());
        ((Map)((Map)mymap.get("123")).get("456")).put("789", 1000);
        System.out.println(((Map)((Map)mymap.get("123")).get("456")).get("789"));
        Map<String, String> carPlates = new HashMap();
        carPlates.put("PH23432424", "BMW");
        carPlates.put("PH23432444", "Opel");
        carPlates.put("PH23432824", "Mer");
        carPlates.put("PH23432024", "Audi");
        carPlates.putIfAbsent("PH23432424", "Hel");
        System.out.printf((String)carPlates.get("PH23432424"));
        Set<String> keys = carPlates.keySet();
        Iterator var4 = keys.iterator();

        String val;
        while(var4.hasNext()) {
            val = (String)var4.next();
            System.out.println(val + " - " + (String)carPlates.get(val));
        }

        var4 = carPlates.values().iterator();

        while(var4.hasNext()) {
            val = (String)var4.next();
            System.out.println(val);
        }

        var4 = carPlates.entrySet().iterator();

        while(var4.hasNext()) {
            Map.Entry<String, String> entry = (Map.Entry)var4.next();
            PrintStream var10000 = System.out;
            String var10001 = (String)entry.getKey();
            var10000.println(var10001 + " " + (String)entry.getValue());
        }

    }
}
