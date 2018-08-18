package com.example.android.delhitourguiid;

public class Location {
    private String locationname;
    private String locationDetails;
    private int locationImageR;

    Location(String locationname, String locationDetails, int locationImageR) {
        this.locationname = locationname;
        this.locationDetails = locationDetails;
        this.locationImageR = locationImageR;


    }

    public String getLocationname() {
        return locationname;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public int getLocationImageR() {
        return locationImageR;
    }
}

