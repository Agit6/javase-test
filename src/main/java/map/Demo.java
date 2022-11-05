package map;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Map<Object, Object> hashMap = new HashMap<>();

        hashMap.put("a",1);
        hashMap.put("b",1);
        hashMap.put("c",1);

        Collection<Object> values = hashMap.values();

        for (Object o :
                values) {
            System.out.println(o);
        }

        Set<Map.Entry<Object, Object>> entrySet = hashMap.entrySet();

        Set<Object> keySet = hashMap.keySet();

        for (Object s:keySet) {
            System.out.println(s);
        }

        Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<Object, Object> node = iterator.next();
            Object key = node.getKey();
            Object value = node.getValue();
            System.out.println(node);

        }

        for (Map.Entry<Object, Object> me : entrySet) {

            Object key = me.getKey();
            Object value = me.getValue();
            System.out.println(key + "-->" + value);

        }
    }

}
