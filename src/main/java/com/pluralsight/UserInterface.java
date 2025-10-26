package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    //private static final String FILE_NAME = "dealership.csv";
    private Dealership dealership;

    public void init() {

        DealerShipFileManage fileManager = new DealerShipFileManage();
        dealership = fileManager.getDealership();
    }
        // I have load dealership file is here
        // Right now I create switch case
        public void display () {
            init();

            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {


                displayMenu();
                System.out.println(" Select choice");
                int choice = scanner.nextInt();
                scanner.nextLine(); // clear input buffer

                switch (choice) {
                    case 1:
                        processGetByPriceRequest(scanner);
                        break;
                    case 2:
                        processGetByMakeModelRequest(scanner);
                        break;
                    case 3:
                        processGetByYearRequest(scanner);
                        break;
                    case 4:
                        processGetByColorRequest(scanner);
                        break;
                    case 5:
                        processGetByMileageRequest(scanner);
                        break;
                    case 6:
                        processGetByVehicleTypeRequest(scanner);
                        break;
                    case 7:
                        processGetAllVehiclesRequest(scanner);
                        break;
                    case 8:
                        processAddVehicleRequest(scanner);
                        break;
                    case 9:
                        processRemoveVehicleRequest(scanner);
                        break;
                    case 0:
                        System.out.println("Exiting... Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option, try again.");
                }
            }

            scanner.close();
        }


    public void displayMenu() {
        System.out.println("\n========= DEALERSHIP MENU =========");
        System.out.println("1. Get vehicles by price");
        System.out.println("2. Get vehicles by make/model");
        System.out.println("3. Get vehicles by year");
        System.out.println("4. Get vehicles by color");
        System.out.println("5. Get vehicles by mileage");
        System.out.println("6. Get vehicles by type");
        System.out.println("7. Show all vehicles");
        System.out.println("8. Add a vehicle");
        System.out.println("9. Remove a vehicle");
        System.out.println("0. Exit");



    }
    private void displayVehicles(ArrayList<Vehicle> allVehicles) {
        if (allVehicles.isEmpty()) {
            System.out.println("Not found any vehicle");
            return;
        }
        for (Vehicle allVehicle : allVehicles) {
            System.out.println(allVehicle);

        }
    }
// Number 1
    public void processGetByPriceRequest(Scanner scanner){
        System.out.println( " Enter the minimum price ");
        double minimumPrice = scanner.nextDouble();
        System.out.println( "Enter the maximum price");
        double maximumPrice = scanner.nextDouble();
        scanner.nextLine();

        ArrayList<Vehicle> matchingPrice = dealership.getVehiclesByPrice(minimumPrice, maximumPrice);
        displayVehicles(matchingPrice);
}
// Number 2
    public void processGetByMakeModelRequest(Scanner scanner){

        System.out.print("Enter the vehicle make vehicle: ");
        String make = scanner.nextLine();

        System.out.print("Enter the vehicle model: ");
        String model = scanner.nextLine();

        ArrayList<Vehicle> allMakeAndModel = dealership.getVehicleByMakeModel(make, model);
        if (allMakeAndModel.isEmpty())  {
            System.out.println("Not found any vehicle in the list" + make+ " " +  model);
        } else {
            displayVehicles(allMakeAndModel);
        }
}
// Number 3
    public void processGetByYearRequest(Scanner scanner) {
    System.out.println(" Chose Vehicle year");
    int Year = scanner.nextInt();
    scanner.nextLine();

    ArrayList<Vehicle> allYearVehicle = dealership.getVehiclesByYear(Year);
    if (allYearVehicle.isEmpty()) {
        System.out.println("Not found any vehicle in this year" + Year);
    } else {
        displayVehicles(allYearVehicle);
    }

}
// Number 4
    public void processGetByColorRequest(Scanner scanner){
    System.out.println( "Chose Vehicle color");
    String Color = scanner.nextLine();
    ArrayList<Vehicle> allColorVehicle = dealership.getVehiclesByColor(Color);
    if (Color.isEmpty() && Color.equalsIgnoreCase(Color)) {
        System.out.println( "Not found any vehicle in this color" + Color);
    }else {
        displayVehicles(allColorVehicle);
    }

}
// Number 5
    public void processGetByMileageRequest(Scanner scanner){

    System.out.println("Searching wth minimum mileage");
    int minMileage = scanner.nextInt();

    System.out.println("Searching wth maximum mileage");
    int maxMileage = scanner.nextInt();
    scanner.nextLine();

    ArrayList<Vehicle> allMileageVehicle = dealership.getVehiclesByMileage(minMileage,maxMileage);
    if (allMileageVehicle.isEmpty()) {
        System.out.println("Not found any vehicle in this mileage (" + minMileage + "and " + maxMileage);
    }else {
        displayVehicles(allMileageVehicle);
    }

}
// Number 6
    public void processGetByVehicleTypeRequest(Scanner scanner){
    System.out.println( "Enter the vehicle type(sedan/SUV)");
    String matchVehiclesType = scanner.nextLine();
    ArrayList<Vehicle> allTypeVehicle= dealership.getVehiclesByType(matchVehiclesType);
    if (matchVehiclesType.isEmpty() && matchVehiclesType.equalsIgnoreCase(matchVehiclesType)) {
        System.out.println("Not found any vehicle in this type");
    }else {
        displayVehicles(allTypeVehicle);
    }

}
//Number 7
public void processGetAllVehiclesRequest(Scanner scanner){
    System.out.println("Enter all vehicle");
    String AllVehicles = scanner.nextLine();
    ArrayList<Vehicle> allTVehicle = dealership.getAllVehicles();

    if (AllVehicles.isBlank() && AllVehicles.equalsIgnoreCase(AllVehicles)) {
        System.out.println("Not found any vehicle in the list");
    }else {
        displayVehicles(allTVehicle);
    }


}
public void processAddVehicleRequest(Scanner scanner){


}
public void processRemoveVehicleRequest(Scanner scanner){

}

}
