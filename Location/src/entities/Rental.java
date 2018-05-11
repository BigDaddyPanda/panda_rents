/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author ky94
 */
public class Rental {

    String id_person, id_vehicle;
    String start, end;
    float price, fees;

    public Rental(String id_person, String id_vehicle, String start, String end, float price, float fees) {
        this.id_person = id_person;
        this.id_vehicle = id_vehicle;
        this.start = start;
        this.end = end;
        this.price = price;
        this.fees = fees;
    }

    public void setId_person(String id_person) {
        this.id_person = id_person;
    }

    public void setId_vehicle(String id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    public String getId_person() {
        return id_person;
    }

    public String getId_vehicle() {
        return id_vehicle;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public float getPrice() {
        return price;
    }

    public float getFees() {
        return fees;
    }

}
