package com.sda.weather.backend.location;

import java.util.Collections;
import java.util.List;

public class LocationRepositoryMock implements LocationRepository {

    @Override
    public Location saveLocation(Location location) {
        return location;
    }

    @Override
    public List<Location> displayAllLocations() {
        return Collections.emptyList();
    }
}

