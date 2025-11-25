package com.core.rivision.Collection;

import java.util.*;

public class Main {
    public static void listExample(){
        //flow of collection
        //Iterable -> Collection -> List/Set/Queue -> ArrayList/LinkedList/HashSet/TreeSet/PriorityQueue classes

        //after java 21 list->SequencedList, set->SequencedSet, map->SequencedMap interfaces are introduced

        //List of names using ArrayList
        List<String> names = new ArrayList<>();
        //<String> is a generic type parameter specifying that this list will hold String objects, it's used for type safety
        //List is an interface, ArrayList is a class that implements the List interface used Polymorphism concept,
        // we can also store in Collection type but List features will not be available directly
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names List: " + names);

        //remove method is used to remove an element from the list
        names.remove("Bob");
        System.out.println("After removing Bob: " + names);

        //contains method checks if an element is present in the list
        names.contains("Alice"); // returns true

        //size method returns the number of elements in the list
        System.out.println(names.size());

        //so add method is coming from collection and specalized method like addFirst is coming from list..
        //without downcasting how am i calling addFirst method of linkedlist
        //because reference is of list type and object is of linkedlist type.. at runtime jvm will check for object type and call the method accordingly


        //traversal
        //using forEach loop
        for(String name : names){
            System.out.println(name);
        }

        //using iterator
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //using forEach method with lambda expression
        names.forEach(name -> System.out.println(name));
        //this is an java 8 feature, accepts  an consumer functional interface implementation

        //.get() method to access elements by index
        System.out.println("First name: " + names.get(0));
        //applicable only for list as its ordered collection
    }

    public static void setExample(){
        //Set of unique numbers using HashSet
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2); // Duplicate, will not be added
        numbers.add(4);// in set order is not preserved
        //set uses all methods from collection interface
        numbers.add(3);
        numbers.add(7);
        System.out.println("Numbers Set: " + numbers);

        //remove method is used to remove an element from the set
        numbers.remove(1);
        System.out.println("After removing 1: " + numbers);

        //contains method checks if an element is present in the set
        numbers.contains(2); // returns true

        //size method returns the number of elements in the set
        System.out.println(numbers.size());

        Set<Integer> numbersTree = new TreeSet<>();
        numbersTree.addAll(numbers);
        System.out.println("TreeSet (sorted): " + numbersTree); // if its common data types it sorts automatically
        //we can specify custom sorting logic using comparator interface
        //internally tree set uses red black tree data structure
    }

    public static void mapExample(){
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("One",1);
        hashMap.put("Two",2);
        hashMap.put("Three",3);
        System.out.println("HashMap: " + hashMap);
    }
    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();
    }

}
