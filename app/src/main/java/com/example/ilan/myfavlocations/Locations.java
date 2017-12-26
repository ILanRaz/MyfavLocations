package com.example.ilan.myfavlocations;

import java.io.Serializable;

public class Locations implements Serializable {

    private String locationName, locationArea;
    private int locationImageResourceId;

    public Locations(String locationName, String locationArea, int locationImageResourceId) {
        this.locationName = locationName;
        this.locationArea = locationArea;
        this.locationImageResourceId = locationImageResourceId;
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public int getLocationImageResourceId() {
        return locationImageResourceId;
    }
}
