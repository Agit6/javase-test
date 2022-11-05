package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo02_ConcurrentHashMap {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> cchMap = new ConcurrentHashMap<>();

        System.out.println(3.14);
        cchMap.put("a", 1);
        cchMap.put("a", 2);
        cchMap.put("b", 2);

        System.out.println(cchMap.get("a"));
        System.out.println(cchMap.values());
        System.out.println(cchMap.keySet());
        System.out.println(cchMap.size());

        Set<Map.Entry<String, Integer>> entrySet = cchMap.entrySet();
        System.out.println(entrySet);

        System.out.println("------------------------------------------");
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next + next.getKey() + next.getValue() + next.getClass());
            System.out.println("+++++++++++++++++");
        }

    }
}
