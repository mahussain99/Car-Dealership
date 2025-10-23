package com.pluralsight;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private final ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> matches = new ArrayList<>();
        for (Vehicle listvehicle : inventory) {
            if (listvehicle.getPrice() >= min && listvehicle.getPrice() <= max) {
                matches.add(listvehicle);
            }
        }
        return matches;
    }

    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model) {
        ArrayList<Vehicle> makeAndModel = new ArrayList<>();
        for (Vehicle makeAndModelvehicle : inventory) {
            if (makeAndModelvehicle.getMake().equalsIgnoreCase(make)
                    && makeAndModelvehicle.getModel().equalsIgnoreCase(make)) {
                makeAndModel.add(makeAndModelvehicle);

            }
        }
        return makeAndModel;
    }

    ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> minAndMaxPrice = new ArrayList<>();


        return null;
    }

    ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> mixColor = new ArrayList<>();
        return null;
    }

    ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {
        ArrayList<Vehicle> VehicleMilleage = new ArrayList<>();
        return null;
    }

    ArrayList<Vehicle> getVehiclesByType(String type) {
        ArrayList<Vehicle> VehiclesType = new ArrayList<>();
        return null;
    }

    ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> AllVehicles = new ArrayList();

        return null;

    }

    public void addVehicle(Vehicle vehicle) {

    }

    public void removeVehicle(Vehicle vehicle) {

    }
}


