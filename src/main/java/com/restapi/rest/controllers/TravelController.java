package com.restapi.rest.controllers;

import com.restapi.rest.models.Travel;
import com.restapi.rest.services.TravelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
 public class TravelController {

     @GetMapping("/travels")
     public List<Travel> getAllTravels() {
        return TravelService.getAllTravels();
    }

     @GetMapping("/travel/{travelID}")
     public Travel getTravelDetails(@PathVariable Integer travelID) {
        return TravelService.getTravelDetails(travelID);
    }

     @PostMapping("/addTravel")
     public Travel addTravel(@RequestBody Travel travel) {
        return TravelService.addTravel(travel);
    }

     @PutMapping("/updateTravel/{travelID}")
     public Travel updateTravel(@PathVariable Integer travelID, @RequestBody Travel travel) {
         return TravelService.updateTravel(travelID, travel);
     }

     @DeleteMapping("/deleteTravel/{travelID}")
     public Travel deleteTravel(@PathVariable Integer travelID) {
        return TravelService.deleteTravel(travelID);
    }

}
