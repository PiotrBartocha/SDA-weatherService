package com.sda.weather.backend.location;

public class LocationRepositoryMock implements LocationRepository {

    @Override
    public Location saveLocation(Location location) {
        return location;
    }
}
