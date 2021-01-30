package com.sda.backend;

public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    public String createNewLocation(String name, String latitude, String longitude, String country, String region) {
        Location newLocation = locationService.createNewLocation(name, latitude, longitude, country, region);
        return newLocation.toString();
    }

}
