import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import java.util.Arrays;



public class test1 {
    public static void main (String[] args) {
        System.out.println("Hello, World!");

        // Create a new instance of the class
        test1 qs = new test1();


        // create array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // declare array of integers of size n
        int[] arr2 = new int[10];
        // declare array of integers of size n and initialize all values to 1
        int[] arr3 = new int[10];
        Arrays.fill(arr3, 1);

        //size of array
        





        // example of arrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        // iterate through the list
        for (String s : list) {
            System.out.println(s);
        }
        //push front of list
        list.add(0, "C");
        //pop front of list
        list.remove(0);
        //push back of list
        list.add("D");
        //pop back of list
        list.remove(list.size() - 1);

        // remove at index i
        int i=0;
        list.remove(i);
        // find value
        if (list.contains("A")) {
            System.out.println("A exists");
        }   
        // check if list is empty
        if (list.isEmpty()) {
            System.out.println("list is empty");
        }
        // get size of list
        int size = list.size();
        // clear list
        list.clear();










         
        // example of HashMap
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "B");
        map.put("B", "C");
        // iterate through the map
        for (String s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }
        //find value by key
        String value = map.get("A");
        //find key by value
        String key = null;
        for (String s : map.keySet()) {
            if (map.get(s).equals("B")) {
                key = s;
                break;
            }
        }
        //remove key-value pair
        map.remove("A");
        //check if key exists
        if (map.containsKey("A")) {
            System.out.println("A exists");
        }
        //check if value exists
        if (map.containsValue("B")) {
            System.out.println("B exists");
        }
        //check if map is empty
        if (map.isEmpty()) {
            System.out.println("map is empty");
        }
        //get size of map
        int siz = map.size();
        //clear map
        map.clear();
        







        // example of HashSet
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        // iterate through the set
        for (String s : set) {
            System.out.println(s);
        }
        //push front of set
        set.add("C");
        //pop front of set
        set.remove("C");
        //push back of set
        set.add("D");
        //pop back of set
        set.remove("D");
        //find value
        if (set.contains("A")) {
            System.out.println("A exists");
        }
        //check if set is empty
        if (set.isEmpty()) {
            System.out.println("set is empty");
        }
        //get size of set
        // int sizes = set.size();
        //clear set
        set.clear();






        // example of LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");

        //iterate through the linkedList

        for (String s : linkedList) {
            System.out.println(s);
        }
        //push front of linkedList
        linkedList.addFirst("C");
        //pop front of linkedList
        linkedList.removeFirst();
        //push back of linkedList
        linkedList.addLast("D");
        //pop back of linkedList
        linkedList.removeLast();
        //remove at index i
        linkedList.remove(i);
        //find value
        if (linkedList.contains("A")) {
            System.out.println("A exists");
        }
        //check if linkedList is empty
        if (linkedList.isEmpty()) {
            System.out.println("linkedList is empty");
        }
        //get size of linkedList
        int sizel = linkedList.size();
        //clear linkedList
        linkedList.clear();







        // example of PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("A");
        queue.add("B");

        //iterate through the queue
        for (String s : queue) {
            System.out.println(s);
        }
        //push front of queue
        queue.add("C");
        //pop front of queue
        queue.remove();
        //push back of queue
        queue.add("D");
        //pop back of queue
        queue.remove();
        //remove at index i
        queue.remove(i);
        //find value
        if (queue.contains("A")) {
            System.out.println("A exists");
        }
        //check if queue is empty   
        if (queue.isEmpty()) {
            System.out.println("queue is empty");
        }
        //get size of queue
        int sizeq = queue.size();
        //clear queue
        queue.clear();









        // example of Stack
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        //top element of stack
        String top = stack.peek();
        

        //iterate through the stack
        for (String s : stack) {
            System.out.println(s);
        }
        //push front of stack
        stack.push("C");
        //pop front of stack
        stack.pop();
        //push back of stack
        stack.push("D");
        //pop back of stack
        stack.pop();
        //remove at index i
        stack.remove(i);
        //find value
        if (stack.contains("A")) {
            System.out.println("A exists");
        }
        //check if stack is empty

        if (stack.isEmpty()) {
            System.out.println("stack is empty");
        }

        //get size of stack
        int sizes = stack.size();
        //clear stack
        stack.clear();

        String s="abscljsadf";

        for(var x:s.toCharArray()){
            System.out.println(x);
        }







        // example of Vector
        Vector<String> vector = new Vector<String>();
        vector.add("A");
        vector.add("B");

        //push front of the vector
        vector.insertElementAt("C", 0);
        //pop back of the vector
        vector.removeElementAt(vector.size() - 1);
        //push back of the vector
        vector.add("D");    
        //pop back of the vector
        vector.removeElementAt(vector.size() - 1);
        //remove at index i
        vector.removeElementAt(i);
        //find value
        if (vector.contains("A")) {
            System.out.println("A exists");
        }
        //check if vector is empty
        if (vector.isEmpty()) {
            System.out.println("vector is empty");
        }
        //get size of vector
        int sizev = vector.size();
        //clear vector

        vector.clear();
        
        
        
        

       





        
       
    }
    
}
