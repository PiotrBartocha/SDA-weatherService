package com.sda.weather.backend.location;

public class LocationService {
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    Location createNewLocation(String name, String latitude, String longitude, String country, String region) {

        float latitudeFloat;
        float longitudeFloat;
        try {
            latitudeFloat = Float.parseFloat(latitude);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Wrong latitude value format: " + latitude);
        }
        if (latitudeFloat > 90) {
            throw new RuntimeException("Latitude cannot be higher than 90!");
        }

        try {
            longitudeFloat = Float.parseFloat(longitude);

        } catch (NumberFormatException e) {
            throw new RuntimeException("Wrong longitude value format: " + longitude);
        }
        if (longitudeFloat > 180) {
            throw new RuntimeException("Longitude cannot be higher than 180!");
        }
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Name cannot be empty!");
        }
        if (country ==null || country.isBlank()) {
            throw new RuntimeException("Country name cannot be empty");
        }
        if (name.length() > 30) {
            throw new RuntimeException("City name cannot be longer than 20 characters!");
        }
        if (country.length() > 30) {
            throw new RuntimeException("Country name cannot be longer than 20 characters!");
        }

        Location location = new Location(name, latitude, longitude, country, region);
        return locationRepository.saveLocation(location);
    }
}
