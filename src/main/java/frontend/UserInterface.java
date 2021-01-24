package frontend;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserInterface {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to WeatherReport!");
        System.out.println();

        while (true) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("You can now choose one of the following actions");
            TimeUnit.SECONDS.sleep(1);
            System.out.println();
            System.out.println("1. Add a new city to the report");
            System.out.println("2. Display all cities from the database");
            System.out.println("3. Get data from weather services");
            System.out.println("4. Close the app");
            System.out.println();

            String action = getActionFromUser();

            switch (action) {
                case "1":
                    addNewLocation();
                    break;
                case "2":
                    displayAllLocations();
                    break;
                case "3":
                    getDataFromWeatherServices();
                    break;
                case "4":
                    System.out.println("Allright! Bye!");
                    return;
            }
        }
    }


    private static String getActionFromUser() {
        Scanner scanner = new Scanner(System.in);
        String actionID;

        do {
            System.out.println("Please choose the action number");
            actionID = scanner.nextLine();
        } while (!actionID.equals("1") && !actionID.equals("2") && !actionID.equals("3") && !actionID.equals("4"));

        return actionID;
    }

    private static void addNewLocation() {
        String name, latitude, longitude, country, region;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put the name of a city you want to add:");
        name = scanner.nextLine();
        if (name.equals("")) {
            do {
                System.out.println("City name cannot be empty!");
                System.out.println("Please put the name of a city you want to add:");
                name = scanner.nextLine();
            } while (name.equals(""));
        }
        System.out.println("Please put the city's longitude:");
        longitude = scanner.nextLine();
        System.out.println("Please provide the city's latitude:");
        latitude = scanner.nextLine();
        System.out.println("Please put the name of the country the city is in:");
        country = scanner.nextLine();
        if (country.isBlank()) {
            do {
                System.out.println("Country name cannot be empty!");
                System.out.println("Please put the name of the country the city is in:");
                country = scanner.nextLine();
            } while (country.isBlank());
        }
        System.out.println("Please put the name of the region the city is in:");
        region = scanner.nextLine();

        System.out.println("City has been successfully added!");
    }


    private static void displayAllLocations() {
    }

    private static void getDataFromWeatherServices() {
    }
}


