package com.sda.weather.backend.location;

import lombok.RequiredArgsConstructor;

import java.util.List;

import java.util.List;

@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    public String createNewLocation(String name, String latitude, String longitude, String country, String region) {
        Location newLocation = locationService.createNewLocation(name, latitude, longitude, country, region);
        return newLocation.toString();
    }

    public String displayAllLocations(){
        List<Location> locations = locationService.displayAllLocations();
        return locations.toString();
    }
}
