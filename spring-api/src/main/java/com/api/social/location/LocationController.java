package com.api.social.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;
    @RequestMapping(value = "/locations")
    public String getAllLocations(Model model)
    {
        model.addAttribute("locations", locationService.getLocations());
        return "locations";
    }

    @RequestMapping(value = "/locations/{id}")
    public Optional<Location> getLocation(@PathVariable String id) {
        return locationService.getLocation(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/locations")
    public void addLocation(@RequestBody Location location) {
        locationService.addLocation(location);
    }

    @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location, @PathVariable String id) {

        locationService.updateLocation(id, location);

    }
    @RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable String id) {
        locationService.deleteLocation(id);
    }

    @RequestMapping(value = "/locations/city/{city}")
    public List<Location> getLocationByCity(@PathVariable String city) {
        return locationService.getLocationsByCity(city);
    }
}