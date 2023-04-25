/*
* File: Ingatlanok.java
* Author: Maximilian Barabas
* Copyright: M B 
* Group: Szoft 2 N
* Date: 2023-04-19
* Github: https://github.com/maximilianbarabas
* Licenc: GNU GPL
*/


package models;

public class Properties {
    String city;
    String address;
    String size;
    Double price;
    
    public Properties(String city, String address, String size, Double price) {
        this.city = city;
        this.address = address;
        this.size = size;
        this.price = price;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
