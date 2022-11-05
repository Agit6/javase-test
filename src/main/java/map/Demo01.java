package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo01 {

    public static void main(String[] args) {

        HashMap<Object, Object> map = new HashMap<>();

        map.put("a",1);
        map.put("b",2);

        Iterator<Map.Entry<Object, Object>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Object a = map.get("a");
        System.out.println(a);
        System.out.println(map.values());

    }
}
