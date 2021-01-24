package backend;

import java.util.List;

public class LocationService {
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createNewLocation(String name,String latitude,String longitude,String country,String region){
        Location location = new Location(name,latitude,longitude,country,region);
        return locationRepository.saveLocation(location);
    }


}
