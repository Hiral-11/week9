package homework_week9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using Iterater.
 */
public class Program5_IterateArrayList {

    public static void main(String[] args) {
Program5_IterateArrayList ele = new Program5_IterateArrayList();
        ele.arrayListElement();
    }

public void arrayListElement(){
    ArrayList<String> element = new ArrayList<String>(); // Array List declartion
    element.add("Wood");
    element.add("Water");
    element.add("Fire");
    element.add("Metal");
    element.add("Air");
    element.add("Earth");
    Iterator itr = element.iterator(); //Array list method
    while (itr.hasNext()){
        System.out.println(itr.next());
    }
}
}
