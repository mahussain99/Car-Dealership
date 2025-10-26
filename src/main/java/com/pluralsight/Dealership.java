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
        ArrayList<Vehicle> matchesPrice = new ArrayList<>();
        for (Vehicle listVehicle : inventory) {
            if (listVehicle.getPrice() >= min && listVehicle.getPrice() <= max) {
                matchesPrice.add(listVehicle);
            }
        }
        return matchesPrice;
    }

    public ArrayList<Vehicle> getVehicleByMakeModel(String make, String model) {
        ArrayList<Vehicle> matchMakeAndModel = new ArrayList<>();
        for (Vehicle makeAndModelvehicle : inventory) {
            if (makeAndModelvehicle.getMake().equalsIgnoreCase(make)
                    && makeAndModelvehicle.getModel().equalsIgnoreCase(model)) {
                matchMakeAndModel.add(makeAndModelvehicle);

            }
        }
        return matchMakeAndModel;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min) {
        ArrayList<Vehicle> matchingVehicleYear = new ArrayList<>();
        for (Vehicle allvehicle : inventory) {
            if (allvehicle.getYear() >= min && allvehicle.getYear() <= min) {
                matchingVehicleYear.add(allvehicle);

            }
        }
        return matchingVehicleYear;
    }

    public  ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> matchColor = new ArrayList<>();

        for (Vehicle colorVehicle : inventory) {
            if (colorVehicle.getColor().equalsIgnoreCase(color)){
                matchColor.add(colorVehicle);
        }

      }
        return matchColor;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int minMileage) {
        ArrayList<Vehicle> matchVehicleMileage = new ArrayList<>();
        for (Vehicle mileagevehicle : inventory) {
            if ( mileagevehicle.getOdometer() >= min && mileagevehicle.getOdometer() <= min ){
                matchVehicleMileage.add(mileagevehicle);
            }
        }
        return matchVehicleMileage;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type) {
        ArrayList<Vehicle> matchVehiclesType = new ArrayList<>();
        for (Vehicle allTypevehicle : inventory) {
            if (allTypevehicle.getVehicleType().equalsIgnoreCase(type)){
                matchVehiclesType.add(allTypevehicle);
            }
        }
        
        return matchVehiclesType;
    }

    public  ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> matchAllVehicles = new ArrayList();
        for (Vehicle vehicle : inventory) {
            matchAllVehicles.add(vehicle);
        }
        return matchAllVehicles;
    }

    public void addVehicle(Vehicle vehicle) {
    inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
    inventory.remove(vehicle);
    }
}


