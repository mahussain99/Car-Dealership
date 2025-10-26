package com.pluralsight;

import java.io.*;

public class DealerShipFileManage1 {

    public class dealershipFileManage {


        private final String FILE_NAME = "vehicles.csv";

        public Dealership getDealership() {
            // Dealership dealership = new Dealership("Car World", "123 Main St", "555-123-4567");
            try {

                BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

                // First line: dealership info
                String header = reader.readLine();
                if (header == null) {
                    System.out.println("File is empty.");


                    String[] dealerFields = header.split("\\|");
                    String name = dealerFields[0];
                    String address = dealerFields[1];
                    String phone = dealerFields[2];

                    Dealership dealership = new Dealership(name, address, phone);

                    //boolean found = true;
                    // Remaining lines: vehicles
                    String line = "";
                    while (reader.readLine() != null) {
                        //String make, String model, String vehicleType, String color, int odometer, double price
                        String[] fields = line.split("\\|");
                        int vin = Integer.parseInt(fields[0]);
                        int year = Integer.parseInt(fields[1]);
                        String make = fields[2];
                        String model = fields[3];
                        String vehicleType = fields[4];
                        String color = fields[5];
                        int odometer = Integer.parseInt(fields[6]);
                        double price = Integer.parseInt(fields[7]);
                        Vehicle allVehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                        dealership.addVehicle(allVehicle);

                    }

                    return dealership;
                }

            } catch(IOException ex){
                System.out.println("Error loading file: " + ex.getMessage());
            }
            return null;
        }
    }


    public void saveDealership(Dealership dealership) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));


        }catch (IOException ex) {
            System.out.println("Error loading file: " + ex.getMessage());
        }


    }


}
