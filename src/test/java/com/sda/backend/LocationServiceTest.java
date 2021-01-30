package com.sda.backend;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class LocationServiceTest {

    private static LocationService locationService;

    @BeforeAll
    static void setUp() {
        LocationRepository locationRepository = new LocationRepositoryMock();
        locationService = new LocationService(locationRepository);
    }

    @Test
    void createNewLocation_createsNewLocation() {
        // when
        Location result = locationService.createNewLocation("Warszawa", "20", "30", "Polska", "Mazowieckie");

        // then
        assertThat(result).isNotNull();
        assertThat(result.getName()).isEqualTo("Warszawa");
        assertThat(result.getRegion()).isEqualTo("Mazowieckie");
        assertThat(result.getCountry()).isEqualTo("Polska");
        assertThat(result.getLongitude()).isEqualTo("30");
        assertThat(result.getLatitude()).isEqualTo("20");
    }

    @Test
    void createNewLocation_whenRegionIsNull_createsNewLocation() {
        // when
        Location result = locationService.createNewLocation("Warszawa", "20", "30", "Polska", null);

        // then
        assertThat(result).isNotNull();
        assertThat(result.getName()).isEqualTo("Warszawa");
        assertThat(result.getRegion()).isNull();
        assertThat(result.getCountry()).isEqualTo("Polska");
        assertThat(result.getLongitude()).isEqualTo("30");
        assertThat(result.getLatitude()).isEqualTo("20");
    }

    @Test
    void createNewLocation_whenNameIsNull_throwsException() {
        // when
        Throwable result = catchThrowable(() -> locationService.createNewLocation(null, "20", "30", "Polska", "Mazowieckie"));

        // then
        assertThat(result).isInstanceOf(RuntimeException.class);
    }
}
