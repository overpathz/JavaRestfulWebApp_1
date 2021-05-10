package com.restapi.rest.models;

 public class Travel {

     private Integer id;
     private String travelType;
     private double price;
     private String producer;

     public Travel () { }

     public Travel(Integer id, String travelType, double price, String producer) {
         this.id = id;
         this.travelType = travelType;
         this.price = price;
         this.producer = producer;
     }

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getTravelType() {
         return travelType;
     }

     public void setTravelType(String travelType) {
         this.travelType = travelType;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public String getProducer() {
         return producer;
     }

     public void setProducer(String producer) {
         this.producer = producer;
     }

     @Override
     public String toString() {
         return "Travel{" +
                 "id=" + id +
                 ", travelType='" + travelType + '\'' +
                 ", price=" + price +
                 ", producer='" + producer + '\'' +
                 '}';
     }
 }
