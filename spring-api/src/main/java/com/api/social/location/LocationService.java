package com.api.social.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    public LocationRepository locationRepository;

    public List<Location> getLocations() {
        List<Location> locations= new ArrayList<>();
        locationRepository.findAll().forEach(locations::add);
        return locations;
    }

    public Optional<Location> getLocation(String id) {
        return locationRepository.findById(id);
    }

    public void addLocation(Location location) {
        locationRepository.save(location);
    }
    public void updateLocation(String id, Location location) {
        Optional<Location> l = locationRepository.findById(id);
        if(l.equals(location)) {

            locationRepository.save(location);
        }
        locationRepository.save(location);

    }
    public void deleteLocation(String id) {

        locationRepository.deleteById(id);
    }

    public List<Location> getLocationsByCity(String city){
        List<Location> locations = new ArrayList<>();
        locationRepository.findByCity(city).forEach(locations::add);
        return locations;
    }
}
