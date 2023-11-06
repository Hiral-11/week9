package homework_week9;

import java.util.ArrayList;

/*4. Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.
        */
public class Program4_ArrayListColours {

    public static void main(String[] args) {
        Program4_ArrayListColours obj = new Program4_ArrayListColours();
        obj.getColours();
    }

    public void getColours() {
        ArrayList<String> colours = new ArrayList<>(); //Array list declaration of colours
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Pink");
        colours.add("Orange");
        colours.add("Purple");

        System.out.println("These are the list of colours");
        for (String colour : colours) { // for each loop
            System.out.println(colour);
        }

    }
}
