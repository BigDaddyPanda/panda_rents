/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import dbconnexion.Auth;
import dbconnexion.db_cnx;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ky94
 */
public class Car {

    String id_vehicle, constructeur, modele, color, energy, image;
    int vitesse, seats;

    public Car(String id_vehicle, String constructeur, String modele, int vitesse, String color, int seats, String energy, String image) {
        this.id_vehicle = id_vehicle;
        this.constructeur = constructeur;
        this.modele = modele;
        this.vitesse = vitesse;
        this.color = color;
        this.seats = seats;
        this.energy = energy;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Car{" + "id_vehicle=" + id_vehicle + ", constructeur=" + constructeur + ", modele=" + modele + ", vitesse=" + vitesse + ", color=" + color + ", seats=" + seats + ", energy=" + energy + ", image=" + image + '}';
    }


    public String getId_vehicle() {
        return id_vehicle;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public String getModele() {
        return modele;
    }

    public String getColor() {
        return color;
    }

    public String getEnergy() {
        return energy;
    }

    public String getImage() {
        return image;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getSeats() {
        return seats;
    }

    public void setId_vehicle(String id_vehicle) {
        this.id_vehicle = id_vehicle;
    }

    public void setConstructeur(String constructeur) {
        this.constructeur = constructeur;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
