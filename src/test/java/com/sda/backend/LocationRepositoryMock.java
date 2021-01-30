package com.sda.backend;

public class LocationRepositoryMock implements LocationRepository{

    @Override
    public Location saveLocation(Location location) {
        return location;
    }
}
