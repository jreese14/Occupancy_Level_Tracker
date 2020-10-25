package com.example.occupancyleveltracker;

public class OccupancyInfo {
    String hospitalName;
    String freeTesting;
    String address;
    String numberOfBeds;
    String email;

    public OccupancyInfo(){

    }

    public OccupancyInfo(String email, String hospitalName, String address, String numberOfBeds, String freeTesting) {
        this.email = email;
        this.hospitalName = hospitalName;
        this.freeTesting = freeTesting;
        this.address = address;
        this.numberOfBeds = numberOfBeds;
    }

    public String getEmail() {
        return email;
    }


    public String gethospitalName() {
        return hospitalName;
    }

    public void sethospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getfreeTesting() {
        return freeTesting;
    }

    public void setfreeTesting(String freeTesting) {
        this.freeTesting = freeTesting;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getnumberOfBeds() {
        return numberOfBeds;
    }

    public void setnumberOfBeds(String numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
}
