package homework_week9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Program6_RetrieveElement {

    public static void main(String[] args) { //Main method

        specificIndex();
    }
    public static void specificIndex(){
        ArrayList<String> list_Strings = new ArrayList<String>(); // Declaration of Array list
        list_Strings.add("Books");
        list_Strings.add("Pens");
        list_Strings.add("Pencils");
        list_Strings.add("Erasers");
        list_Strings.add("Sharpers");
        System.out.println(list_Strings);
        int a;
        Scanner scanner = new Scanner(System.in); //scanner declaration
        System.out.println("Please enter number between 0 to 4 to identify elements at specific index: ");
        a = scanner.nextInt();
        if (a < 0 || a > 4){
            System.out.println("Index " + a + " is out of bounds");
        }else {
            String element = list_Strings.get(a);
            System.out.println("\nElement at index " + a + " is " + "\"" + element + "\"");
        }
        scanner.close(); //closing scanner object
    }
}
