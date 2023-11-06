package homework_week9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Program10_LineStations {
   public static void greenpark(){
       ArrayList<String> greenpark = new ArrayList<>();
       greenpark.add("Victoria");
       greenpark.add("Jubilee");
       greenpark.add("Piccadilly");
       for (String station : greenpark) {
           System.out.println("Green Park Station Serves : " + station + " Line");
       }
   }
   public static void bakerstreet() {
       ArrayList<String> bakerstreet = new ArrayList<>();
       bakerstreet.add("Bakerloo");
       bakerstreet.add("Jubilee");
       bakerstreet.add("Metropolitan");
       for (String station : bakerstreet) {
           System.out.println("Baker Street Station Serves : " + station + "Line");
       }
   }
   public static void westminster(){
       ArrayList<String> westminster = new ArrayList<>();
       westminster.add("District");
       westminster.add("Circle");
       westminster.add("Jubilee");

       for(String station : westminster){
           System.out.println("Westminster Station Serves : " + station + "Line");
       }
   }
   public static void oxfordCircus(){
       ArrayList<String> oxfordCircus = new ArrayList<>();
       oxfordCircus.add("Bakerloo");
       oxfordCircus.add("Central");
       oxfordCircus.add("Victoria");

       for (String statipn : oxfordCircus){
           System.out.println("Oxford Circus Station Serves: " + statipn + "Line");
       }
   }
   public static void bank(){
       ArrayList<String> bank = new ArrayList<>();
       bank.add("Northern");
       bank.add("DLR");
       bank.add("Central");
       bank.add("Waterloo and City");

       for (String station : bank){
           System.out.println("Bank Station Serves : " + station + "Line");
       }
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Declaring scanner object
        System.out.println("\n****** Zone 1 stations: Bank, Baker Street, Oxford Circus, Green Park, Westminister ******");
        System.out.println("\nPlease enter station name from the list to find which line serves that station: ");
        String stn = scanner.nextLine().toLowerCase();
        System.out.println("");
        scanner.close();//closing scanner object

        switch (stn){
            case "baker street":
                bakerstreet();
                break;
            case "bank":
                bank();
                break;
            case "oxford circus":
                oxfordCircus();
                break;
            case "westminster":
                westminster();
                break;
            case "green park":
                greenpark();
                break;
            default:
                System.out.println("You have enter an Invalid stationname");
                break;
        }
    }

}
