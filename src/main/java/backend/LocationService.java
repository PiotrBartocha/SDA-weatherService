package backend;

public class LocationService {
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Location createNewLocation(String name, String latitude, String longitude, String country, String region) {
        // todo do a validation
        float latitudeFloat;

        try {
            latitudeFloat = Float.parseFloat(latitude);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Zły format wartości latitude: " + latitude);
        }

        if (latitudeFloat > 90) {
            throw new RuntimeException("Wartość latitude nie powinna być większa niż 90");
        }

        Location location = new Location(name, latitude, longitude, country, region);
        return locationRepository.saveLocation(location);
    }
}
