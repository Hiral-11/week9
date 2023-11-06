package homework_week9;

/** Program 3
 * Write a Java program to reverse an array of integer values
 */
public class Program3_ReverseOfArrays {
    public static void main(String[] args) {
        reverseArray();
    }

    public static void reverseArray(){
        //initialize array
        int[] array = new int[]{11, 12, 12, 14, 15 };
        System.out.println("Original Array : ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");
        }
    }

}













