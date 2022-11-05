package collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("abc");
        treeSet.add("bac");
        treeSet.add("dab");
        treeSet.add("acb");
        treeSet.add("cab");

        System.out.println(treeSet.size());

        for (String s:treeSet) {
            System.out.println(s);
        }
        treeSet.clear();
    }
}
