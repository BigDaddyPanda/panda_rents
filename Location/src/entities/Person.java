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
import java.sql.Statement;
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import logic.Creation;

/**
 *
 * @author ky94
 */
public class Person {

    String id_person, name, fname, phone, username, password, image;
    SimpleStringProperty FullName;
    SimpleStringProperty Adminship;
    String birth;
    boolean isAdmin;

    public Person(String id_person, String username, String password) {
        this.id_person = id_person;
        this.username = username;
        this.password = password;
        this.name = "Foulen";
        this.fname = "Foulen";
        this.phone = "00-000-000";
        this.image = "logo.png";
        this.birth = "2000-01-01";
        this.isAdmin = false;
    }

    public Person(String id_person, String name, String fname, String phone, String username, String password, String image, String birth, boolean isAdmin) {
        this.id_person = id_person;
        this.name = name;
        this.fname = fname;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.image = image;
        this.birth = birth;
        this.isAdmin = isAdmin;
        FullName = new SimpleStringProperty(name + " " + fname);
        Adminship = new SimpleStringProperty("C");
        if (isAdmin) {
            Adminship = new SimpleStringProperty("A");
        }
    }

    @Override
    public String toString() {
        return "Person{" + "id_person=" + id_person + ", name=" + name + ", fname=" + fname + ", phone=" + phone + ", username=" + username + ", password=" + password + ", image=" + image + ", birth=" + birth + ", isAdmin=" + isAdmin + '}';
    }

    /*
    
    INSERT INTO `persons` (`id_person`, `name`, `fname`, `phone`,
    `birth`, `username`, `password`, `image`, `isAdmin`) 
    VALUES ('', '', '', '', '', '', '', '', '')
     */
    public static boolean signup(Person p) {
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM persons "
                    + "WHERE id_person = '" + p.getId_person() + "' "
                    + "OR username= '" + p.getUsername() + "'");
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Bad kitten not doing well at signup");
            e.printStackTrace();
        }
        if (Creation.addPerson(p)) {
            return true;
        }
        return false;
    }

    public static boolean authentificate(String login, String password) {
        try {
            PreparedStatement st = db_cnx.connect().prepareStatement("SELECT * FROM persons WHERE username = '" + login + "' AND password= '" + password + "'");
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Auth.USERNAME = rs.getString("name") + " " + rs.getString("fname");
                Auth.USERIMAGE = rs.getString("image");
                Auth.ISADMIN = rs.getBoolean("isadmin");
                System.out.println(Auth.USERNAME);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Bad kitten not doing well at authentificate");
            e.printStackTrace();
        }
        return false;
    }

    public String getFullName() {
        return FullName.get();
    }

    public void setFullName(String FullName) {
        this.FullName = new SimpleStringProperty(FullName);
    }

    public String getAdminship() {
        return Adminship.get();
    }

    public void setAdminship(String Adminship) {
        this.Adminship = new SimpleStringProperty(Adminship);
    }

    public String getId_person() {
        return id_person;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getImage() {
        return image;
    }

    public String getBirth() {
        return birth;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setId_person(String id_person) {
        this.id_person = id_person;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
