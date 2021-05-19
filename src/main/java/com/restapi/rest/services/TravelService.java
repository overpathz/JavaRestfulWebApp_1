package com.restapi.rest.services;

import com.restapi.rest.exceptions.NotFoundException;
import com.restapi.rest.entities.Travel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 public class TravelService {
     private static Map<Integer, Travel> travels = new HashMap<>();
     private static Integer index = 0;

     public static List<Travel> getAllTravels() {
         return new ArrayList<>(travels.values());
     }

     public static Travel getTravelDetails(Integer travelID) {
         if (!travels.containsKey(travelID)) {
             throw new NotFoundException();
         }

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
