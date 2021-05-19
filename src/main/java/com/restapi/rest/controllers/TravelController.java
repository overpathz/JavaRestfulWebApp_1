package com.restapi.rest.controllers;

import com.restapi.rest.entities.Travel;
import com.restapi.rest.services.TravelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/travels")
 public class TravelController {

     @GetMapping()
     public List<Travel> getAllTravels() {
        return TravelService.getAllTravels();
    }

     @GetMapping("/{travelID}")
     public Travel getTravelDetails(@PathVariable Integer travelID) {
        return TravelService.getTravelDetails(travelID);
    }

     @PostMapping("/add")
     public Travel addTravel(@RequestBody Travel travel) {
        return TravelService.addTravel(travel);
    }

     @PutMapping("/update/{travelID}")
     public Travel updateTravel(@PathVariable Integer travelID, @RequestBody Travel travel) {
         return TravelService.updateTravel(travelID, travel);
     }

     @DeleteMapping("/delete/{travelID}")
     public Travel deleteTravel(@PathVariable Integer travelID) {
        return TravelService.deleteTravel(travelID);
    }

}
