package homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */


public class Program7_EmptyArray {
    public static void main(String[] args) {
        arrayEmpty(); //static to static direct calling
    }
    //Declare static method
    public static void arrayEmpty(){
        ArrayList<Integer> arr = new ArrayList<Integer>(10);// creating an empty Integer Arraylist
        boolean ans = arr.isEmpty(); // check if list is empty or not
        if (ans == true){
            System.out.println("The ArrayList is empty");
        }else {
            System.out.println("The ArrayList is not empty");
        }
        arr.add(1);// addition of a element to Arraylist
        if (ans == true){
            System.out.println("The Arraylist is empty");
        }else {
            System.out.println("The Array list is not empty");
        }
    }
}
