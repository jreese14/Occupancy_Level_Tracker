package com.example.occupancyleveltracker;

public class OccupancyInfo {
    String BusinessName;
    String openClose;
    String Notes;
    String occupancyLevel;

    public OccupancyInfo(){

    }

    public OccupancyInfo(String businessName, String openClose, String notes, String occupancyLevel) {
        BusinessName = businessName;
        this.openClose = openClose;
        Notes = notes;
        this.occupancyLevel = occupancyLevel;
    }


    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String businessName) {
        BusinessName = businessName;
    }

    public String getOpenClose() {
        return openClose;
    }

    public void setOpenClose(String openClose) {
        this.openClose = openClose;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getOccupancyLevel() {
        return occupancyLevel;
    }

    public void setOccupancyLevel(String occupancyLevel) {
        this.occupancyLevel = occupancyLevel;
    }
}
