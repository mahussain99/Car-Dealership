package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

public class DealerShipFileManage {

    private static final String FILE_NAME = "dealership.csv";

    public Dealership getDealership() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            // First line: dealership info
            // I have create one header

            String header = reader.readLine();
            if (header == null || header.isEmpty()) {
                System.out.println("File is empty.");
                return null;
            }
            String[] dealerFields = header.split("\\|");
            String name = dealerFields[0];
            String address = dealerFields[1];
            String phone = dealerFields[2];

            Dealership dealership = new Dealership(name, address, phone);

            //boolean found = true;
            // Remaining lines: vehicles

            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\|");
                int vin = Integer.parseInt(fields[0]);
                int year = Integer.parseInt(fields[1]);
                String make = fields[2];
                String model = fields[3];
                String vehicleType = fields[4];
                String color = fields[5];
                int odometer = Integer.parseInt(fields[6]);
                double price = Double.parseDouble(fields[7]);

                //String make, String model, String vehicleType, String color, int odometer, double pric

                Vehicle allVehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(allVehicle);

            }
            return dealership;


        } catch (IOException ex) {
            System.out.println("Error loading file: " + ex.getMessage());
        }
        return null;
    }

    public void saveDealership(Dealership dealership) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
            writer.println(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());

            ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
            for (Vehicle vehicleInfo : vehicles) {
                writer.println(vehicleInfo.getVin() + "|" + vehicleInfo.getYear() + "|" + vehicleInfo.getMake() + "|" + vehicleInfo.getModel() + "|" + vehicleInfo.getVehicleType() + "|" + vehicleInfo.getColor() + "|" + vehicleInfo.getOdometer() + "|" + vehicleInfo.getPrice());
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println("Error loading file: " + ex.getMessage());
        }

    }


}




