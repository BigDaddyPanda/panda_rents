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

    String id_vehicle, constructeur, modele, vitesse, color, seats, energy, image;
    
    public Car(String id_vehicle, String constructeur, String modele, String vitesse, String color, String seats, String energy, String image) {
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

    public static ArrayList<Car> loadAllCars() {
        ArrayList<Car> A = new ArrayList<>();
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM vehicles WHERE 1");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                A.add(new Car(
                        rs.getString("id_vehicle"),
                        rs.getString("constructeur"),
                        rs.getString("modele"),
                        rs.getString("vitesse"),
                        rs.getString("color"),
                        rs.getString("seats"),
                        rs.getString("energy"),
                        rs.getString("image")));
            }
        } catch (SQLException e) {
            System.out.println("Bad kittens not doing their jobs");
        }
        return A;
    }
    public static ArrayList<Car> loadRentedCars() {
        ArrayList<Car> A = null;
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM `vehicles` WHERE id_vehicle in (SELECT id_vehicle from rent where rent.id_vehicle=vehicles.id_vehicle )");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                A.add(new Car(
                        rs.getString("id_vehicle"),
                        rs.getString("constructeur"),
                        rs.getString("modele"),
                        rs.getString("vitesse"),
                        rs.getString("color"),
                        rs.getString("seats"),
                        rs.getString("energy"),
                        rs.getString("image")));
            }
        } catch (SQLException e) {
            System.out.println("Bad kittens not doing their jobs");
        }
        return A;
    }

}
