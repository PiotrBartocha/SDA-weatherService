package WeatherReportApp;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WeatherReport {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to WeatherReport!");
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You can choose one of the following actions");
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("1. Add a new city to the report");
        System.out.println("2. Display all cities from the database");
        System.out.println("3. Get data from weather services");
        System.out.println("4. Close the app");
        System.out.println();

        String action = getActionFromUser();

        switch (action) {
            case "1": {
                //todo
            }
            case "2": {
                //todo
            }

            case "3": {
                //todo
            }
            case "4": {
                // todo

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


}


