package homework_week9;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Program11_CompareArrayList {
    public static void main(String[] args) {
        Program11_CompareArrayList a = new Program11_CompareArrayList();
        a.compareArray();
    }
    public void compareArray(){
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Red");//First Array List
        a1.add("Green");
        a1.add("Black");
        a1.add("White");
        a1.add("Pink");

        ArrayList<String> a2 = new ArrayList<String >();
        a2.add("Red"); // Second Array list
        a2.add("Green");
        a2.add("Black");
        a2.add("Pink");

        //Comparing two arraylists
        System.out.println(a1.equals(a2));
    }
}
