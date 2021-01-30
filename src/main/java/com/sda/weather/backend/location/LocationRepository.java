package com.sda.weather.backend.location;

import java.util.List;

public interface LocationRepository {

    Location saveLocation(Location location);

    List<Location> displayAllLocations();
}
