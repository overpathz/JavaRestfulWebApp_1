package com.restapi.rest.services;

import com.restapi.rest.exceptions.NotFoundException;
import com.restapi.rest.models.Travel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class TravelService {
     private static Map<Integer, Travel> travels = new HashMap<>();
     private static Integer index = 2;

     static {
         Travel travel1 = new Travel(1, "Sport", 200, "Eco");
         Travel travel2 = new Travel(2, "Sport", 350, "Super");

         travels.put(1, travel1);
         travels.put(2, travel2);
     }

     public static List<Travel> getAllTravels() {
         return new ArrayList<>(travels.values());
     }

     public static Travel getTravelDetails(Integer travelID) {
        return travels.get(travelID);
     }

     public static Travel addTravel(Travel travel) {
         index += 1;
         travel.setId(index);
         travels.put(index, travel);
         return travel;
     }

     public static Travel updateTravel(Integer travelID, Travel travel) {
         Travel travelPast = travels.get(travelID);

         if (!travels.containsKey(travelID)) {
             throw new NotFoundException();
         }
         travel.setId(travelID);
         travels.put(travelID, travel);
         return travelPast;
     }

     public static Travel deleteTravel(Integer travelID) {
         return travels.remove(travelID);
     }
 }
