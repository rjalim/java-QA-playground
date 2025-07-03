package org.Array_List;

import java.util.LinkedList;

public class Linked_List {

    public static void main(String[]args){
        LinkedList<String> list= new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("Z");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println(list.removeFirst());
        list.add("K");
        System.out.println(list);


    }
}
