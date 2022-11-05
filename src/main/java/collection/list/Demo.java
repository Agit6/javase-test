package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add(1);

        System.out.println(arrayList.size());

//        arrayList.remove();

        arrayList.set(1, "f");

        System.out.println(arrayList.get(3));

        arrayList.add(0, "hello");

        Iterator<Object> iterator = arrayList.iterator();
//        arrayList.remove("a"); //java.util.ConcurrentModificationException

        while (iterator.hasNext()){
            Object next = iterator.next();
//            arrayList.remove(next); //java.util.ConcurrentModificationException
            iterator.remove();
        }
        System.out.println(arrayList.size());
    }
}
